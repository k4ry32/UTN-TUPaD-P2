/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.punto10;

import java.time.LocalDateTime;

/**
 *
 * @author kary
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(String cbu, double saldo, String codigo, LocalDateTime ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", titular=" + (titular != null ? titular.getNombre() : "N/A") + ", claveSeguridad=" + claveSeguridad + '}';
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        // Evita un bucle infinito y asegura la consistencia de la relación
        if (titular != null && titular.getCuentaBancaria()!= this) {
            titular.setCuentaBancaria(this);
        }
    }   
    
}
