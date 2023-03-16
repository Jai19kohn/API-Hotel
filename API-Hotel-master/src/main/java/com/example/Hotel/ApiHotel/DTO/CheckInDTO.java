package com.example.Hotel.ApiHotel.DTO;

import java.util.Date;

public class CheckInDTO {
    private int idCheckIn;
    private int idReserva;
    private int idCliente;
    private Date horarioCheg;
    private int quantCart;

    public int getIdCheckIn() {
        return idCheckIn;
    }

    public void setIdCheckIn(int idCheckIn) {
        this.idCheckIn = idCheckIn;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getHorarioCheg() {
        return horarioCheg;
    }

    public void setHorarioCheg(Date horarioCheg) {
        this.horarioCheg = horarioCheg;
    }

    public int getQuantCart() {
        return quantCart;
    }

    public void setQuantCart(int quantCart) {
        this.quantCart = quantCart;
    }
}
