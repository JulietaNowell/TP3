/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.intro.poo;

/**
 *
 * @author jnowell
 */
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Apollo", 50);

        System.out.println("Estado inicial:");
        nave.mostrarEstado();

        System.out.println("\nIntentar avanzar sin despegar");
        nave.avanzar(10);

        System.out.println("\nIntentar despegar");
        nave.despegar();

        System.out.println("\nIntentar avanzar 30 km con combustible actual");
        nave.avanzar(30);

        System.out.println("\nRecargar combustible en 40");
        nave.recargarCombustible(40);

        System.out.println("\nAvanzar 20 km despues de recargar");
        nave.avanzar(20);

        System.out.println("\nEstado final:");
        nave.mostrarEstado();
    }
}