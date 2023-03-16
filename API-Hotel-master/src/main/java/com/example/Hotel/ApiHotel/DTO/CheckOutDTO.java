package com.example.Hotel.ApiHotel.DTO;

import javax.xml.crypto.Data;

public class CheckOutDTO {
    private int idCheckIn;
    private double precoTotal;
    private int idReserva;
    private Data horarioSai;
    private int quantidadeCart;

    public int getIdCheckIn() {
        return idCheckIn;
    }

    public void setIdCheckIn(int idCheckIn) {
        this.idCheckIn = idCheckIn;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Data getHorarioSai() {
        return horarioSai;
    }

    public void setHorarioSai(Data horarioSai) {
        this.horarioSai = horarioSai;
    }

    public int getQuantidadeCart() {
        return quantidadeCart;
    }

    public void setQuantidadeCart(int quantidadeCart) {
        this.quantidadeCart = quantidadeCart;
    }
}
