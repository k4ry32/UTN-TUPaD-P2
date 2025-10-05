/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

import tp6.inventario.Inventario;
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
    }
    
    static void ejecutarInventario() {
        Scanner input = new Scanner(System.in);
                
        // Creacion de inventario de pruebas
        Inventario inventario = new Inventario();
        
        // Servicio de inventario
        ServicioInventario servicio = new ServicioInventario(inventario);
        
        // Creacion de productos y adición al inventario
        servicio.crearSeedInventario();
        
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
        
    }
}
