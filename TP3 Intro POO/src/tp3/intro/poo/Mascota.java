/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.intro.poo;

/**
 *
 * @author jnowell
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
public Mascota(String nombre, String especie, int edad) {
    this.nombre = nombre;
    this.especie = especie;
    this.edad = edad; 
}

    // Getters
    public String getNombre() { return nombre; }
    public String getEspecie() { return especie; }
    public int getEdad() { return edad; }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + "anios");
    }
    
    // Métodos cumplir años
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido anos. Ahora tiene " + edad + "anios");
    }
}
