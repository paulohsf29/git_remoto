package br.com.rd.pi.pdv.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="TB_FILIAL")
@Data
public class FilialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CD_FILIAL")
    private Long cdFilial;

    @Column(name="NM_FILIAL")
    private String nmFilial;

    @Column(name="NR_CNPJ")
    private String cnpj;

    @Column(name="NR_TELEFONE")
    private String nrTelefone;

}