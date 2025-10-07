/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

import java.util.ArrayList;
import java.util.Scanner;
import tp6.biblioteca.Autor;
import tp6.biblioteca.Biblioteca;
import tp6.biblioteca.Libro;

/**
 *
 * @author kary
 */
public class ServicioBiblioteca {
    private Biblioteca biblioteca;

    public ServicioBiblioteca(String nombre) {
        this.biblioteca = new Biblioteca(nombre);
    }
    
    public void seedBiblioteca() {
        Seeder seeder = new Seeder();
        seeder.seedBibliotecaLibros(biblioteca);
    }
    
    public void mostrarLibrosEnBiblioteca() {
        biblioteca.listarLibros();
    }
    
    public void buscarLibroPorIsbn() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el ISBN del libro a buscar: ");
        String isbn = input.nextLine();
        
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn(isbn);
        
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: ");
            libroEncontrado.mostrarInfo();
        } else 
            System.out.println("No se encontro el libro");
    }
    
    public void filtrarLibrosPorAnio() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un año de publicacion para filtrar los libros: ");
        int anio = Integer.parseInt(input.nextLine());
        
        ArrayList<Libro> librosEncontrados =  biblioteca.filtrarLibrosPorAnio(anio);
        
        if (!librosEncontrados.isEmpty()) {
            System.out.println("Se encontraron los siguientes libros:");
            for (Libro libro : librosEncontrados) {
                libro.mostrarInfo();
            }
        }
        else
            System.out.println("No se encontraron libros para el año ingresado.");
    }
    
    public void eliminarLibroPorIsbn() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el ISBN del libro a eliminar: ");
        String isbn = input.nextLine();
        
        Libro libroEliminado = biblioteca.eliminarLibro(isbn);
        
        if (libroEliminado != null) {
            System.out.println("Libro eliminado correctamente.");
            biblioteca.listarLibros();
        } else 
            System.out.println("No se encontro un libro con el ISBN ingresado.");
    }
    
    public void verCantidadTotalDeLibros() {
        int totalLibros = biblioteca.obtenerCantidadLibros();
        System.out.println("Hay en total " + totalLibros + " libros en la biblioteca.");
    }
    
    public void verAutoresDisponibles() {
        System.out.println("Buscando autores...");
        biblioteca.mostrarAutoresDisponibles();
    }
       
    public void agregarLibro() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Agregar nuevo libro:");
        
        biblioteca.mostrarAutoresDisponibles();
        System.out.println("\nEl autor esta en el listado? (si/no)");
        String autorDisponible = input.nextLine();
        Autor autor = null;
        
        if (autorDisponible.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el ID del autor: ");
            String idAutor = input.nextLine();
            
            autor = biblioteca.obtenerAutorPorId(idAutor);
            
            if (autor == null) {
                System.out.println("No se encontro el autor.");
                return;
            }
        }
        
        System.out.print("Ingrese el ISBN: ");
        String isbn = input.nextLine().replaceAll("-", "");
        System.out.print("Titulo del libro: ");
        String titulo = input.nextLine();
        System.out.print("Año de publicacion: ");
        int anio = Integer.parseInt(input.nextLine());
        
        if (autor == null) {
            System.out.println("\nIngresar nuevo autor:");
            System.out.print("Nombre: ");
            String nombreAutor = input.nextLine();
            System.out.print("Nacionalidad: ");
            String nacionalidad = input.nextLine();
            
            autor = new Autor(nombreAutor, nacionalidad);
        }
        
        Libro nuevoLibro = biblioteca.agregarLibro(isbn, titulo, anio, autor);
        
        System.out.println("Nuevo libro agregado!");
        nuevoLibro.mostrarInfo();
    }    
}
