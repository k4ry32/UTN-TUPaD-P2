/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.inventario;

import java.util.UUID;

/**
 *
 * @author kary
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
        
    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Categoria: " + categoria + ", Precio: $" + precio + ", Cantidad disponible: " + cantidad);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;            
        }
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }        
    }
    
    
}
