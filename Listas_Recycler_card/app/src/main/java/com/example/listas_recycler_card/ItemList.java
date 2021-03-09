package com.example.listas_recycler_card;

import androidx.appcompat.app.AppCompatActivity;

public class ItemList extends AppCompatActivity {
    private String titulo;
    private String info;
    private int foto;

    public ItemList(String titulo, String info, int foto) {
        this.titulo = titulo;
        this.info = info;
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
