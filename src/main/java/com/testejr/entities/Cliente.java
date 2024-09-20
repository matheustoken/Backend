package com.testejr.entities;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Objects;


@Entity
    @Table(name="tb_cliente")
    public class Cliente {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="tb_cliente_id")
        private Long id;

        @NotNull
        @Column(name = "tb_cliente_nome", length = 100, nullable = false)
        private String nome;

        @NotNull
        @Column(name="tb_cliente_cidade",length = 80,nullable =false)
        private String cidade;

        @NotNull
        @Column(name = "tb_cliente_cep", length = 9,nullable =false)
        private String cep;


        @ManyToOne()
        @NotNull
        @JoinColumn(name ="estado_id")
        private Estado estado;


        public Cliente(){
        }

        public Cliente(Cliente entity) {
            this.id = entity.getId();
            this.cep = entity.getCep();
            this.nome = entity.getNome();
            this.estado = new Estado(entity.getEstado());
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public Estado getEstado() {
            return estado;
        }

        public void setEstado(Estado estado) {
            this.estado = estado;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
