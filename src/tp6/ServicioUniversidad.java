/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

import java.util.Scanner;
import tp6.universidad.Universidad;
import tp6.universidad.Curso;
import tp6.universidad.Profesor;

/**
 *
 * @author kary
 */
public class ServicioUniversidad {
    private Universidad universidad;

    public ServicioUniversidad(String nombre) {
        this.universidad = new Universidad(nombre);
    }
    
    public void seedUniversidad(){
        Seeder seeder = new Seeder();
        seeder.seedUniversidad(universidad);
    }
    
    public void agregarProfesor() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese nombre del profesor: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese su especialidad: ");
        String especialidad = input.nextLine();
        
        Profesor p = new Profesor(nombre, especialidad);
        universidad.agregarProfesor(p);
        
        System.out.println("\nProfesor agregado correctamente!");
    }
    
    public void agregarCurso() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese nombre del curso: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese un codigo para el curso (Ej: PRG-I): ");
        String codigo = input.nextLine();
        
        universidad.listarProfesores();
        System.out.print("\nIngrese el ID del profesor a asignar (X para cancelar): ");
        String id = input.nextLine();
        
        if (!id.equalsIgnoreCase("x")) {
            Profesor p = universidad.buscarProfesorPorId(id);
            Curso c = new Curso(codigo, nombre, p);
            universidad.agregarCurso(c);
            
            System.out.println("\nCurso agregado correctamente!");
        }
        else
            System.out.println("Accion cancelada. Volviendo...");
    }
    
    public void asignarProfesorACurso() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un codigo de curso (? para listar cursos): ");
        String codigo = input.nextLine();
        
        if (codigo.equals("?")) {
            universidad.listarCursos();
            System.out.print("Ingrese un codigo de curso: ");
            codigo = input.nextLine();
        }
        
        System.out.print("\nIngrese el ID del profesor a asignar(? para listar profesores): ");
        String idProfresor = input.nextLine();
        
        if (idProfresor.equals("?")) {
            universidad.listarProfesores();
            System.out.print("Ingrese el ID del profesor: ");
            idProfresor = input.nextLine();
        }
        
        universidad.asignarProfesorACurso(codigo, idProfresor);
        System.out.println("\nProfesor asignado correctamente.");
    }
    
    public void listarProfesoresYSusCursos() {
        universidad.listarProfesores();
    }
    
    public void listarCursosYSuProfesor() {
        universidad.listarCursos();
    }
    
    public void actualizarProfesorDeCurso() {
        // se podria usar el mismo metodo de asignarProfesorACurso, se realiza otro para mostrar que ambos quedaron actualizados al final
        Scanner input = new Scanner(System.in);
        
        universidad.listarCursos(); 
        System.out.println("\n¿Que curso desea actualizar el profesor?");
        
        System.out.print("Ingresar codigo del curso (X para cancelar): ");
        String codigoCurso = input.nextLine();
        
        if (!codigoCurso.equalsIgnoreCase("x")) {
            System.out.println("\nVer profesores disponibles? (si/no)");
            String res = input.nextLine();

            if (res.equalsIgnoreCase("si")) 
                universidad.listarProfesores();
            

            System.out.println("Ingrese el id del profesor para asignar al curso.");
            System.out.print("ID profesor: ");
            String idProfe = input.nextLine();

            universidad.asignarProfesorACurso(codigoCurso, idProfe);  
            System.out.println("Curso actualizado!");
            
            // Se muestra que ambos quedaron actualizados
            Curso curso = universidad.buscarCursoPorCodigo(idProfe);
            curso.mostrarInfo();
            Profesor profe = universidad.buscarProfesorPorId(idProfe);
            profe.mostrarInfo();
        }
        else
            System.out.println("Accion cancelada. Volviendo...");
    }
    
    public void eliminarCurso() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Que curso desea eliminar?");
        System.out.println("Ver cursos disponibles? (si/no)");
        String res = input.nextLine();
        
        if (res.equalsIgnoreCase("si"))
            universidad.listarCursos();
        
        System.out.print("\nIngresar codigo del curso a eliminar (X para cancelar): ");
        String codigoCurso = input.nextLine();
        
        if (!codigoCurso.equalsIgnoreCase("x")) {
            universidad.eliminarCurso(codigoCurso);
        }
        else
            System.out.println("Accion cancelada. Volviendo...");
    }
    
    public void eliminarProfesor() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Que profesor desea eliminar?");
        System.out.println("Ver profesores disponibles? (si/no)");
        String res = input.nextLine();
        
        if (res.equalsIgnoreCase("si"))
            universidad.listarProfesores();
        
        System.out.print("\nIngresar ID del profesor a eliminar (X para cancelar): ");
        String idProfesor = input.nextLine();
        
        if (!idProfesor.equalsIgnoreCase("x")) {
            universidad.eliminarProfesor(idProfesor);
        }
        else
            System.out.println("Accion cancelada. Volviendo...");
    }
    
    public void reporteDeCursos() {
        System.out.println("Cantidad de cursos por profesor:");
        universidad.listarProfesores();
    }
}
