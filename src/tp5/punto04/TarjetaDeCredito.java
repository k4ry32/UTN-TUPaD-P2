
package tp5.punto04;

import java.time.LocalDate;

/**
 *
 * @author kary
 */
public class TarjetaDeCredito {
    private String numero;
    private LocalDate fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", banco=" + banco + ", cliente=" + (cliente != null ? cliente.getNombre() : "N/A") + '}';
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
         // Evita un bucle infinito y asegura la consistencia de la relación
        if (cliente != null && cliente.getTarjetaDeCredito()!= this) {
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    
}
