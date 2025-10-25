/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7.animales;

/**
 *
 * @author kari
 */
public class Perro extends Animal {
    private String raza;
    
    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public String hacerSonido() {
        return "¡Guau! ¡Guau! (El perro " + getNombre() + " está ladrando)";
    }
    
    @Override
    public String describirAnimal() {
        return "Soy un perro llamado " + getNombre() + " de raza " + raza;
    }
}