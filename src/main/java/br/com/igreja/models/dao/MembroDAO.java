/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models.dao;

import br.com.igreja.models.Membro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
    
    public List<Membro> getLista(){
        String jpql = "SELECT m FROM Membro m";
        TypedQuery<Membro> membros = em.createQuery(jpql, Membro.class);
        return membros.getResultList();
    }
    
    // Arquivar enventual saída de membro pelo seu id
    public void arquivar(Long id) {
    EntityTransaction transaction = null;

        try {
            transaction = em.getTransaction();
            transaction.begin();

            Query query = em.createQuery("UPDATE Membro m SET m.arquivado = true WHERE m.id = :id");
            query.setParameter("id", id);

            int rowsUpdated = query.executeUpdate();
            transaction.commit();

            System.out.println("Número de registros atualizados: " + rowsUpdated);
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public void desarquivar(Long id){
        
        EntityTransaction transaction = null;

        try {
            transaction = em.getTransaction();
            transaction.begin();

            Query query = em.createQuery("UPDATE Membro m SET m.arquivado = false WHERE m.id = :id");
            query.setParameter("id", id);

            int rowsUpdated = query.executeUpdate();
            transaction.commit();

            System.out.println("Número de registros atualizados: " + rowsUpdated);
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
}