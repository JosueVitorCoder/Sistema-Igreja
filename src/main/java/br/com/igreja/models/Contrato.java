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
    private String vigenciaMeses;
    private String valorAluguel;
    

    public Contrato(String nomeLocatario, String vigenciaMeses, String valorAluguel) {
        this.nomeLocatario = nomeLocatario;
        this.vigenciaMeses = vigenciaMeses;
        this.valorAluguel = valorAluguel;
    }

    public Contrato(Contrato contrato) {
        this.nomeLocatario = contrato.getNomeLocatario();
        this.vigenciaMeses = contrato.getVigenciaMeses();
        this.valorAluguel = contrato.getValorAluguel();
    }

    public String getNomeLocatario() {
        return nomeLocatario;
    }

    public String getVigenciaMeses() {
        return vigenciaMeses;
    }

    public String getValorAluguel() {
        return valorAluguel;
    }
}
