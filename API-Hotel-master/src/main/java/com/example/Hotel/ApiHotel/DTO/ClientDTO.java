package com.example.Hotel.ApiHotel.DTO;
import com.example.Hotel.ApiHotel.Models.ClientDAO;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long idEndereco;
    private String senha;

    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private String aniversario;


    public ClientDAO toDAO(){
        return ClientDAO.
                builder()
                .id(id)
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


