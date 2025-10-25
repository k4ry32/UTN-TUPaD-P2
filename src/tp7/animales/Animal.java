/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7.animales;

/**
 *
 * @author kari
 */
public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String hacerSonido() {
        return "El animal hace un sonido genérico";
    }
    
    public String describirAnimal() {
        return "Soy un animal";
    }
}