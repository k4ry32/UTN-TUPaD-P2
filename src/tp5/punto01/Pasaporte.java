
package tp5.punto01;

import java.time.LocalDate;

/**
 *
 * @author kary
 */
public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, LocalDate fechaEmision, byte[] imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto (imagen, formato);
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", nombreTitular=" + (titular != null ? titular.getNombre() : "N/A") + '}';
    }
   
    public void setTitular(Titular titular) {
        this.titular = titular;
        // Evita un bucle infinito y asegura la consistencia de la relación
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
    public Titular getTitular() {
        return titular;
    } 

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }
}
