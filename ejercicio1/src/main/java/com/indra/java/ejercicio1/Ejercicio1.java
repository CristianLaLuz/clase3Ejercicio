/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.indra.java.ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author cpenar
 */
public class Ejercicio1 {
    
    static ArrayList<Peliculas> listaPeliculas = new ArrayList();

    public static void main(String[] args) {
        System.out.println("------------\nCreando peliculas y mostandolas \n ------------");
        crearPeliculas();
        recorerArry();
        System.out.println("------------\nCambiando titulo y mostandolas \n ------------");
        cambiarNombre();
        recorerArry();
        System.out.println("------------\nMostando peliculas de terror \n ------------");
        mostrarSolo("Terror");
    }
    
    private static void crearPeliculas() {
        Peliculas pe1 = new Peliculas(1,"Hola1","Terror",3.22,"mayor de 16");
        Peliculas pe2 = new Peliculas(1,"Hola2","Terror",2.15,"mayor de 18");
        Peliculas pe3 = new Peliculas(1,"Hola3","Accion",4.79,"mayor de 12");
        Peliculas pe4 = new Peliculas(1,"Hola4","Comedia",1.52,"mayor de 16");
        Peliculas pe5 = new Peliculas(1,"Hola5","Misterio",4.76,"mayor de 6");
        
        listaPeliculas.add(pe1);
        listaPeliculas.add(pe2);
        listaPeliculas.add(pe3);
        listaPeliculas.add(pe4);
        listaPeliculas.add(pe5);
    }
    
    //mostrar titulo genero rating
    private static void recorerArry() {
        for (Peliculas lp : listaPeliculas) {
            System.out.println("Titulo: " + lp.getTitulo() + " Genero: " + lp.getGenero() + " Rating: " + lp.getRating());
        }
    }
    
    //cambiar nombre, rating
    private static void cambiarNombre() {
        listaPeliculas.get(2).setTitulo("titulo cambiado");
        listaPeliculas.get(2).setRating(1.11);
        
        listaPeliculas.get(3).setTitulo("cambiado titulo");
        listaPeliculas.get(3).setRating(2.11);
        
    }
    
    //mostrar solo terror
    private static void mostrarSolo(String genero) {
        for (Peliculas lp : listaPeliculas) {
            if (lp.getGenero().equals("Terror")) {
                 System.out.println("Titulo: " + lp.getTitulo() + " Genero: " + lp.getGenero() + " Rating: " + lp.getRating());
            }
        }
    }
    
    
    
    
}
