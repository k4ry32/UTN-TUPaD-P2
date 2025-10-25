/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tp7.vehiculos.Auto;
import tp7.figuras.*;
import tp7.empleados.*;
import tp7.animales.*;

/**
 *
 * @author kari
 */
public class EjerciciosTp7 {
    public void ejecutar() {
        Scanner input = new Scanner(System.in);
        boolean repeatFlag = true;
        verMenu();
        
        while (repeatFlag) {
            System.out.print("\nIngrese una opcion: ");
            int option = Integer.parseInt(input.nextLine());

            System.out.println("");
            switch (option) {
                case 1 -> ejecutarVehiculos();
                case 2 -> ejecutarFigurasGeometricas();    
                case 3 -> ejecutarEmpleados();
                case 4 -> ejecutarAnimales();
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
        System.out.println("Bienvenido a los ejercicios del TP n° 7");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Elija una opcion:");
        System.out.println("1. Vehiculos y herencia basica");
        System.out.println("2. Figuras geometricas y metodos abstractos.");   
        System.out.println("3. Empleados y polimorfismo");
        System.out.println("4. Animales y overriding");
    }
    
    public void ejecutarVehiculos() {
        System.out.println("Ejecutando vehiculos y herencia basica");
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = input.nextLine();
        System.out.print("Ingrese el modelo del vehiculo: ");
        String modelo = input.nextLine();
        System.out.print("Ingrese la cantidad de puertas del vehiculo: ");
        int cantidadPuertas = Integer.parseInt(input.nextLine());
        
        // Crear un auto y mostrar su informacion
        Auto auto = new Auto(cantidadPuertas, marca, modelo);
        System.out.println("Nuevo vehiculo creado:");
        auto.mostrarInfo();
    }
    
    public void ejecutarFigurasGeometricas() {
        System.out.println("Ejecutando figuras geometricas y metodos abstractos");

        // Crear un array de figuras (clase abstracta)
        Figura[] figuras = new Figura[4];
        
        // Crear circulos y rectangulos (subclases de Figura)
        figuras[0] = new Circulo(5.2, "Círculo Grande");
        figuras[1] = new Rectangulo(4.0, 6.1, "Rectángulo Pequeño");
        figuras[2] = new Circulo(3.5, "Círculo Mediano");
        figuras[3] = new Rectangulo(8.1, 3.0, "Rectángulo Largo");

        System.out.println("\nFiguras creadas:");
        for (int i = 0; i < figuras.length; i++) {
            Figura figura = figuras[i];
            if (figura instanceof Circulo) {
                Circulo circulo = (Circulo) figura;
                System.out.println(i + 1 + ". " + figura.getNombre() + " - Radio: " + circulo.getRadio());
            } else if (figura instanceof Rectangulo) {
                Rectangulo rectangulo = (Rectangulo) figura;
                System.out.println(i + 1 + ". " + figura.getNombre() + " - Base: " + rectangulo.getBase() + " - Altura: " + rectangulo.getAltura());
            }
        }
        
        System.out.println("\nCalculo de area de las figuras:");
        for (int i = 0; i < figuras.length; i++) {
            Figura figura = figuras[i];
            System.out.println(figura.getNombre() + ": " + figura.calcularArea());
        }
    }
    
    public void ejecutarEmpleados() {
        System.out.println("Ejecutando empleados y polimorfismo");

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Juan Perez", 1300, 5));
        empleados.add(new EmpleadoPlanta("Maria Vargas", 1850, 3));
        empleados.add(new EmpleadoTemporal("Pedro Garcia", 12, 45));
        empleados.add(new EmpleadoTemporal("Analia Rodriguez", 15, 36));

        System.out.println("Calculo de sueldos de los empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " - " + "Sueldo: $" + empleado.calcularSueldo());
        }
    }
    
    public void ejecutarAnimales() {
        System.out.println("Ejecutando animales y overriding");
        
        List<Animal> animales = new ArrayList<>();
        
        // Agregar animales a la lista
        animales.add(new Perro("Max", "Labrador"));
        animales.add(new Gato("Luna", "Blanco"));
        animales.add(new Vaca("Barbara", "Blanco y Negro"));
        
        System.out.println("\nQue sonido hace cada animal?");
        for (int i = 0; i < animales.size(); i++) {
            System.out.println(animales.get(i).hacerSonido());
        }
             
    }
}
