/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

import java.util.ArrayList;
import java.util.Scanner;
import tp6.inventario.CategoriaProducto;
import tp6.inventario.Inventario;
import tp6.inventario.Producto;

/**
 *
 * @author kary
 */
public class ServicioInventario {
    private Inventario inventario;

    public ServicioInventario(Inventario inventario) {
        this.inventario = inventario;
    }    
    
    public void crearSeedInventario() {
        Seeder seeder = new Seeder();
        seeder.seedInventarioProductos(inventario);
    }
    
    public void mostrarInventario() {
        inventario.listarProductos();
    }
    
    public void buscarProductoPorId() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un ID de producto para buscar: ");
        String idProducto = input.nextLine();
        
        Producto productoEncontrado = inventario.buscarProductoPorId(idProducto);
        
        if(productoEncontrado != null) {
            System.out.println("Producto encontrado: ");
            productoEncontrado.mostrarInfo();
        } else 
            System.out.println("No se encontro el producto"); 
    }
    
    public void filtrarProductosPorCategoria() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de una categoria para filtrar los producto: ");
        this.mostrarCategorias();
        
        System.out.print("\nOpcion: ");
        int eleccionCategoria = input.nextInt();
        CategoriaProducto[] categorias = CategoriaProducto.values();
        
        if (eleccionCategoria < 1 || eleccionCategoria > categorias.length) {
            System.out.println("No es una categoria valida");
        }
        else {
            CategoriaProducto categoria = categorias[eleccionCategoria-1];
        
            ArrayList<Producto> productosPorCategoria = inventario.filtrarPorCategoria(categoria);

            System.out.println("\nProductos de la categoria " + categoria.name() + ": ");
            for (Producto producto : productosPorCategoria) {
                producto.mostrarInfo();
            }
        }        
    }
    
    public void eliminarProductoPorId() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un ID de producto para eliminarlo: ");
        String idProducto = input.nextLine();
        
        Producto productoEliminado = inventario.eliminarProducto(idProducto);
        
        if(productoEliminado != null) {
            System.out.println("Producto eliminado correctamente!");
            inventario.listarProductos();
        } else 
            System.out.println("No se encontro el producto");  
    }
    
    public void actualizarStock() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el ID de producto a actualizar stock:");
        System.out.print("ID: ");
        String idProducto = input.nextLine();
        
        Producto productoAActualizar = inventario.buscarProductoPorId(idProducto);
        
        if(productoAActualizar != null) {
            System.out.println("\nProducto encontrado: ");
            productoAActualizar.mostrarInfo();
            
            System.out.print("\nIngrese el nuevo stock del producto: ");
            int nuevoStock = Integer.parseInt(input.nextLine());
            
            inventario.actualizarStock(productoAActualizar.getId(), nuevoStock);

            System.out.println("Stock actualizado correctamente.");
        } else 
            System.out.println("No se encontro el producto");
    }
    
    public void mostrarStockTotal() {
        int stockTotal = inventario.obtenerTotalStock();
        System.out.println("Hay " + stockTotal + " productos en total en el inventario.");
    }
    
    public void mostrarProductoMayorStock() {
        Producto productoMayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("\nProducto con mayor stock en el inventario:");
        productoMayorStock.mostrarInfo();
    }
    
    public void filtrarPorPrecio() {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Ingrese un rango de precios para filtrar productos:");
        System.out.print("Minimo: ");
        double min = Double.parseDouble(input.nextLine());
        System.out.print("Maximo: ");
        double max = Double.parseDouble(input.nextLine());
        
        ArrayList<Producto> productosPorPrecio = inventario.filtrarProductosPorPrecio(min, max);
        
        System.out.println("\nProductos encontrados con precio entre $" + min + " y $" + max + ": ");
        for (Producto producto : productosPorPrecio) {
            producto.mostrarInfo();
        }        
    }
    
    public void mostrarCategorias() {
        System.out.println("Categorias Disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
    
    public void agregarNuevoProducto() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el stock del producto: ");
        int cantidad = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la categoria del producto (numero de opcion)");
        this.mostrarCategorias();
        System.out.print("Numero de categoria: ");
        int opcionCategoria = Integer.parseInt(input.nextLine());
        
        CategoriaProducto[] categorias = CategoriaProducto.values();
        
        if (opcionCategoria < 1 || opcionCategoria > categorias.length) {
            System.out.println("No es una categoria valida");
        }
        else {
            CategoriaProducto categoria = categorias[opcionCategoria-1];
            Producto nuevoProducto = new Producto(nombre, precio, cantidad, categoria);
            inventario.agregarProducto(nuevoProducto);
            
            System.out.println("\nNuevo producto agregado!");
            nuevoProducto.mostrarInfo();
        }
    }
}
