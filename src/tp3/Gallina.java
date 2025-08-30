package tp3;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public void mostrarEstado() {
        System.out.println("ID: " + idGallina + "\nEdad: " + edad + "\nHuevos Puestos: "  + huevosPuestos);
    }

    public void envejecer() {
        edad += 1;
    }

    public void ponerHuevo() {
        huevosPuestos += 1;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
}
