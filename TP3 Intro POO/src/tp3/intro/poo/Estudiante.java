package tp3.intro.poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jnowell
 */
public class Estudiante {
    private static final double MIN_CAL = 0.0;
    private static final double MAX_CAL = 10.0;
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.curso = curso;
    setCalificacion(calificacion); // usamos el setter para validar
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCurso() { return curso; }
    public double getCalificacion() { return calificacion; }
    
    // Setter con validación (encapsulamiento)
    public void setCalificacion(double calificacion) {
        if (calificacion < MIN_CAL) {
            this.calificacion = MIN_CAL;
        } else if (calificacion > MAX_CAL) {
            this.calificacion = MAX_CAL;
        } else {
            this.calificacion = calificacion;
        }
    }
    
    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.printf("Calificacion: %.2f%n", calificacion); //2 decimales
    }
    
    // Métodos solicitados
    public void subirCalificacion(double puntos) {
        if (puntos < 0) {
            System.out.println("Puntos invalidos (debe ser positivo).");
            return;
        }
        setCalificacion(this.calificacion + puntos);
    }

    public void bajarCalificacion(double puntos) {
        if (puntos < 0) {
            System.out.println("Puntos invalidos (debe ser positivo).");
            return;
        }
        setCalificacion(this.calificacion - puntos);
    }
}
