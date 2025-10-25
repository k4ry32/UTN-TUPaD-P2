/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7.figuras;

/**
 *
 * @author kari
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        setNombre(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    
    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
