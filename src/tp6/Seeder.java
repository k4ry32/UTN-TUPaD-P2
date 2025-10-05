/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

import tp6.inventario.CategoriaProducto;
import tp6.inventario.Inventario;
import tp6.inventario.Producto;

/**
 *
 * @author kary
 */
public class Seeder {
    public void seedInventarioProductos(Inventario inventario) {
        inventario.agregarProducto(new Producto("Remera Mujer", 10500, 10, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("Remera Hombre", 11300, 12, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("Galletas Pepitos", 1810, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("Galletas Oreo Pack x3", 5179, 25, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("Galletas Surtido Bagley", 3049, 30, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("Botella Leche 1L", 3200, 15, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("Cafe Nescafe Instantaneo", 9475, 14, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("Gaseosa CocaCola 2.5L", 3450, 20, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("Pendrive 64GB", 17540, 24, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("Mouse Gamer Logitech", 70175, 8, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("Disco SSD Kingston 480GB", 86987, 15, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("Juego Mesa y 4 Sillas", 311301, 3, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("Tendedero Aluminio Plegable", 44534, 10, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("Estanteria Organizadora", 63156, 4, CategoriaProducto.HOGAR));
                
        System.out.println("Se agregaron productos al inventario.");
    }
}
