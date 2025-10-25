/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.ecommerce;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kari
 */
public class Pedido implements InterfazPagable {
    private List<Producto> productos;
    private String estado;
    private InterfazNotificable notificador;
    private String metodoPago;
    private Cliente cliente;
    private double total;

    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
        this.metodoPago = null;
        this.cliente = null;
        this.total = 0.0;
    }
    
    public Pedido(List<Producto> productos, String metodoPago, Cliente cliente) {
        this.productos = new ArrayList<>(productos);
        this.estado = "Pendiente";
        this.metodoPago = metodoPago;
        this.cliente = cliente;
        this.total = 0.0;
    }
    
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }
    
    public void removerProducto(Producto producto) {
        this.productos.remove(producto);
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public String getMetodoPago() {
        return metodoPago;
    }

    public double getTotal() {
        return total;
    }
    
    public void cambiarEstado(String nuevoEstado) {
        String estadoAnterior = this.estado;
        this.estado = nuevoEstado;
        
        if (notificador != null) {
            notificador.notificarCambioEstado(this, estadoAnterior, nuevoEstado);
        }
    }
    
    public String getEstado() {
        return estado;
    }
    
    public List<Producto> getProductos() {
        return new ArrayList<>(productos);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
}
