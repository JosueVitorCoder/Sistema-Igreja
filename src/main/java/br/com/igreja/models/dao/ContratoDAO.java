/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models.dao;

import br.com.igreja.models.Contrato;
import javax.persistence.EntityManager;

/**
 *
 * @author demi
 */
public class ContratoDAO {
    private EntityManager em;

    public ContratoDAO(EntityManager em) {
        this.em = em;
    }
    
    public void addContratoDataAoBanco(Contrato contrato){
        this.em.persist(contrato);
    }
}
