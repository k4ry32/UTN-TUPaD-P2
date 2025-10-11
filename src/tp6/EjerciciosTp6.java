/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

import java.util.Scanner;

/**
 *
 * @author kary
 */
public class EjerciciosTp6 {
    public void ejecutar () {
        Scanner input = new Scanner(System.in);
        boolean repeatFlag = true;
        verMenu();
        
        while (repeatFlag) {
            System.out.print("\nIngrese una opcion: ");
            int option = Integer.parseInt(input.nextLine());

            System.out.println("");
            switch (option) {
                case 1 -> ejecutarInventario();
                case 2 -> ejecutarBiblioteca();    
                case 3 -> ejecutarUniversidad();
                default -> System.out.println("Error: Opcion Invalida. Vuelva a intentarlo.");
            }
            
            System.out.println("\nDesea ejecutar otro ejercicio?");
            System.out.print("Respuesta (si/no): ");
            String repeat = input.nextLine();
            
            if (repeat.equalsIgnoreCase("NO")) repeatFlag = false;
            else {
                System.out.println("Ver menu de opciones otra vez?");
                String menu = input.nextLine();
                System.out.print("Respuesta (si/no): ");
                if (menu.equalsIgnoreCase("SI")) verMenu();
            }
        }
    }
    
    static void verMenu () {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Bienvenido a los ejercicios del TP n° 6");
            System.out.println("------------------------------------------------------------------");
            System.out.println("Elija una opcion:");
            System.out.println("1. Inventario de Productos.");
            System.out.println("2. Biblioteca.");   
            System.out.println("3. Universidad");
    }
    
    static void ejecutarInventario() {
        Scanner input = new Scanner(System.in);
                        
        // Servicio de inventario (creacion de inventario)
        ServicioInventario servicio = new ServicioInventario();
        
        // Creacion y adición de productos al inventario
        servicio.seedInventario();
        
        // Ver menu de acciones para inventario
        boolean repeatFlag = true;   
        verMenuAccionesInventario();
        
        while (repeatFlag) {
            System.out.println("");
            System.out.println("Ingrese una opcion para realizar (del 0 al 11). Utiles: 0 = salir; 11 = ver menu.");
            System.out.print("Opcion: ");
            int option = Integer.parseInt(input.nextLine());

            System.out.println("");
            switch (option) {
                case 0 -> repeatFlag = false;
                case 1 -> servicio.mostrarInventario();
                case 2 -> servicio.buscarProductoPorId();
                case 3 -> servicio.filtrarProductosPorCategoria();
                case 4 -> servicio.eliminarProductoPorId();
                case 5 -> servicio.actualizarStock();
                case 6 -> servicio.mostrarStockTotal();
                case 7 -> servicio.mostrarProductoMayorStock();
                case 8 -> servicio.filtrarPorPrecio();
                case 9 -> servicio.mostrarCategorias();
                case 10 -> servicio.agregarNuevoProducto();
                case 11 -> verMenuAccionesInventario();
                default -> System.out.println("Error: Opcion Invalida. Vuelva a intentarlo.");
            }
        }        
    }
    
    static void verMenuAccionesInventario() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Acciones de Inventario");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Elija una opcion:");
        System.out.println("0. Salir.");
        System.out.println("1. Mostrar todos los productos en el inventario.");
        System.out.println("2. Buscar un producto por ID.");
        System.out.println("3. Filtrar productos por categoria.");
        System.out.println("4. Eliminar un producto por ID.");
        System.out.println("5. Actualizar stock de un producto.");
        System.out.println("6. Ver stock total de productos.");
        System.out.println("7. Ver producto con mayor stock.");
        System.out.println("8. Filtrar productos por rango de precios.");
        System.out.println("9. Ver categorias disponibles.");
        System.out.println("10. Agregar nuevo producto.");
        System.out.println("11. Mostrar este menu nuevamente.");
    }
    
    static void ejecutarBiblioteca() {
        Scanner input = new Scanner(System.in);
        
        // Servicio de biblioteca (creacion de biblioteca)
        System.out.print("Ingresa un nombre para la biblioteca: ");
        String nombre = input.nextLine();
        ServicioBiblioteca servicio = new ServicioBiblioteca(nombre);
        
        // Creacion y adición de productos al inventario
        servicio.seedBiblioteca();
        
        // Ver menu de acciones para biblioteca
        verMenuAccionesBiblioteca();
        boolean repeatFlag = true;
        
        while (repeatFlag) {
            System.out.println("");
            System.out.println("Ingrese una opcion para realizar (del 0 al 8). Utiles: 0 = salir; 8 = ver menu.");
            System.out.print("Opcion: ");
            int option = Integer.parseInt(input.nextLine());

            System.out.println("");
            switch (option) {
                case 0 -> repeatFlag = false;
                case 1 -> servicio.mostrarLibrosEnBiblioteca();
                case 2 -> servicio.buscarLibroPorIsbn();
                case 3 -> servicio.filtrarLibrosPorAnio();
                case 4 -> servicio.eliminarLibroPorIsbn();
                case 5 -> servicio.verCantidadTotalDeLibros();
                case 6 -> servicio.verAutoresDisponibles();
                case 7 -> servicio.agregarLibro();
                case 8 -> verMenuAccionesInventario();
                default -> System.out.println("Error: Opcion Invalida. Vuelva a intentarlo.");
            }
        }
    }
    
    static void verMenuAccionesBiblioteca() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Acciones de Biblioteca");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Elija una opcion:");
        System.out.println("0. Salir.");
        System.out.println("1. Mostrar todos los libros en la biblioteca.");
        System.out.println("2. Buscar un libro por su ISBN.");
        System.out.println("3. Filtrar libros por año de publicacion.");
        System.out.println("4. Eliminar un libro por su ISBN.");
        System.out.println("5. Ver cantidad de libros en la biblioteca.");
        System.out.println("6. Mostrar autores disponibles.");
        System.out.println("7. Agregar nuevo libro.");
        System.out.println("8. Mostrar este menu nuevamente.");
    }
    
    static void ejecutarUniversidad(){
        Scanner input = new Scanner(System.in);
        
        // Servicio de biblioteca (creacion de biblioteca)
        System.out.print("Ingresa un nombre para la universidad: ");
        String nombre = input.nextLine();
        ServicioUniversidad servicio = new ServicioUniversidad(nombre);
        
        // creacion y adicion de profesores y cursos a la univerdad
        servicio.seedUniversidad();
        
        // Ver menu de acciones para la universidad
        verMenuUniversidad();
        boolean repeatFlag = true;
        
        while (repeatFlag) {
            System.out.println("");
            System.out.println("Ingrese una opcion para realizar (del 0 al 10). Utiles: 0 = salir; 10 = ver menu.");
            System.out.print("Opcion: ");
            int option = Integer.parseInt(input.nextLine());

            System.out.println("");
            switch (option) {
                case 0 -> repeatFlag = false;
                case 1 -> servicio.agregarProfesor();
                case 2 -> servicio.agregarCurso();
                case 3 -> servicio.asignarProfesorACurso();
                case 4 -> servicio.listarCursosYSuProfesor();
                case 5 -> servicio.listarProfesoresYSusCursos();
                case 6 -> servicio.actualizarProfesorDeCurso();
                case 7 -> servicio.eliminarCurso();
                case 8 -> servicio.eliminarProfesor();
                case 9 -> servicio.reporteDeCursos();
                case 10 -> verMenuAccionesInventario();
                default -> System.out.println("Error: Opcion Invalida. Vuelva a intentarlo.");
            }
        }
    }
    
    static void verMenuUniversidad() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Acciones de Universidad");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Elija una opcion:");
        System.out.println("0. Salir.");
        System.out.println("1. Agregar un profesor.");
        System.out.println("2. Agregar un curso.");
        System.out.println("3. Asignar un profesor a un curso.");
        System.out.println("4. Listar cursos disponibles (con su profesor).");
        System.out.println("5. Listar profesores disponibles (con sus cursos).");
        System.out.println("6. Actualizar profesor en curso.");
        System.out.println("7. Eliminar un curso.");
        System.out.println("8. Eliminar un profesor.");
        System.out.println("9. Reporte de cursos por profesor");
        System.out.println("10. Mostrar este menu nuevamente.");
    }
}
