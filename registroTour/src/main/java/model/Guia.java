package model;

public class Guia extends Persona {

    // Atributos
    private String especialidad;
    private Cliente cliente;

    // Constructor
    public Guia(String nombre, String rut, String especialidad, Cliente cliente) {
        super(nombre, rut);
        this.especialidad = especialidad;
        this.cliente = cliente;
    }

    // Getters and Setters
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    // Metodo toString
    @Override
    public String toString() {
        return "Guia:\n" +
                super.toString() + "\n" +
                "Especialidad: " + especialidad;
    }
}