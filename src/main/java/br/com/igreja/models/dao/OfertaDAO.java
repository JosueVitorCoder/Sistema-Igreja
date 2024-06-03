/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models.dao;

import br.com.igreja.models.Oferta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author demi
 */
public class OfertaDAO {
    EntityManager em;

    public OfertaDAO(EntityManager em) {
        this.em = em;
    }
    
    public void addOfertaAoBanco(Oferta oferta){
        em.persist(oferta);
    }
    
    public List<Oferta> getOfertaList(){
        String jpql = "SELECT o FROM Oferta o";
        TypedQuery query;
        List<Oferta> ofertas = null;
        try{
            query = em.createQuery(jpql, Oferta.class);
            ofertas = query.getResultList();
        }catch(Exception e){
            e.printStackTrace();
        }
        return ofertas;
    }
    
    public List<Oferta> getPesquisa(int ano, int mes) {
        String jpql = "SELECT o FROM Oferta o WHERE o.anoData = :ano AND o.mesData = :mes";
        TypedQuery<Oferta> query = null;
        List<Oferta> ofertas = null;
        System.out.println("Res: "+mes + "()" + ano);
        try {
            query = em.createQuery(jpql, Oferta.class);
            query.setParameter("ano", ano);
            query.setParameter("mes", mes);
            ofertas = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            // Lançar a exceção ou tratá-la conforme a necessidade
            throw new RuntimeException("Erro ao executar a pesquisa de ofertas", e);
        } finally {
            // Se o EntityManager for gerenciado manualmente, feche-o aqui
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
        return ofertas;
    }
    
    public List<Oferta> getPesquisa(int ano){
        String jpql = "SELECT o FROM Oferta o WHERE o.anoData = :ano";
        TypedQuery<Oferta> query = null;
        List<Oferta> ofertas = null;
        
        try{
            query = em.createQuery(jpql, Oferta.class);
            query.setParameter("ano", ano);
            ofertas = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
        return ofertas;
    }
}
