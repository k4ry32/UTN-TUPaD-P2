/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.Scanner;

/**
 *
 * @author kari
 */
public class EjerciciosTp8 {
    public void ejecutar() {
        Scanner input = new Scanner(System.in);
        boolean repeatFlag = true;
        verMenu();
        
        while (repeatFlag) {
            System.out.print("\nIngrese una opcion: ");
            int option = Integer.parseInt(input.nextLine());

            System.out.println("");
            switch (option) {
                case 1 -> ejecutarEcommerce();
                case 2 -> ejerciciosExcepciones();    
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
        input.close();
    }

    public void verMenu() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Bienvenido a los ejercicios del TP n° 8");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Elija una opcion:");
        System.out.println("1. Ecommerce");
        System.out.println("2. Excepciones");   
    }

    private void ejecutarEcommerce() {
        System.out.println("=== Entrando al sistema de ecommerce ===");
        
        // Crear productos
        tp8.ecommerce.Producto producto1 = new tp8.ecommerce.Producto("Laptop", 1500.0);
        tp8.ecommerce.Producto producto2 = new tp8.ecommerce.Producto("Mouse", 25.0);
        tp8.ecommerce.Producto producto3 = new tp8.ecommerce.Producto("Teclado", 75.0);
        
        System.out.println("Productos creados:");
        System.out.println("- " + producto1.getNombre() + ": $" + producto1.getPrecio());
        System.out.println("- " + producto2.getNombre() + ": $" + producto2.getPrecio());
        System.out.println("- " + producto3.getNombre() + ": $" + producto3.getPrecio());
        
        // Crear clientes
        tp8.ecommerce.Cliente cliente = new tp8.ecommerce.Cliente("Juan Pérez", "juan@gmail.com", "261-3567895");
        tp8.ecommerce.Cliente cliente2 = new tp8.ecommerce.Cliente("Maria Gomez", "maria@gmail.com", "261-3567896");
        
        System.out.println("\nClientes creados:");
        System.out.println("- " + cliente.getNombre() + ": " + cliente.getEmail() + " - " + cliente.getTelefono());
        System.out.println("- " + cliente2.getNombre() + ": " + cliente2.getEmail() + " - " + cliente2.getTelefono());
        
        // Crear pedidos
        tp8.ecommerce.Pedido pedido = new tp8.ecommerce.Pedido();
        tp8.ecommerce.Pedido pedido2 = new tp8.ecommerce.Pedido();

        pedido.setCliente(cliente);
        pedido.agregarProducto(producto1);

        pedido2.setCliente(cliente2);
        pedido2.agregarProducto(producto2);
        pedido2.agregarProducto(producto3);
        
        System.out.println("\nPedido 1 creado con " + pedido.getProductos().size() + " productos");
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        System.out.println("\nPedido 2 creado con " + pedido2.getProductos().size() + " productos");
        System.out.println("Total del pedido: $" + pedido2.calcularTotal());

        // Pagar pedidos
        // Pago con tarjeta de crédito
        tp8.ecommerce.TarjetaCredito tarjeta = new tp8.ecommerce.TarjetaCredito("1234567890123456", "Juan Pérez", "12/25", 5.0);
        System.out.println("\n--- Procesando pago de pedido 1 con Tarjeta de Crédito ---");
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        pedido.setMetodoPago("Tarjeta de Crédito");
        pedido.setTotal(totalConDescuento);
        tarjeta.procesarPago(totalConDescuento);
        
        // Pago con PayPal
        tp8.ecommerce.PayPal paypal = new tp8.ecommerce.PayPal("juan@email.com", "password123", 10.0);
        System.out.println("\n--- Procesando pago de pedido 2 con PayPal ---");
        double totalConDescuentoPayPal = paypal.aplicarDescuento(pedido2.calcularTotal());
        pedido2.setMetodoPago("PayPal");
        pedido2.setTotal(totalConDescuentoPayPal);
        paypal.procesarPago(totalConDescuentoPayPal);

        // Cambiar estado del pedido
        System.out.println("\n--- Cambiando estado del pedido 1 ---");
        pedido.cambiarEstado("Confirmado");
        System.out.println("\n--- Cambiando estado del pedido 2 ---");
        pedido2.cambiarEstado("Confirmado");
        
        System.out.println("\n--- Cambiando estado del pedido 1 ---");
        pedido.cambiarEstado("Enviado");
        System.out.println("\n--- Cambiando estado del pedido 2 ---");
        pedido2.cambiarEstado("Enviado");
        
        System.out.println("\n--- Cambiando estado del pedido 1 ---");
        pedido.cambiarEstado("Entregado");
    }

    private void ejerciciosExcepciones() {
        System.out.println("Ejecutando ejercicios de excepciones");
    }
}
