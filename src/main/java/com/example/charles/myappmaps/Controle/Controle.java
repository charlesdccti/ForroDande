package com.example.charles.myappmaps.Controle;

import android.content.ContentValues;
import android.content.Context;
import android.widget.Toast;

import com.example.charles.myappmaps.model.Academia;
import com.example.charles.myappmaps.model.Usuario;
import com.example.charles.myappmaps.services.DB;
import com.example.charles.myappmaps.util.SQL;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EdivaGt on 18/05/2016.
 */
public class Controle {

    Usuario usuario;
    Academia academia;


 //controle para cadastro de usuario
    public void cadastraUsuario(Usuario usuario, Context tela){

        ContentValues obj = new ContentValues();
        obj.put("ID_USUARIO", usuario.getCodigo());
        obj.put("NOME", usuario.getNome());
        obj.put("CELULAR", usuario.getCelular());
        obj.put("EMAIL", usuario.getEmail());
        obj.put("SENHA", usuario.getSenha());

        if(DB.getInstance(tela).insert(SQL.TABLE_USUARIO, obj)==1){
            Toast.makeText(tela, "Cadastro de usuario OK!", Toast.LENGTH_LONG).show();
        }else
            Toast.makeText(tela, "Usuario não cadastrado!", Toast.LENGTH_LONG).show();
    }


    public boolean loginUsuario(Usuario usuario_, Context context){



        Usuario usuario= DB.getInstance(context).getUsuario(usuario_.getEmail(), usuario_.getSenha());

       if(usuario!=null) return true;

        Toast.makeText(context, "Erro de acesso ao usuario", Toast.LENGTH_LONG).show();
        return false;
    }


    //Controle para litar academinas
    public List<Academia> listaAcademias(Context context){

         ArrayList<Academia> listAcademia;

         listAcademia=DB.getInstance(context).getAllAcademias();

         return  listAcademia;
    }

}
