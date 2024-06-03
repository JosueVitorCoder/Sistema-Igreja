package br.com.igreja;

import br.com.igreja.models.Oferta;
import br.com.igreja.models.dao.OfertaDAO;
import br.com.igreja.util.JPAUtil;
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
        EntityManager em = JPAUtil.getEntityManager();
        OfertaDAO dao = new OfertaDAO(em);
        
        /*Oferta oferta = new Oferta(768, new Date());
        
        try{
            em.getTransaction().begin();
            dao.addOfertaAoBanco(oferta);
            em.getTransaction().commit();
        }catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } */
        
        double valorTotal = 0;
        List<Oferta> ofertas = dao.getOfertaList();
        ofertas.forEach(f -> System.out.println(f));
        
        for(Oferta o : ofertas){
            valorTotal += o.getValor();
        }
        
        System.out.println("Valor Total: "+valorTotal);
    }
}