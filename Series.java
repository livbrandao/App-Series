package com.example.appseries;

import java.io.Serializable;

public class Series implements Serializable {
    private String titulo;
    private  int numTemp;
    private String sinopse;
    private int imagem;
    private String nomeImg;

    //CONSTRUTOR

    public Series(String titulo, int numTemp, String sinopse, int imagem, String nomeImg) {
        this.titulo = titulo;
        this.numTemp = numTemp;
        this.sinopse = sinopse;
        this.imagem = imagem;
        this.nomeImg = nomeImg;
    }

    //get e set


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemp() {
        return numTemp;
    }

    public void setNumTemp(int numTemp) {
        this.numTemp = numTemp;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNomeImg() {
        return nomeImg;
    }

    public void setNomeImg(String nomeImg) {
        this.nomeImg = nomeImg;
    }
}
