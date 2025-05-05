package br.com.ifpe.oxefood.modelo.produto;

import org.hibernate.annotations.SQLRestriction;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table (name = "Produto")
@SQLRestriction("habilidade=true")

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Produto extends EntidadeAuditavel {

    @Column
    private String codigo;

    @Column
    private String descricao;

    @Column
    private Double valorUnitario;

    @Column
    private Integer tempoEntregaMinino;

    @Column
    private Integer tempoEntregaMaximo;
    
}
