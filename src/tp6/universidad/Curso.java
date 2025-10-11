/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.universidad;

/**
 *
 * @author kary
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
    }   
    
    
    public void mostrarInfo() {
        System.out.println("Curso Codigo: " + codigo + ", Nombre: " + nombre + ", Profesor: " + (profesor != null ? profesor.getNombre() : "sin asignar"));
    }

    public void setProfesor(Profesor p) {
        if (this.profesor.equals(p)) {
            System.out.println("El profesor ya esta asignado al curso.");
            return;
        }
        else if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        
        this.profesor = p ;
        
        if (p != null)
            p.agregarCurso(this);
    }

    public String getCodigo() {
        return codigo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getNombre() {
        return nombre;
    }
}
