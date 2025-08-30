package utn.tupad.p2;

import java.util.Scanner;
import tp2.EjerciciosTp2;
import tp3.EjerciciosTp3;

/**
 *
 * @author kary
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EjerciciosTp2 tp2 = new EjerciciosTp2();
        EjerciciosTp3 tp3 = new EjerciciosTp3();
        
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a los trabajos practicos de la materia Programacion II");
        System.out.println("                                 Alumna: Karina Rodriguez                                  ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Ingrese el numero de TP que desea ejecutar: ");
        System.out.println("Nota: TP n° 1 en Repo Aparte.");
        System.out.println("1. TP n° 2");
        System.out.println("2. TP n° 3");
        System.out.println("0. Salir");
        
        System.out.print("\nIngrese una opcion: ");
        int option = input.nextInt();
        
        switch (option) {
            case 0 -> System.out.println("Gracias por pasarte!");
            case 1 -> tp2.ejecutar();
            case 2 -> tp3.ejecutar();
            default -> System.out.println("Error: Opcion Invalida.");
        }
    }
    
}
