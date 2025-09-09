/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.intro.poo;

/**
 *
 * @author jnowell
 */
public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
public Gallina(String idGallina, int edad, int huevosPuestos) {
    this.idGallina = idGallina;
    this.edad = edad; 
    this.huevosPuestos=huevosPuestos;    
}

//Getters
    public String getidGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    

//Setter con validacion
public void envejecer() {
        edad++;
        System.out.println(idGallina + " tiene " + edad + " anios");
}

public void ponerHuevo() {
        huevosPuestos++;
        System.out.println(idGallina + " puso " + huevosPuestos + " huevos");
}
    
 //Mostrar estado
    public void mostrarEstado() {
        System.out.println("idGallina: " +idGallina);
        System.out.println("Edad: " +edad);
        System.out.println("Huevos puestos: " +huevosPuestos);
    }
}