/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models;

import br.com.igreja.models.enums.Cargo;
import br.com.igreja.models.enums.Sexo;
import br.com.igreja.models.enums.StatusCivil;
import java.awt.Image;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author demi
 */
@Entity
@Table(name = "membros")
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome; 
    @Column(name = "data_nascimento")
    private Date dataDeNascimento;
    private String cpf;
    private String endereco;
    private String numero;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @Enumerated(EnumType.STRING)
    private Cargo cargo;
    @Column(name = "status_civil")
    @Enumerated(EnumType.STRING)
    private StatusCivil statusCivil;
    private byte[] foto;

    public Membro(String nome, Date dataDeNascimento, String cpf, String endereco, String numero, Sexo sexo, Cargo cargo, StatusCivil statusCivil, byte[] foto) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numero = numero;
        this.sexo = sexo;
        this.cargo = cargo;
        this.statusCivil = statusCivil;
        this.foto = foto;
    }

    public Membro(String nome, Date dataDeNascimento, String cpf, String endereco, String numero, Sexo sexo, Cargo cargo, StatusCivil statusCivil) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numero = numero;
        this.sexo = sexo;
        this.cargo = cargo;
        this.statusCivil = statusCivil;
    }

    public Membro() {}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public StatusCivil getStatusCivil() {
        return statusCivil;
    }

    public void setStatusCivil(StatusCivil statusCivil) {
        this.statusCivil = statusCivil;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}