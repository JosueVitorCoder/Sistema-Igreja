/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models.dao;

import br.com.igreja.models.Membro;
import br.com.igreja.models.enums.Cargo;
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
        String jpql = "SELECT m FROM Membro m WHERE m.arquivado = false";
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
    
    public List<Membro> pesquisaPorNome(String nome){
        String jpql;
        List<Membro> membros = null;
        TypedQuery<Membro> query;
        try{
            jpql = "SELECT m FROM Membro m WHERE m.nome LIKE :nome";
            query = em.createQuery(jpql, Membro.class);
            query.setParameter("nome", "%"+nome+"%");
            membros = query.getResultList();
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
        return membros;
    }
    
    public List<Membro> pesquisaPorNomeECargo(String nome, Cargo cargo){
        String jpql;
        TypedQuery<Membro> query;
        List<Membro> membrosResult = null;
        try{
            jpql = "SELECT m FROM Membro m WHERE m.nome LIKE :nome AND m.cargo = :cargo";
            query = em.createQuery(jpql, Membro.class);
            query.setParameter("nome", "%"+nome+"%");
            query.setParameter("cargo", cargo);
            membrosResult = query.getResultList();
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
        
        return membrosResult;
    }
    
    public List<Membro> pesquisaPorArquivados(){
        String jpql = "SELECT m FROM Membro m WHERE m.arquivado = true";
        TypedQuery<Membro> membros = em.createQuery(jpql, Membro.class);
        return membros.getResultList();
    }
}