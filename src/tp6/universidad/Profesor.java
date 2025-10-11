/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.universidad;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author kary
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String nombre, String especialidad) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
       
    
    public void mostrarInfo() {
        System.out.println("Profesor ID: " + id + ", Nombre: " + nombre + ", Especialidad: " + especialidad + ", Cursos: " + (cursos.size() > 0 ? cursos.size() + " cursos." : " no tiene."));
    }
    
    public void agregarCurso(Curso c) {
        // Agrega el curso a su lista si no está y sincroniza el lado del curso
        int i = 0;
        while(i < this.cursos.size() && !this.cursos.get(i).getCodigo().equalsIgnoreCase(c.getCodigo())){
            i++;
        }
        
        if (i >= this.cursos.size()) {
            this.cursos.add(c);
        }
        
        if(c.getProfesor() != null && !c.getProfesor().id.equals(this.id)) {
            c.setProfesor(this);
        }
    }
    
    public void eliminarCurso(Curso c) {
        // Quita el curso y sincroniza el lado del curso (dejar profesor en null si corresponde)
        this.cursos.remove(c);
        
        if(c.getProfesor() != null && !c.getProfesor().id.equals(this.id)) {
            c.setProfesor(this);
        }
    }
    
    public void listarCursos() {
        // Muestra códigos y nombres
        for (Curso c : cursos) {
            System.out.println("Curso: " + c.getNombre() + ", Codigo: " + c.getCodigo());
        }
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
