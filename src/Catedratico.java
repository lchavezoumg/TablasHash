import java.util.Objects;

public class Catedratico {
    private int noCatedratico;
    private String nombre;
    public static int tamanio;

    public Catedratico (int noCatedratico, String nombre){
        this.noCatedratico = noCatedratico;
        this.nombre = nombre;
    }

    public int getNoCatedratico() {
        return noCatedratico;
    }

    public void setNoCatedratico(int noCatedratico) {
        this.noCatedratico = noCatedratico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        return noCatedratico % tamanio;
    }
}
