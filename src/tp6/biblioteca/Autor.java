/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.biblioteca;

import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author kary
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.id =  UUID.randomUUID().toString();
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Autor autor = (Autor) obj;
        return Objects.equals(id, autor.id);
    }

    public String getId() {
        return id;
    }
}
