package br.com.igreja;

import br.com.igreja.models.Membro;
import br.com.igreja.models.dao.MembroDAO;
import br.com.igreja.models.enums.Cargo;
import br.com.igreja.models.enums.Sexo;
import br.com.igreja.models.enums.StatusCivil;
import br.com.igreja.util.JPAUtil;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author demi
 */
public class Igreja {

    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        Date data = new Date();
        
        Membro m = new Membro("Elizio", data, "000.000.000-00", "Sol Nascente", "+00 (00)00000-0000", Sexo.MASCULINO, Cargo.PASTOR, StatusCivil.CASADO);
        MembroDAO dao = new MembroDAO(em);
        
        em.getTransaction().begin();
        dao.addMembroBD(m);
        em.getTransaction().commit();
    }
}
