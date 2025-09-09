
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.intro.poo;

/**
 *
 * @author jnowell
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear dos gallinas
        Gallina gallina1 = new Gallina("A1",1,1);
        Gallina gallina2 = new Gallina("A2",2,2);
                
        System.out.println("Estado inicial:");
        gallina1.mostrarEstado();
        System.out.println("\n");
        gallina2.mostrarEstado();
        
        System.out.println("\nEstado despues de envejecer");
        gallina1.envejecer();//aumenta la edad
        gallina2.envejecer();//aumenta la edad
        
        System.out.println("\nEstado despues de poner huevos");
        gallina1.ponerHuevo();//aumenta la edad
        gallina2.ponerHuevo();//aumenta la edad
        
        System.out.println("\nEstado final");
        gallina1.mostrarEstado();//muesta el nuevo estado
        gallina2.mostrarEstado(); //muesta el nuevo estado
    
    }
    
}
