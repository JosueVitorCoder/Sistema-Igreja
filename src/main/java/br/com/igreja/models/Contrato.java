/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models;

/**
 *
 * @author demi
 */

public class Contrato {
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
