/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.intro.poo;

/**
 *
 * @author jnowell
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante est = new Estudiante("Maria", "Gonzalez", "Programacion II", 7.5);

        System.out.println("Estado inicial:");
        est.mostrarInfo();

        System.out.println("\nSubir calificacion en 1.3");
        est.subirCalificacion(1.3);
        est.mostrarInfo();

        System.out.println("\nBajar calificacion en 2.0");
        est.bajarCalificacion(2.0);
        est.mostrarInfo();
        
    }
    
}
