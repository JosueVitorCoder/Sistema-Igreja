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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author demi
 */
@Entity
@Table(name = "dizimos")
public class Dizimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_entrada")
    private Date data;
    @Column(name = "ano_data")
    private int anoData;
    @Column(name = "mes_data")
    private int mesData;
    private double valor;
    @ManyToOne()
    @JoinColumn(name = "membro_id")
    private Membro membro;

    public Dizimo() {
    }

    public Dizimo(Date data, double valor, Membro membro) {
        this.data = data;
        this.valor = valor;
        this.membro = membro;
        this.anoData = getAnoData();
        this.mesData = getMesData();
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
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    @Override
    public String toString() {
        return "Membro: "+membro.getNome()+", valor: "+valor+", data: "+data;
    }
}
