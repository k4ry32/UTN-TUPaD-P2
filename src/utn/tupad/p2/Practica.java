package utn.tupad.p2;

import java.util.Scanner;
import tp2.EjerciciosTp2;
import tp3.EjerciciosTp3;
import tp4.EjercicioTp4;
import tp6.EjerciciosTp6;
import tp7.EjerciciosTp7;
import tp8.EjerciciosTp8;

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
        EjercicioTp4 tp4 = new EjercicioTp4();
        EjerciciosTp6 tp6 = new EjerciciosTp6();
        EjerciciosTp7 tp7 = new EjerciciosTp7();
        EjerciciosTp8 tp8 = new EjerciciosTp8();

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a los trabajos practicos de la materia Programacion II");
        System.out.println("                                 Alumna: Karina Rodriguez                                  ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Ingrese el numero de TP que desea ejecutar: ");
        System.out.println("Nota: TP n° 1 en Repo Aparte.");
        System.out.println("Nota: TP n° 5 es solo definicion de clases y diagramas UML.");
        System.out.println("1. TP n° 2");
        System.out.println("2. TP n° 3");
        System.out.println("3. TP n° 4");
        System.out.println("4. TP n° 6");
        System.out.println("5. TP n° 7");
        System.out.println("6. TP n° 8");
        System.out.println("0. Salir");
        
        System.out.print("\nIngrese una opcion: ");
        int option = input.nextInt();
        
        switch (option) {
            case 0 -> System.out.println("Gracias por pasarte!");
            case 1 -> tp2.ejecutar();
            case 2 -> tp3.ejecutar();
            case 3 -> tp4.ejecutar();
            case 4 -> tp6.ejecutar();
            case 5 -> tp7.ejecutar();
            case 6 -> tp8.ejecutar();
            default -> System.out.println("Error: Opcion Invalida.");
        }
    }
    
}
