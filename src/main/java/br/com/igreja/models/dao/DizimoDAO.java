/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models.dao;

import br.com.igreja.models.Dizimo;
import br.com.igreja.models.Membro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
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
    
    public List<Dizimo> getPesquisa(int mes, int ano){
        TypedQuery<Dizimo> query = null;
        List<Dizimo> dizimos = null;
        String jpql = "SELECT d FROM Dizimo d WHERE d.anoData = :ano AND d.mesData = :mes";
        try{
            query = em.createQuery(jpql, Dizimo.class);
            query.setParameter("ano", ano);
            query.setParameter("mes", mes);
            dizimos = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
        return dizimos;
    }
    
    public List<Dizimo> getPesquisa(int ano){
        EntityTransaction transaction = null;
        TypedQuery<Dizimo> query = null;
        List<Dizimo> dizimos = null;
        String jpql = "SELECT d FROM Dizimo d WHERE d.anoData = :ano";
        try{
            query = em.createQuery(jpql, Dizimo.class);
            query.setParameter("ano", ano);
            dizimos = query.getResultList();
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
        return dizimos;
    }
}
