/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.intro.poo;

/**
 *
 * @author jnowell
 */
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear una mascota
        Mascota mascota1 = new Mascota("Pantera","Gato",3);

        System.out.println("Estado inicial:");
        mascota1.mostrarInfo();

        System.out.println("\nEstado despues de cumpliar anios");
        mascota1.cumplirAnios(); //aumenta la edad
        mascota1.mostrarInfo(); //muesta el nuevo estado
    }
    
}
