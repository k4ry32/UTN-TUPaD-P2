/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7.animales;

/**
 *
 * @author kari
 */
public class Gato extends Animal {
    private String color;
    
    public Gato(String nombre, String color) {
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
        return "¡Miau! ¡Miau! (El gato " + getNombre() + " está maullando)";
    }
    
    @Override
    public String describirAnimal() {
        return "Soy un gato llamado " + getNombre() + " de color " + getColor();
    }
}