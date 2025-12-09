package service;


import model.Reserva;

import java.util.ArrayList;

public class SistemaReservas {
    private ArrayList<Reserva> reservas = new ArrayList<>();


    public void agregarReserva(Reserva r) {
        reservas.add(r);
        System.out.println("Reserva agregada correctamente.");
    }


    public void eliminarReserva(int idReserva) {
        boolean encontrada = false;

        for (Reserva r : reservas) {
            if (r.getIdReserva() == idReserva) {
                reservas.remove(r);
                encontrada = true;
                System.out.println("Reserva eliminada.");
                break;
            }
        }
        if (!encontrada) {
            throw new IllegalArgumentException("No existe una Reserva con el ID: " + idReserva);
        }

    }

    public void listaDeReserva (){

        System.out.println("--- LISTA DE RESERVAS---");
        for (Reserva r : reservas){
            r.mostrarInfo();
        }
    }

    public int comtarReservas(){
        return reservas.size();
    }
}

