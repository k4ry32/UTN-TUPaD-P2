package tp3;

import java.util.Scanner;

/**
 *
 * @author kary
 */
public class EjerciciosTp3 {

    public void ejecutar () {
        Scanner input = new Scanner(System.in);
        boolean repeatFlag = true;
        verMenu();

        while (repeatFlag) {
            System.out.print("\nIngrese una opcion (1 al 5): ");
            int option = Integer.parseInt(input.nextLine());

            System.out.println("");
            switch (option) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
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
        System.out.println("Bienvenido a los ejercicios del TP n° 3");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Elija una opcion:");
        System.out.println("1. Registro de estudiantes.");
        System.out.println("2. Registro de mascotas.");
        System.out.println("3. Biblioteca");
        System.out.println("4. Granja Digital.");
        System.out.println("5. Nave espacial.");
    }

    static void ejercicio1 () {
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Marcos");
        estudiante.setApellido("Suarez");
        estudiante.setCurso("Estadistica");
        estudiante.setCalificacion(8);

        System.out.println("Nuevo estudiante creado:");
        estudiante.mostrarInfo();

        System.out.println("\nSubir nota al estudiante:");
        estudiante.subirCalificacion(2);
        System.out.println("Nueva nota: " + estudiante.getCalificacion());
        System.out.println("Bajar nota al  estudiante:");
        estudiante.bajarCalificacion(3);
        System.out.println("Nueva nota: " + estudiante.getCalificacion());
    }

    static void ejercicio2 () {
        Mascota mascota = new Mascota();

        mascota.setNombre("Koda");
        mascota.setEspecie("Gato");

        System.out.println("Ha nacido una nueva mascota:");
        mascota.mostrarInfo();

        mascota.cumplirAnios();
        mascota.cumplirAnios();

        System.out.println("Luego de dos años...");
        mascota.mostrarInfo();
    }

    static void ejercicio3 () {
        Libro libro = new Libro();
        Scanner input = new Scanner(System.in);

        libro.setTitulo("Muerte en el Nilo");
        libro.setAutor("Agatha Christie");
        libro.setAñoPublicacion(1937);

        System.out.println("Nuevo libro agregado: " +  libro.getTitulo() + " (" + libro.getAñoPublicacion() + "), escrito por " +  libro.getAutor());

        System.out.println("Editar año del libro:");
        System.out.print("Ingrese un nuevo año: ");
        int nuevoAnio = Integer.parseInt(input.nextLine());
        libro.setAñoPublicacion(nuevoAnio);
        System.out.print("Ingrese un nuevo año: ");
        nuevoAnio = Integer.parseInt(input.nextLine());
        libro.setAñoPublicacion(nuevoAnio);
        System.out.println("Libro editado: " + libro.getTitulo() + " (" + libro.getAñoPublicacion() + "), escrito por " +  libro.getAutor());
    }

    static void ejercicio4 () {
        Gallina gallina_1 = new Gallina();
        Gallina gallina_2 = new Gallina();

        gallina_1.setIdGallina(1);
        gallina_2.setIdGallina(2);

        System.out.println("Hay una gallina nueva!");
        gallina_1.mostrarEstado();
        System.out.println("Hay una gallina nueva!");
        gallina_2.mostrarEstado();

        System.out.println("\nLuego de un año, la gallina con ID " +  gallina_1.getIdGallina() + ":");
        gallina_1.envejecer();
        for (int i=0; i<=56; i++) {
            gallina_1.ponerHuevo();
        }
        gallina_1.mostrarEstado();

        System.out.println("\nLuego de dos años, la gallina con ID " +  gallina_2.getIdGallina() + ":");
        gallina_2.envejecer();
        for (int i=0; i<=43; i++) {
            gallina_2.ponerHuevo();
        }
        gallina_2.mostrarEstado();
    }

    static void ejercicio5 () {
        NaveEspacial nave_espacial = new NaveEspacial();
        nave_espacial.setNombre("ET");
        nave_espacial.setCombustible(50);

        nave_espacial.avanzar();
        nave_espacial.despegar();
        nave_espacial.recargarCombustible(200);
        System.out.println("Combustible actual: "  + nave_espacial.getCombustible());
        nave_espacial.despegar();
        nave_espacial.avanzar();
        System.out.println("Estado actual: ");
        nave_espacial.mostrarEstado();

        nave_espacial.recargarCombustible(200);
    }
}
