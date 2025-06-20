package br.com.ifpe.oxefood.api.entregador;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.entregador.Entregador;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class EntregadorRequest {

    @NotBlank(message = "O Nome é de preenchimento obrigatório")
    private String nome;
    
    @NotBlank(message = "O CPF é de preenchimento obrigatório")
    @CPF
    private String cpf;
    
    @NotBlank(message = "O RG é de preenchimento obrigatório")
    private String rg;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @NotBlank(message = "O Telefone é de preenchimento obrigatório")
    private String foneCelular;

    private String foneFixo;

    private Integer qtdEntregasRealizadas;

    private Double valorFrete;

    private String enderecoRua;

    private String enderecoComplemento;

    private String enderecoNumero;

    private String enderecoBairro;

    private String enderecoCidade;

    private String enderecoCep;

    private String enderecoUf;

    public Entregador build() {
        return Entregador.builder()
                .nome(nome)
                .cpf(cpf)
                .rg(rg)
                .dataNascimento(dataNascimento)
                .foneCelular(foneCelular)
                .foneFixo(foneFixo)
                .qtdEntregasRealizadas(qtdEntregasRealizadas)
                .valorFrete(valorFrete)
                .enderecoRua(enderecoRua)
                .enderecoComplemento(enderecoComplemento)
                .enderecoNumero(enderecoNumero)
                .enderecoBairro(enderecoBairro)
                .enderecoCidade(enderecoCidade)
                .enderecoCep(enderecoCep)
                .enderecoUf(enderecoUf)
                .build();
    }
}
