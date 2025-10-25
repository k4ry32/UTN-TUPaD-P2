/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.ecommerce;

/**
 *
 * @author kari
 */
public class TarjetaCredito implements InterfazPago {
    private String numeroTarjeta;
    private String titular;
    private String fechaVencimiento;
    private double descuentoPorcentaje;

    public TarjetaCredito(String numeroTarjeta, String titular, String fechaVencimiento, double descuentoPorcentaje) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
        this.descuentoPorcentaje = descuentoPorcentaje;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getDescuentoPorcentaje() {
        return descuentoPorcentaje;
    }

    public void setDescuentoPorcentaje(double descuentoPorcentaje) {
        this.descuentoPorcentaje = descuentoPorcentaje;
    }
    
    @Override
    public double procesarPago(double total) {
        System.out.println("Procesando pago con tarjeta de crédito...");
        System.out.println("Titular: " + this.titular);
        System.out.println("Tarjeta: ****" + this.numeroTarjeta.substring(this.numeroTarjeta.length() - 4));
        System.out.println("Total a pagar: $" + total);
        return total;
    }
    
    @Override
    public double aplicarDescuento(double total) {
        double descuento = total * (this.descuentoPorcentaje / 100);
        double totalConDescuento = total - descuento;
        System.out.println("Descuento aplicado: " + this.descuentoPorcentaje + "%");
        System.out.println("Monto descontado: $" + descuento);
        System.out.println("Total con descuento: $" + totalConDescuento);
        return totalConDescuento;
    }
}
