/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.inventario;

import java.util.ArrayList;

/**
 *
 * @author kary
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    
    public void agregarProducto(Producto p) {
        this.productos.add(p); 
    }
    
    public void listarProductos() {
        System.out.println("\nProductos en inventario:");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        int i = 0;
        
        while (i < this.productos.size() && !this.productos.get(i).getId().equalsIgnoreCase(id)) {
            i++;
        }
        
        Producto productoEncontrado = i < this.productos.size() ? this.productos.get(i) : null;
        
        return productoEncontrado;
    }
    
    public Producto eliminarProducto(String id) {
        Producto productoAEliminar = this.buscarProductoPorId(id);
        this.productos.remove(productoAEliminar);        
        return productoAEliminar;
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto producto = this.buscarProductoPorId(id);
        
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
        }
    }
    
    public ArrayList<Producto> filtrarPorCategoria (CategoriaProducto categoria) {
        ArrayList<Producto> productosEncontrados = new ArrayList<>();
        
        for(Producto producto : this.productos) {
            if (producto.getCategoria() == categoria){
                productosEncontrados.add(producto);
            }
        }
        
        return productosEncontrados;
    }
    
    public int obtenerTotalStock() {
        int totalStock = 0;
        
        for(Producto producto : this.productos) {
            totalStock += producto.getCantidad();
        }
        
        return totalStock;
    }
    
    public Producto obtenerProductoConMayorStock() {
        int mayorStock = 0;
        Producto productoConMayorStock = null;
        
        for(Producto producto : this.productos) {
            if (producto.getCantidad() > mayorStock) {
                productoConMayorStock = producto;
                mayorStock = producto.getCantidad();
            }
        }
        
        return productoConMayorStock;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        
        for(Producto producto : this.productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                productosFiltrados.add(producto);
            }
        }
        
        return productosFiltrados;
    }
    
    public void mostrarCategoriasDisponibles() {
        CategoriaProducto[] categorias = CategoriaProducto.values();
        
        for (int i = 0; i < categorias.length; i++) {
             System.out.println((i+1) + " - " + categorias[i].name() + ": " + categorias[i].getDescripcion());
        }
    }
}
