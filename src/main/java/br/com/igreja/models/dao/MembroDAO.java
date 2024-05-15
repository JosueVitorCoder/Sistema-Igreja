/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models.dao;

import br.com.igreja.models.Membro;
import javax.persistence.EntityManager;

/**
 *
 * @author demi
 */
public class MembroDAO {
    EntityManager em;

    public MembroDAO(EntityManager em) {
        this.em = em;
    }
    
    public void addMembroBD(Membro membro){
        em.persist(membro);
    }
}
