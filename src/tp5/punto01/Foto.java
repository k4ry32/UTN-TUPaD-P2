
package tp5.punto01;

import java.util.Arrays;

/**
 *
 * @author kary
 */
public class Foto {
    private byte[] imagen;
    private String formato;

    public Foto(byte[] imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + Arrays.toString(imagen) + ", formato=" + formato + '}';
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

}
