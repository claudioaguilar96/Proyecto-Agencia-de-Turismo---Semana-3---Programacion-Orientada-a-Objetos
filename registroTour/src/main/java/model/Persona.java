package model;

public class Persona {

    // Atributos
    private String nombre;
    private String rut;

    // Constructor
    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    // Getter and Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    // Metodo toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "RUT: " + rut;
    }
}