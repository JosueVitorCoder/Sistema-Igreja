/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models.dao;

import br.com.igreja.models.Dizimo;
import br.com.igreja.models.Membro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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
    
    public List<Dizimo> getDizimantesList(){
        List<Dizimo> dizimos = null;
        TypedQuery<Dizimo> query = null;
        String jpql = "SELECT d FROM Dizimo d";
        try{
            query = em.createQuery(jpql, Dizimo.class);
            dizimos = query.getResultList();
        }catch(Exception e){
            System.out.println("Algo deu errado no método: 'getDizimantesList()'");
        }
        return dizimos;
    }
}
