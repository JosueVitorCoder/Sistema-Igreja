/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models.dao;

import br.com.igreja.models.Dizimo;
import javax.persistence.EntityManager;

/**
 *
 * @author demi
 */
public class DizimoDAO {
    EntityManager em;

    public DizimoDAO(EntityManager em) {
        this.em = em;
    }
    
    public void addDizimoAoBanco(Dizimo dizimo){
        em.persist(dizimo);
    }
}
