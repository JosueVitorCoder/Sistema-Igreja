/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author demi
 */
public class JPAUtil {
    public static final EntityManagerFactory FACTORY = Persistence
            .createEntityManagerFactory("sol");
    
    public static EntityManager getEntityManager(){
        EntityManager em = FACTORY.createEntityManager();
        return em;
    }
}
