/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7.empleados;

/**
 *
 * @author kari
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double antiguedad;

    public EmpleadoPlanta(String nombre, double sueldoBase, double antiguedad) {
        setNombre(nombre);
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public double getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoBase + (sueldoBase * (antiguedad / 100));
    }
}
