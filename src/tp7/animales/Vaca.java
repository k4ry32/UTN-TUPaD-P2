/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7.animales;

/**
 *
 * @author kari
 */
public class Vaca extends Animal {
    private String color;

    public Vaca(String nombre, String color) {
        super(nombre);
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String hacerSonido() {
        return "¡Muuu! ¡Muuu! (La vaca " + getNombre() + " está mugiendo)";
    }
    
    @Override
    public String describirAnimal() {
        return "Soy una vaca llamada " + getNombre() + " de color " + getColor();
    }
}