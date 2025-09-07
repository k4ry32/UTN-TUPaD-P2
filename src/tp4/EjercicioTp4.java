/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author kary
 */
public class EjercicioTp4 {
    public void ejecutar () {
        System.out.println("\nCreando registros de empleados...");
        Empleado empleado1 = new Empleado(15,"Pablo Ramirez", "Tester",1000);
        Empleado empleado2 = new Empleado("Karina Rodriguez", "Programador");
        Empleado empleado3 = new Empleado(24,"Marcela Aguirre", "Project Manager",1500);
        Empleado empleado4 = new Empleado("Miguel Cano", "Programador");
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        
        System.out.println("\nAplicando aumentos a trabajadores por desempeño...");
        actualizacionSalario(empleado1, "porcentaje", 5.2);
        actualizacionSalario(empleado2, "porcentaje", 10.0);
        actualizacionSalario(empleado3, "cantidad_fija", 200);
        actualizacionSalario(empleado4, "cantidad_fija", 50);
        
        System.out.println("\nTotal de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
    static void actualizacionSalario (Empleado empleado, String tipoAumento, double cantidad) {
        if (tipoAumento == "porcentaje") {
            System.out.println(empleado.getNombre() + ", se aplica un aumento del " + cantidad + "%");
            empleado.actualizarSalario(cantidad);
        }
        else {
            System.out.println(empleado.getNombre() + ", se aplica un aumento de " + (int) cantidad + " U$D");
            empleado.actualizarSalario((int) cantidad);
        }
        System.out.println("Nuevo salario: " + empleado.getSalario());
    }
}
