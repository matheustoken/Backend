package com.testejr.entities;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Objects;

@Entity
@Table(name="tb_estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tb_estado_id")
    private Long id;

    @NotNull
    @Column(name = "tb_estado_sigla", length = 2, nullable = false)
    private String sigla;

    @NotNull
    @Column(name="tb_estado_nome",length = 25,nullable =false)
    private String nome;


    public Estado(){
    }

    public Estado(Estado entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.sigla = entity.getSigla();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(id, estado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
