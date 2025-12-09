package app;

import model.Reserva;
import service.SistemaReservas;

public class Main {

    public static void main(String[] args) {

        SistemaReservas sistema = new SistemaReservas();

        Reserva r1 = new Reserva(8, "2026-02-15", "Maggie", 202453 );
        Reserva r2 = new Reserva(10, "2026-03-16","Camilo",264684);
        Reserva r3 = new Reserva(12, "2026-03-22","Maria",254555);
        Reserva r4 = new Reserva(16, "2026-05-08","Pablo",255556);

        sistema.agregarReserva(r1);
        sistema.agregarReserva(r2);
        sistema.agregarReserva(r3);
        sistema.agregarReserva(r4);

        r1.setDuracionHoras(8);
        r2.setDuracionHoras(10);
        r3.setDuracionHoras(12);
        r4.setDuracionHoras(16);

        sistema.listaDeReserva();

        System.out.println("Total de Reservas Solicitadas;" + sistema.contarReserva());

        try {
            sistema.eliminarReserva(16541);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al eliminar reserva: " + e.getMessage());
        }

        sistema.listaDeReserva();
        System.out.println("Total final:" + sistema.contarReserva());

    }
}
