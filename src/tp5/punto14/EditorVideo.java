/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.punto14;

/**
 *
 * @author kary
 */
public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        
        System.out.println("Exportando render en formato " + render.getFormato() + " del proyecto " + proyecto.getNombre());
    }
}
