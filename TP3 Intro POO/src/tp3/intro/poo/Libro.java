/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.intro.poo;

/**
 *
 * @author jnowell
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
public Libro(String titulo, String autor, int anioPublicacion) {
    this.titulo = titulo;
    this.autor = autor;
    setAnioPublicacion(anioPublicacion); //usa la validacion     
}

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    //Setter con validacion
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Anio de publiacion invalido " + anioPublicacion);
        }
    }
    
    //Mostrar la informacion
    public void mostrarInfo() {
        System.out.println("Titulo: " +titulo);
        System.out.println("Autor: " +autor);
        System.out.println("Anio de publicacion: " +anioPublicacion);
    }
}