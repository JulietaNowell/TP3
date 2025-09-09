/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.intro.poo;

/**
 *
 * @author jnowell
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un libro
        Libro libro1 = new Libro("Dune","Herbert",1965);
        
        System.out.println("Estado inicial:");
        libro1.mostrarInfo();
        
        //Validaciones
        System.out.println("\nAnio invalido (3000)");   
        libro1.setAnioPublicacion(3000);
        
        System.out.println("\nEstado luego del ingreso invalido");
        libro1.mostrarInfo();
        
        System.out.println("\nAnio valido");
        libro1.setAnioPublicacion(2000);
        
        System.out.println("\nEstado luego del ingreso valido");
        libro1.mostrarInfo();
    }
    
}
