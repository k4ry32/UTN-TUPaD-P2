
package tp5.punto01;

/**
 *
 * @author kary
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", pasaporte=" + (pasaporte != null ? pasaporte.getNumero() : "N/A" ) + '}';
    }
    
    public void setPasaporte (Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        // Evita un bucle infinito y asegura la consistencia de la relación
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
    
    public Pasaporte getPasaporte () {
        return pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
