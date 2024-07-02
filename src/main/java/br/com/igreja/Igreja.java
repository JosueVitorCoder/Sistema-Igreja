package br.com.igreja;

import br.com.igreja.models.Contrato;
import br.com.igreja.models.Oferta;
import br.com.igreja.models.dao.ConectaDAO;
import br.com.igreja.models.dao.ContratoDAO;
import br.com.igreja.models.dao.OfertaDAO;
import br.com.igreja.util.JPAUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author demi
 */
public class Igreja {

    public static void main(String[] args) {
        // Aqui faço vários testes aleatórios para testar certas funcionalidades
        Contrato contrato = new Contrato("yago", 6, 750.00);
        EntityManager em = JPAUtil.getEntityManager();
        ContratoDAO dao = new ContratoDAO(em);
        
        try{
            em.getTransaction().begin();
            dao.addContratoDataAoBanco(contrato);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
}