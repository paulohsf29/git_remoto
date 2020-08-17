package br.com.rd.pi.pdv.model.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TB_DOCUMENTO_FISCAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentoFiscalEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID_DOCUMENTO_FISCAL")
    private Long idDocumentoFiscal;

    @JoinColumn(name = "CD_OPERACAO")
    @ManyToOne
    private OperacaoEntity cdOperacao;

    @ManyToOne
    @JoinColumn(name = "CD_FILIAL")
    private FilialEntity cdFilial;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "ID_RECARGA")
    private RecargaEntity recarga;

    @Column(name = "DT_ABERTURA")
    private Date dataAbertura;

    @Column(name = "DT_FECHAMENTO")
    private Date dataFechamento;

    @Column(name = "FL_NF")
    private Integer flagNota;

    @Column(name = "VL_DOCUMENTO_FISCAL")
    private Double valorDocumento;

    @Column(name = "NR_CAIXA")
    private Integer numeroCaixa;

    @OneToMany
    @JoinColumn(name = "ID_NF")
    private List<DocumentoItemEntity> itens;

}
