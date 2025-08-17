/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author kary
 */
public class Utils {
        final static double descuentoEspecial = 0.10;
    
     public double calcularPrecioFinal (double precio, double impuesto, double descuento) {
         double precioFinal = precio + (precio * impuesto * 0.01) - (precio * descuento * 0.01);
         return precioFinal;
     }
     
     public double calcularCostoEnvio (double peso, String zona) {
         // Nacional: $5 por kg | Internacional: $10 por kg
         int costoZona = zona.equalsIgnoreCase("Nacional") ? 5 : 10;
         double costoEnvio = peso * costoZona;
         return costoEnvio;
     }
     
     public double calcularTotalCompra (double precioProducto, double costoEnvio) {
         return precioProducto + costoEnvio;
     }
     
     public int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
         int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
         return nuevoStock;
     }
     
     public double calcularDescuentoEspecial(double precio) {
         double descuento = precio * descuentoEspecial;
         return descuento;
     }
     
     public void mostrarPrecios(double [] precios) {
         for (double precio : precios) {
             System.out.println("Precio: $" + precio);
         }
     }
     
     public void mostrarPreciosRecursivo(double [] precios, int indice) {
         if (indice != precios.length) {
             System.out.println("Precio: $" + precios[indice]);
             mostrarPreciosRecursivo(precios, indice + 1);
         }
     }
}
