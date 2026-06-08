package model;

public class Cliente extends Persona {

    // atributos
    private String direccion;

    // Constructor
    public Cliente(String nombre, String rut, String direccion) {
        super(nombre, rut);
        this.direccion = direccion;
    }

    // Getter and setter
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    // Metodo to String
    @Override
    public String toString() {
        return "Cliente:\n" +
                super.toString() + "\n" +
                "Dirección: " + direccion;
    }
}