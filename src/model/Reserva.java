package model;

public class Reserva {

    private int idReserva;
    private String cliente;
    private String fecha;
    private int duracionHoras;

    public Reserva(int duracionHoras, String fecha, String cliente, int idReserva) {
        this.duracionHoras = duracionHoras;
        this.fecha = fecha;
        this.cliente = cliente;
        this.idReserva = idReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + idReserva +
                " | Cliente: " + cliente +
                " | Fecha: " + fecha +
                " | Duración: " + duracionHoras + " horas");
    }
}
