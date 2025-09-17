/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.punto13;

/**
 *
 * @author kary
 */
public class GeneradorQR {
    
    public void generar (String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);
        
        System.out.println("Generando el codigo con el valor " + codigoQR.getValor() + ", para el usuario " + usuario.getNombre() );
    }
}
