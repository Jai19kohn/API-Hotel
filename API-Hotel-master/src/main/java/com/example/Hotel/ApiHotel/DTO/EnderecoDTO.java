package com.example.Hotel.ApiHotel.DTO;
import com.example.Hotel.ApiHotel.Models.EnderecoDAO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EnderecoDTO {

    private Long idEndereço;

    private String endereco;
    private int numero;
    private String cidade;
    private String estado;
    private String pais;

//    public EnderecoDAO toDAO(){
//        return EnderecoDAO.
//                builder()
//                .endereco(endereco)
//                .numero(numero)
//                .cidade(cidade)
//                .estado(estado)
//                .pais(pais)
//                .build();
//    }

}
