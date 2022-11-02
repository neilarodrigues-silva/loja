package gft.loja.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistroFilialDTO {


    private String nome;
    private EnderecoDTO endereco;

}
