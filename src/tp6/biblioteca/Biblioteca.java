/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kary
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public Libro agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        return nuevoLibro;
    }    
    
    public void listarLibros() {
        System.out.println("Libros registrados en Biblioteca:");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        int i = 0;
        
        while (i < this.libros.size() && !this.libros.get(i).getIsbn().equalsIgnoreCase(isbn)) {
            i++;
        }
        
        Libro libroEncontrado = i < this.libros.size() ? this.libros.get(i) : null;
        
        return libroEncontrado;
    }
    
    public Libro eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        this.libros.remove(libroAEliminar);
        return libroAEliminar;
    }
    
    public int obtenerCantidadLibros() {        
        return this.libros.size();
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio){
                librosEncontrados.add(libro);
            }
        }
        
        return librosEncontrados;
    }
    
    public void mostrarAutoresDisponibles() {
        Set<Autor> autoresDisponibles = obtenerAutoresDisponibles();
        
        System.out.println("Autores disponibles:");
        for (Autor autor : autoresDisponibles) {
            autor.mostrarInfo();
        }
    }
    
    public Set<Autor> obtenerAutoresDisponibles() {
        Set<Autor> autoresUnicos = new HashSet<>();
        
        for (Libro libro : this.libros) {
            autoresUnicos.add(libro.getAutor());
        }
        
        return autoresUnicos;
    }
      
    public Autor obtenerAutorPorId(String id) {
        Set<Autor> autoresDisponibles = obtenerAutoresDisponibles();        
        Autor autorEncontrado = null;
        
        for (Autor autor : autoresDisponibles) {
            if (autor.getId().equals(id)) 
                autorEncontrado = autor;
        }
        
        return autorEncontrado;
    }
}
