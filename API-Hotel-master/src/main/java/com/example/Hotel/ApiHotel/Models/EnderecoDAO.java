package com.example.Hotel.ApiHotel.Models;

import com.example.Hotel.ApiHotel.DTO.EnderecoDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "Endereco")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter


public class EnderecoDAO {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idEndereco;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "moradores")
    private List<ClientDAO> moradores;
    private String endereco;
    private int numero;
    private String cidade;
    private String estado;
    private String pais;

    public  EnderecoDTO toDto(){
        return EnderecoDTO.builder()
                .idEndereco(idEndereco)
                .endereco(endereco)
                .numero(numero)
                .cidade(cidade)
                .estado(estado)
                .pais(pais)
                .build();
    }



    }


