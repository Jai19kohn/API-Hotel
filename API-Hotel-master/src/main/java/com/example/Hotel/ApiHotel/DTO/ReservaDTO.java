package com.example.Hotel.ApiHotel.DTO;

import java.util.Date;

public class ReservaDTO {
    private int idReserva;
    private int idQuarto;
    private Date dataInicio;
    private Date dataFim;
    private int quantPes;
    private double preco;

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public int getQuantPes() {
        return quantPes;
    }

    public void setQuantPes(int quantPes) {
        this.quantPes = quantPes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
