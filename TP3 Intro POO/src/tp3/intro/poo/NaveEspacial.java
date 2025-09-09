/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.intro.poo;

/**
 *
 * @author jnowell
 */
public class NaveEspacial {
private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100; // límite máximo
    private boolean enVuelo;

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, MAX_COMBUSTIBLE);
        this.enVuelo = false;
    }

    // Métodos requeridos
    public void despegar() {
        if (!enVuelo && combustible >= 10) {
            enVuelo = true;
            combustible -= 10; // costo de despegue
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else if (enVuelo) {
            System.out.println(nombre + " ya está en vuelo.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2; // por ejemplo, 2 unidades de combustible por distancia
        if (!enVuelo) {
            System.out.println("La nave aun no ha despegado.");
            return;
        }
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzo " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad de recarga debe ser positiva.");
            return;
        }
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("Tanque lleno al maximo (" + MAX_COMBUSTIBLE + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible. Total: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
        System.out.println("En vuelo: " + (enVuelo ? "Si" : "No"));
    }
}

    


    
