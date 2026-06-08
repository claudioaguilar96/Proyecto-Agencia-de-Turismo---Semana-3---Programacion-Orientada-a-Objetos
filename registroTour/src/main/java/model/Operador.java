package model;

public class Operador {

    // Atributos
    private String nombre;
    private String servicio;
    private Guia guia;

    // Constructor
    public Operador(String nombre, String servicio, Guia guia) {
        this.nombre = nombre;
        this.servicio = servicio;
        this.guia = guia;
    }

    // getter and setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getServicio() {
        return servicio;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    public Guia getGuia() {
        return guia;
    }
    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Operador:\n" +
                "Nombre: " + nombre + "\n" +
                "Tipo de servicio: " + servicio;
    }
}
