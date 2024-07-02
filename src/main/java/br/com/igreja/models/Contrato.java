/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author demi
 */
@Entity
@Table(name = "contratodata")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeLocatario;
    private Integer vigenciaMeses;
    private Double valorAluguel;

    public Contrato(String nomeLocatario, Integer vigenciaMeses, Double valorAluguel) {
        this.nomeLocatario = nomeLocatario;
        this.vigenciaMeses = vigenciaMeses;
        this.valorAluguel = valorAluguel;
    }

    public Contrato() {
    }

    public String getNomeLocatario() {
        return nomeLocatario;
    }

    public Integer getVigenciaMeses() {
        return vigenciaMeses;
    }

    public Double getValorAluguel() {
        return valorAluguel;
    }
}
