
package tp5.punto02;

/**
 *
 * @author kary
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + (celular != null ? celular.getMarcaYModelo() : "N/A") + '}';
    }  
    
    public void setCelular(Celular celular) {
        this.celular = celular;
        // Evita un bucle infinito y asegura la consistencia de la relación
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }
    
    public Celular getCelular(){
        return celular;
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
