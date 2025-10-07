/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

import tp6.biblioteca.Autor;
import tp6.biblioteca.Biblioteca;
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
    
    public void seedBibliotecaLibros(Biblioteca biblioteca) {
        Autor autor1 = new Autor("J. K. Rowling", "Britanica");
        biblioteca.agregarLibro("9788498389098", "Harry Potter y la piedra filosofal", 2019, autor1);
        biblioteca.agregarLibro("9788498389104", "Harry Potter y la cámara secreta", 2019, autor1);
        biblioteca.agregarLibro("9789878000121", "Harry Potter y el Prisionero de Azkaban", 2020, autor1);
        biblioteca.agregarLibro("9789878002309", "Harry Potter y el cáliz de fuego", 2020, autor1);
        biblioteca.agregarLibro("9789878000459", "Harry Potter y la Orden del Fénix", 2021, autor1);
        biblioteca.agregarLibro("9788498389142", "Harry Potter y el misterio del príncipe", 2022, autor1);
        
        Autor autor2 = new Autor("Stephen King", "Estadounidense");
        biblioteca.agregarLibro("9789877252576", "It", 2017, autor2);
        biblioteca.agregarLibro("9780307743657", "The Shining", 2012, autor2);
        biblioteca.agregarLibro("9789877255157", "Apocalipsis", 2023, autor2);
        biblioteca.agregarLibro("9789877254679", "El Bazar de los Malos Sueños", 2022, autor2);
        
        Autor autor3 = new Autor("Arthur Conan Doyle", "Britanico");
        biblioteca.agregarLibro("9789509051027", "El Sabueso de los Baskerville", 2004, autor3);
        biblioteca.agregarLibro("9789875710382", "Las Aventuras de Sherlock Holmes", 2012, autor3);
        biblioteca.agregarLibro("9788494476167", "Viaje por el Artico", 2016, autor3);
        
        Autor autor4 = new Autor("Edgar Allan Poe", "Estadounidense");
        biblioteca.agregarLibro("9789500755955", "El Retrato de Dorian Gray", 2016, autor4);
        biblioteca.agregarLibro("9788426134547", "El Gato Negro y Otras Narraciones Extraordinarias", 2005, autor4);
        biblioteca.agregarLibro("9788494220562", "El Escarabajo de oro", 2017, autor4);
        biblioteca.agregarLibro("9788426381545", "Cuentos Macabros", 2011, autor4);
        
        Autor autor5 = new Autor("Agatha Christie", "Britanica");
        biblioteca.agregarLibro("9780007136834", "And Then There Were None", 2003, autor5);
        biblioteca.agregarLibro("9780007119318", "Murder on the Orient Express", 1990, autor5);
        biblioteca.agregarLibro("9780007527557", "Death on the Nile", 2001, autor5);
        
        System.out.println("Se agregaron libros a la biblioteca.");
    }
}
