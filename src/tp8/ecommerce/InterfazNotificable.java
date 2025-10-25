/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp8.ecommerce;

/**
 *
 * @author kari
 */
public interface InterfazNotificable {
    void notificarCambioEstado(Pedido pedido, String estadoAnterior, String estadoNuevo);
}
