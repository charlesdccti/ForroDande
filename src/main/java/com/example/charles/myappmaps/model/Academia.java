package com.example.charles.myappmaps.model;

import java.io.Serializable;

/**
 * Created by Charles on 18/05/2016.
 */
public class Academia implements Serializable {

    private  int codigo;
    private String nome;
    private String telefone;
    private boolean favorito;
    public Usuario usuario;



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public String toString(){

        return this.getNome();
    }

}
