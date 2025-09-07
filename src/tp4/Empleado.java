
package tp4;

/**
 *
 * @author kary
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    public Empleado (int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        setSalario(salario);
        totalEmpleados++;
    }
    
    public Empleado (String nombre, String puesto) {
        this(totalEmpleados + 1, nombre, puesto, 1200);
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public static int mostrarTotalEmpleados () {
        return totalEmpleados;
    }
    
    public void actualizarSalario (double porcentaje) {
        double nuevo_salario = this.salario + (this.salario * porcentaje) / 100; 
        setSalario(nuevo_salario);
    }
    
    public void actualizarSalario (int aumento) {
        double nuevo_salario = this.salario + aumento; 
        setSalario(nuevo_salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    } 
}
