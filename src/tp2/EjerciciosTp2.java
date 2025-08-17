package tp2;

import java.util.Scanner;

/**
 *
 * @author kary
 */
public class EjerciciosTp2 {            
    public void ejecutar () {
        Scanner input = new Scanner(System.in);
        boolean repeatFlag = true;
        verMenu();
        
        while (repeatFlag) {
            System.out.print("\nIngrese una opcion (1 al 13): ");
            int option = Integer.parseInt(input.nextLine());

            System.out.println("");
            switch (option) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3(); 
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8 ();
                case 9 -> ejercicio9 ();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
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
            System.out.println("Bienvenido a los ejercicios del TP n° 2");
            System.out.println("------------------------------------------------------------------");
            System.out.println("Elija una opcion:");
            System.out.println("< --------- Estructuras Condicionales: --------->");
            System.out.println("1. Verificación de Año Bisiesto.");
            System.out.println("2. Determinar el Mayor de Tres Números.");
            System.out.println("3. Clasificación de Edad.");
            System.out.println("4.​ Calculadora de Descuento según categoría.");
            System.out.println("< --------- Estructuras de Repetición: --------->");
            System.out.println("5.​ Suma de Números Pares (while).");
            System.out.println("6.​ Contador de Positivos, Negativos y Ceros (for).");
            System.out.println("7.​ Validación de Nota entre 0 y 10 (do-while).");
            System.out.println("< --------- Funciones: --------->");
            System.out.println("8.​ Cálculo del Precio Final con impuesto y descuento.");
            System.out.println("9.​ Composición de funciones para calcular costo de envío y total de compra.");
            System.out.println("10.​Actualización de stock a partir de venta y recepción de productos.");
            System.out.println("11.​Cálculo de descuento especial usando variable global.");
            System.out.println("< --------- Arrays y Recursividad: --------->");
            System.out.println("12.​ Modificación de un array de precios y visualización de resultados.");
            System.out.println("13.​ Impresión recursiva de arrays antes y después de modificar un elemento.");
    }
    
     static void ejercicio1 () {
        // Escribe un programa en Java que solicite al usuario un año y determine si es
        // bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
        // divisible por 400.
        Scanner input = new Scanner(System.in);
        
         System.out.print("Ingrese un año para determinar si es bisiesto: ");
         int year = input.nextInt();
         
         boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
         
         if (isLeapYear) System.out.println(year + " es un año bisiesto.");
         else System.out.println("No es un año bisiesto.");
     }
     
     static void ejercicio2 () {
        // Escribe un programa en Java que pida al usuario tres números enteros y
        // determine cuál es el mayor.
        Scanner input = new Scanner(System.in);
        int num, max = 0;
         System.out.println("Ingrese 3 numeros para determinar el mayor: ");
         
         for (int i = 0; i < 3; i++) {
              System.out.print((i+1) + "° numero: ");
              num = input.nextInt();
              if (num > max) max = num;
         }
         
         System.out.println("El mayor es: " + max);
     }
     
     static void ejercicio3 () {
        // Escribe un programa en Java que solicite al usuario su edad y clasifique su
        // etapa de vida según la siguiente tabla:
        // n<12 niño | 12<=n<=17 adolescente | 18<=n<=59 adulto | n>=60 adulto mayor
        Scanner input = new Scanner(System.in);
        
         System.out.print("Ingrese su edad: ");
         int age = input.nextInt();
         
         if (age >= 1 && age < 12) System.out.println("Eres un niño");
         else if (age >= 12 && age <= 17) System.out.println("Eres un adolescente");
         else if (age >= 18 && age <= 59) System.out.println("Eres un adulto");
         else if (age >= 60) System.out.println("Eres un adulto mayor");
         else System.out.println("No es una edad valida");
     }
     
     static void ejercicio4 () {
        // Escribe un programa que solicite al usuario el precio de un producto y
        // su categoría (A, B o C) para luego aplicar un descuento:
        // Categoría A: 10% de descuento | Categoría B: 15% de descuento | Categoría C: 20% de descuento
        // El programa debe mostrar el precio original, el descuento aplicado y el precio final.
        Scanner input = new Scanner(System.in);
        
         System.out.print("Ingrese el precio del producto: ");
         double price = Double.parseDouble(input.nextLine());
         System.out.print("Ingrese la categoria del producto (A, B o C) en mayuscula: ");
         String category = input.nextLine();
         
         int discount = 0;

        switch (category) {
            case "A" -> discount = 10;
            case "B" -> discount = 15;
            case "C" -> discount = 20;
            default -> System.out.println("La categoria ingresada no es valida");
        }
         
         if (discount != 0){
             double newPrice = price - ((price * discount) / 100);
             System.out.println("Descuento aplicado: " + discount + "%");
             System.out.println("Precio final: $" + newPrice);
         }
     }
     
     static void ejercicio5 () {
         // while
        // Escribe un programa que solicite números al usuario y sume solo los
        // números pares. El ciclo debe continuar hasta que el usuario ingrese el número 0,
        // momento en el que se debe mostrar la suma total de los pares ingresados.
        Scanner input = new Scanner(System.in);
        int sum = 0, num;
        boolean flag = true;
        
        while (flag) {
            System.out.print("Ingrese un numero (0 para salir): ");
            num = input.nextInt();
            
            if (num % 2 == 0) sum += num;
            if (num == 0) flag = false;
        }
        
         System.out.println("La suma de los numeros pares ingresados es: " + sum);
     }
     
     static void ejercicio6 () {
         // for
         // Escribe un programa que pida al usuario ingresar 10 números enteros y
         // cuente cuántos son positivos, negativos y cuántos son ceros.
         Scanner input = new Scanner(System.in);
         int positives = 0, negatives = 0, ceros = 0, num;
         System.out.println("Ingrese 10 numeros enteros");
         
         for (int i = 0; i < 10; i++) {
             System.out.print((i+1) + "° numero : ");
             num = input.nextInt();
             
             if (num > 0) positives++;
             else if (num < 0) negatives++;
             else if (num == 0) ceros++;
         }
         
         System.out.println("Ingreso " + positives + " numeros positivos.");
         System.out.println("Ingreso " + negatives + " numeros negativos.");
         System.out.println("Ingreso " + ceros + " ceros.");
     } 
     
     static void ejercicio7 () {
         // do-while
         // Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
         // usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
         // hasta que ingrese un valor válido.
         Scanner input = new Scanner(System.in);
         int num = 0;
         
         do {
             if  (num < 0 || num > 10) System.out.print("Error: Nota invalida. ");
             System.out.print("Ingrese una nota entre 0 y 10: ");
             num = input.nextInt();
         } while (num < 0 || num > 10);
         
         System.out.println("Nota guardada correctamente.");
     }
     
     static void ejercicio8 () {
         // Crea un método calcularPrecioFinal(double impuesto, double
         // descuento) que calcule el precio final de un producto en un e-commerce. La
         // fórmula es: PrecioFinal = PrecioBase + (PrecioBase×Impuesto/100) − (PrecioBase×Descuento/100)
         // Desde main(), solicita el precio base del producto, el porcentaje de
         // impuesto y el porcentaje de descuento, llama al método y muestra el precio final.
         Scanner input = new Scanner(System.in);
         Utils utils = new Utils();
         
         System.out.print("Ingrese el precio base del producto: ");
         double precio = Double.parseDouble(input.nextLine());
          System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
         double impuesto = Double.parseDouble(input.nextLine());
         System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
         double descuento = Double.parseDouble(input.nextLine());
         
         double precioFinal = utils.calcularPrecioFinal(precio, impuesto, descuento);
         System.out.println("El precio final del producto es: $" + precioFinal);
     }
     
     static void ejercicio9 () {
        // Crear los sgtes metodos:
        // a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.​
        // Nacional: $5 por kg | Internacional: $10 por kg
        // b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.​
        // Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar.
        Scanner input = new Scanner(System.in);
        Utils utils = new Utils();
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
         System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();
        
        double costoEnvio = utils.calcularCostoEnvio(peso, zona);
         System.out.println("El costo de envio es: $" + costoEnvio);
        double total = utils.calcularTotalCompra(precio, costoEnvio);
        
         System.out.println("El total a pagar es: $" + total);
     }
     
     static void ejercicio10 () { 
         // Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), 
         // que calcule el nuevo stock después de una venta y recepción de productos:
         // NuevoStock = StockActual − CantidadVendida + CantidadRecibida
         // Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
         Scanner input = new Scanner(System.in);
        Utils utils = new Utils();
        
        System.out.print("Ingrese el stock actual del producto: ");
        int actual = Integer.parseInt(input.nextLine());
         System.out.print("Ingrese la cantidad vendida: ");
        int vendido = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad recibida: ");
         int recibido = Integer.parseInt(input.nextLine());
         
         int stockActualizado = utils.actualizarStock(actual, vendido, recibido);
         System.out.println("El nuevo stock del producto es: " + stockActualizado);
     }
     
     static void ejercicio11 () {
        // Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
        // método calcularDescuentoEspecial(double precio) que use la variable global para
        // calcular el descuento especial del 10%.
        // Dentro del método, declara una variable local descuentoAplicado, almacena
        // el valor del descuento y muestra el precio final con descuento.
        Scanner input = new Scanner(System.in);
        Utils utils = new Utils();
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        
        double descuentoAplicado = utils.calcularDescuentoEspecial(precio);
        double precioFinal = precio - descuentoAplicado;
        
         System.out.println("Su descuento especial es de $" + descuentoAplicado);
         System.out.println("El precio final con descuento es $" + precioFinal);
     }
     
     static void ejercicio12 () {
        // Crea un programa que:
        // a. Declare e inicialice un array con los precios de algunos productos.
        // b.​ Muestre los valores originales de los precios.
        // c. ​Modifique el precio de un producto específico.
        // d. ​Muestre los valores modificados.
        Utils utils = new Utils();
        double [] precios = {130.5, 240, 128.75, 99.99, 78.10};
        
         System.out.println("Precios Originales:");
         utils.mostrarPrecios(precios);
         
         precios[3] = 120;
         System.out.println("Precios Modificados:");
         utils.mostrarPrecios(precios);
     }
     
     static void ejercicio13 () {
        // Crea un programa que:
        // a. Declare e inicialice un array con los precios de algunos productos.
        // b. ​Use una función recursiva para mostrar los precios originales.
        // c.​ Modifique el precio de un producto específico.
        // d. Use otra función recursiva para mostrar los valores modificados.
        Utils utils = new Utils();
        double [] precios = {199.99, 242.5, 130, 25.75, 63.15};
        
        System.out.println("Precios Originales:");
        utils.mostrarPreciosRecursivo(precios, 0);
        
        precios[2] = 144.5;
        System.out.println("Precios Modificados:");
        utils.mostrarPreciosRecursivo(precios, 0);
     }
}
