
public class Main {
    public static void main(String[] args) {

        Termostato termostato = new Termostato(22, "Automático");

        System.out.println("Temperatura inicial: "
                + termostato.getTemperatura() + "°C");

        System.out.println("Modo de operación: "
                + termostato.getModoOperacion());

        System.out.println("\n--- Pruebas de temperatura ---");

        termostato.setTemperatura(25);
        termostato.setTemperatura(15);
        termostato.setTemperatura(30);
        termostato.setTemperatura(35);
        termostato.setTemperatura(10);

        System.out.println("\n--- Estado final ---");

        System.out.println("Temperatura actual: "
                + termostato.getTemperatura() + "°C");

        System.out.println("Modo de operación: "
                + termostato.getModoOperacion());
    }
}
