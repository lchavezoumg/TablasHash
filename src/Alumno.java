import java.util.Objects;

public class Alumno {
    private String carne;
    private String nombre;
    public static int tamanio;

    public Alumno(String carne, String nombre) {
        this.carne = carne;
        this.nombre = nombre;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public int hashCode() {
        long hash = carne.hashCode()+nombre.hashCode();
        return (int) hash % tamanio;
    }
}
