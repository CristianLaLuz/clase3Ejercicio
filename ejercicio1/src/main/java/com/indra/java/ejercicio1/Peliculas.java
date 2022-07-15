/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indra.java.ejercicio1;

/**
 *
 * @author cpenar
 */
public class Peliculas {
    
    int codigo;
    String titulo;
    String genero;
    double rating;
    String restriciones;
    
    public Peliculas(int codigo, String titulo, String genero, double rating, String resticiones) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.rating = rating;
        this.restriciones = resticiones;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setRestriciones(String restriciones) {
        this.restriciones = restriciones;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getRating() {
        return rating;
    }

    public String getRestriciones() {
        return restriciones;
    }
    
}
