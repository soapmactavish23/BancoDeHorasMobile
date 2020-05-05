package com.example.bancodehoras.model;

import android.content.ContentValues;

import java.io.Serializable;

public class Funcionario implements Serializable {

    private Long id;
    private String nome;
    private int horas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

}