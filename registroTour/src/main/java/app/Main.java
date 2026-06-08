package app;

import model.Operador;
import model.Cliente;
import model.Guia;

public class Main {
    public static void main(String[] args) {

        // Instancia 1
        Cliente cliente1 = new Cliente("Ana López", "12.345.678-9", "Av. olvidada 123");
        Guia guia1 = new Guia("Carlos Pérez", "98.765.432-1", "Senderismo", cliente1);
        Operador operado1 = new Operador("Llanquihue Tour", "tour Montaña", guia1);

        // Instancia 2
        Cliente cliente2 = new Cliente("aldo lenguado", "53.233.678-9", "calle falsa 555");
        Guia guia2 = new Guia("duke fish", "23.341.234-2", "Senderismo", cliente2);
        Operador operador2 = new Operador("Llanquihue Tour", "tour Costa", guia2);

        // Instancia 3
        Cliente cliente3 = new Cliente("licenciado aguilar", "16.456.231-7", "loma perdida 211");
        Guia guia3 = new Guia("Avelardo plumas", "23.212.333-4", "Senderismo", cliente3);
        Operador operador3 = new Operador("Llanquihue Tour", "tour Campo", guia3);

        // presentacion de datos
        System.out.println();
        System.out.println(operado1);
        System.out.println();
        System.out.println(guia1);
        System.out.println();
        System.out.println(cliente1);
        System.out.println();

        System.out.println(operador2);
        System.out.println();
        System.out.println(guia2);
        System.out.println();
        System.out.println(cliente2);
        System.out.println();

        System.out.println(operador3);
        System.out.println();
        System.out.println(guia3);
        System.out.println();
        System.out.println(cliente3);
        System.out.println();
    }
}