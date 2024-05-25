package br.com.igreja;

import br.com.igreja.models.Dizimo;
import br.com.igreja.models.Membro;
import br.com.igreja.models.dao.DizimoDAO;
import br.com.igreja.models.dao.MembroDAO;
import br.com.igreja.models.enums.Cargo;
import br.com.igreja.models.enums.Sexo;
import br.com.igreja.models.enums.StatusCivil;
import br.com.igreja.util.JPAUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

/**
 *
 * @author demi
 */
public class Igreja {

    public static void main(String[] args) {
        // Aqui faço vários testes aleatórios para testar certas funcionalidades

        EntityManager em = JPAUtil.getEntityManager();
        MembroDAO membroDAO = new MembroDAO(em);
        DizimoDAO dizimoDAO = new DizimoDAO(em);
        
        List<Membro> membros = membroDAO.getLista();
        
        Dizimo dizimo = new Dizimo(new Date(), 400, membros.get(3));
        
        try{

            em.getTransaction().begin();
            dizimoDAO.addDizimoAoBanco(dizimo);
            em.getTransaction().commit();

        }catch (Exception e) {

            em.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            em.close();
        }
    }
}