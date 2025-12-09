package app;

import model.Reserva;
import service.SistemaReservas;

public class Main {

    public static void main(String[] args) {

        SistemaReservas sistema = new SistemaReservas();

        Reserva r1 = new Reserva(14, "2026-02-15", "Maggie", 202453 );
        Reserva r2 = new Reserva(24, "2026-03-16","Camilo",264684);

        sistema.agregarReserva(r1);
        sistema.agregarReserva(r2);

        r2.setDuracionHoras(6);
        r1.setDuracionHoras(8);

        sistema.listaDeReserva();

        System.out.println("Total de Reservas Solicitadas;" + sistema.comtarReservas());

        try {
            sistema.eliminarReserva(16541);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al eliminar reserva: " + e.getMessage());
        }

        sistema.listaDeReserva();
        System.out.println("Total final:" + sistema.comtarReservas());

    }
}
