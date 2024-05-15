/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models;

import br.com.igreja.models.enums.Cargo;
import br.com.igreja.models.enums.Sexo;
import br.com.igreja.models.enums.StatusCivil;
import java.awt.Image;
import java.util.Date;

/**
 *
 * @author demi
 */

public class Membro {
    private String nome; 
    private Date dataDeNascimento;
    private String cpf;
    private String endereco;
    private String numero;
    private Sexo sexo;
    private Cargo cargo;
    private StatusCivil statusCivil;
    private Image foto;

    public Membro(String nome, Date dataDeNascimento, String cpf, String endereco, String numero, Sexo sexo, Cargo cargo, StatusCivil statusCivil, Image foto) {
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

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }
    
    
    
}
