/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.persistence.Column;
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
@Table(name = "ofertas")
public class Oferta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double valor;
    @Column(name = "data_oferta")
    private Date data;
    @Column(name = "ano_data")
    private int anoData;
    @Column(name = "mes_data")
    private int mesData;

    public Oferta(double valor, Date data) {
        this.valor = valor;
        this.data = data;
        this.anoData = getAnoData();
        this.mesData = getMesData();
    }

    public Oferta() {
    }
    
    public int getAnoData(){
        LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	int ano = localDate.getYear();
        return ano;
    }
    
    public int getMesData(){
        LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	int mes = localDate.getMonthValue();
        return mes;
    }

    public Long getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Valor: "+valor+", Data: "+data;
    }
}
