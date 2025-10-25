/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.ecommerce;

/**
 *
 * @author kari
 */
public class PayPal implements InterfazPagoConDescuento {
    private String email;
    private String contrasena;
    private double descuentoPorcentaje;

    public PayPal(String email, String contrasena, double descuentoPorcentaje) {
        this.email = email;
        this.contrasena = contrasena;
        this.descuentoPorcentaje = descuentoPorcentaje;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getDescuentoPorcentaje() {
        return descuentoPorcentaje;
    }

    public void setDescuentoPorcentaje(double descuentoPorcentaje) {
        this.descuentoPorcentaje = descuentoPorcentaje;
    }
    
    @Override
    public double procesarPago(double total) {
        System.out.println("Procesando pago con PayPal...");
        System.out.println("Email: " + this.email);
        System.out.println("Total a pagar: $" + total);
        return total;
    }
    
    @Override
    public double aplicarDescuento(double total) {
        double descuento = total * (this.descuentoPorcentaje / 100);
        double totalConDescuento = total - descuento;
        System.out.println("Descuento PayPal aplicado: " + this.descuentoPorcentaje + "%");
        System.out.println("Monto descontado: $" + descuento);
        System.out.println("Total con descuento: $" + totalConDescuento);
        return totalConDescuento;
    }
}
