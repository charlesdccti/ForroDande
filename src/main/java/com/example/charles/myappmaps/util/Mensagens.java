package com.example.charles.myappmaps.util;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by EdivaGt on 20/05/2016.
 */
public class Mensagens {



    public static void MensagemTa(String mens , Context context){

        Toast.makeText(context, mens, Toast.LENGTH_LONG).show();
        Log.i("Tela", "Mensagem");
    }

    public static void MensagemErro(String mens , Context context, String erro){

        Toast.makeText(context, mens, Toast.LENGTH_LONG).show();
        Log.i("Erro", erro);
    }

}
