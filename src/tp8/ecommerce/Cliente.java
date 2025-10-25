/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.ecommerce;

/**
 *
 * @author kari
 */
public class Cliente implements InterfazNotificable {
    private String nombre;
    private String email;
    private String telefono;

    public Cliente(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public void notificarCambioEstado(Pedido pedido, String estadoAnterior, String estadoNuevo) {
        System.out.println("=== NOTIFICACIÓN PARA CLIENTE ===");
        System.out.println("Cliente: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Su pedido ha cambiado de estado:");
        System.out.println("Estado anterior: " + estadoAnterior);
        System.out.println("Estado nuevo: " + estadoNuevo);
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        System.out.println("=================================");
    }
}
