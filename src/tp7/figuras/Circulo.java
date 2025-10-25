/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7.figuras;

/**
 *
 * @author kari
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String nombre) {
        setNombre(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    
}
