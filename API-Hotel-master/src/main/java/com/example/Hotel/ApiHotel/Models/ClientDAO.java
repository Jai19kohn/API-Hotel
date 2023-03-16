package com.example.Hotel.ApiHotel.Models;

import com.example.Hotel.ApiHotel.DTO.ClientDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "moradores")
    private EnderecoDAO endereco;
    private String senha;

    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private String aniversario;

    public ClientDTO toDTO (){
        return ClientDTO.builder()
                .id(idCliente)
                .idEndereco(idEndereco)
                .senha(senha)
                .nome(nome)
                .sobrenome(sobrenome)
                .telefone(telefone)
                .email(email)
                .aniversario(aniversario)
                .build();
    }
}