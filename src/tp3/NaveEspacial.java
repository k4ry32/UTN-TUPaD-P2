package tp3;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private boolean volando;

    // Se necesitan 55 unidades de combustible para despegar o avanzar
    // Limite de carga 330

    public void despegar() {
        if (!volando) {
            if (suficienteCombustible()) {
                volando = true;
                combustible -= 60;
                System.out.println("Despegando...");
            }
        }
        else {
                System.out.println("La nave ya esta volando");
        }
    }

    public void avanzar() {
        if (!volando) {
            System.out.println("Primero necesitas despegar!");
        }
        else if (suficienteCombustible()) {
            combustible -= 55;
            System.out.println("La nave avanza");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > 330)
            System.out.println("Error: no se pudo cargar. El limite es de 330 unidades. (Combustible actual: " + combustible + ")");
        else {
            combustible += cantidad;
        }
    }

    public void mostrarEstado () {
        System.out.println("Nave: " + nombre + "\nCombustible: " + combustible);
    }

    private boolean suficienteCombustible() {
        if  (combustible >= 55) {
            return true;
        }
        else {
            System.out.println("No hay suficiente combustible");
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
}
