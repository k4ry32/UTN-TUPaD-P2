package tp3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (esAnioValido(añoPublicacion)) {
            this.añoPublicacion = añoPublicacion;
        }
        else {
            System.out.println("No es un año valido.");
        }
    }

    private boolean esAnioValido(int anio) {
        return anio <= LocalDate.now().getYear();
    }
}
