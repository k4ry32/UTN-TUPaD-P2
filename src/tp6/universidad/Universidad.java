/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.universidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kary
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }
    
    public void agregarCurso(Curso c) {
        cursos.add(c);
        c.getProfesor().agregarCurso(c);
    }
    
    public Curso asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profe = this.buscarProfesorPorId(idProfesor);
        
        if (profe == null) {
            System.out.println("No se encontro un profesor con ese ID");
            return null;
        }
        
        Curso curso = this.buscarCursoPorCodigo(codigoCurso);
        
        if (curso == null) {
            System.out.println("No se encontro un curso con ese codigo");
            return null;
        }
                
        curso.setProfesor(profe);
        
        return curso;
    }
    
    public void listarProfesores() {
        // Lista profesores y sus cursos
        System.out.println("\nProfesores disponibles:");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores aun.");            
        }
        else {
            for (int i = 0; i < profesores.size(); i++) {
                System.out.print((i+1) + ". ");
                profesores.get(i).mostrarInfo();
                List cursosProfe = profesores.get(i).getCursos();
                
                System.out.println("Cursos:");
                if(!cursosProfe.isEmpty()){
                    ArrayList<Curso> cursosAMostrar = new ArrayList<>(cursosProfe);
                    
                    for (int j = 0; j < cursosAMostrar.size(); j++) {
                        System.out.println((j+1) + " - " + cursosAMostrar.get(j).getNombre());
                    }
                }
            }            
        }
    }
    
    public void listarCursos() {
        // Lista cursos y su profe asignado
        System.out.println("\nCursos disponibles:");
        if (profesores.isEmpty()) {
            System.out.println("No hay cursos aun.");            
        }
        else {
            for (int i = 0; i < cursos.size(); i++) {
                System.out.print((i+1) + ". ");
                cursos.get(i).mostrarInfo();
            }            
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        int i = 0;
        
        while (i < this.profesores.size() && !this.profesores.get(i).getId().equalsIgnoreCase(id)) {
            i++;
        }
        
        Profesor profeEncontrado = i < this.profesores.size() ? this.profesores.get(i) : null;
        
        return profeEncontrado;
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        int i = 0;
        
        while (i < this.cursos.size() && !this.cursos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
            i++;
        }
        
        Curso cursoEncontrado = i < this.cursos.size() ? this.cursos.get(i) : null;
        
        return cursoEncontrado;
    }
    
    public void eliminarCurso(String codigo) {
        // Si el curso tiene un profe asignado actualiza del lado del profe los cursos y los muestra
        Curso curso = this.buscarCursoPorCodigo(codigo);
        
        if (curso != null) {
            Profesor profeActual = curso.getProfesor();
            
            if (profeActual != null) {
                curso.setProfesor(null);
                System.out.println("\nProfesor actualizado, cursos asignados:");
                profeActual.listarCursos();
            }
            
            this.cursos.remove(curso);       
            
            System.out.println("\nCurso eliminado!");
        }
        else 
            System.out.println("No se encontro el curso.");
    }
    
    public void eliminarProfesor(String id) {
        // Antes de remover, dejar null los cursos que dictaba.
        Profesor profe = this.buscarProfesorPorId(id);
        
        if (profe != null) {
            List cursosActuales = profe.getCursos();
            
            if (!cursosActuales.isEmpty()) { 
                ArrayList<Curso> cursosActualizar = new ArrayList<>();
                cursosActualizar.addAll(cursosActuales);
                
                for (Curso curso : cursosActualizar) {
                    curso.setProfesor(null);
                    System.out.println("\nCurso actualizado:");
                    curso.mostrarInfo();
                }
            }
            
            this.profesores.remove(profe);
            
            System.out.println("\nProfesor eliminado!");
        }
        else 
            System.out.println("No se encontro el curso.");
    }
}
