package br.com.igreja;

import br.com.igreja.models.Membro;
import br.com.igreja.models.dao.MembroDAO;
import br.com.igreja.models.enums.Cargo;
import br.com.igreja.models.enums.Sexo;
import br.com.igreja.models.enums.StatusCivil;
import br.com.igreja.util.JPAUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author demi
 */
public class Igreja {

    public static void main(String[] args) {
//        EntityManager em = JPAUtil.getEntityManager();
//        LocalDate data = LocalDate.now();
//        
//        Membro m = new Membro("Elizio", data, "000.000.000-00", "Sol Nascente", "+00 (00)00000-0000", Sexo.MASCULINO, Cargo.PASTOR, StatusCivil.CASADO);
//        MembroDAO dao = new MembroDAO(em);
//        
//        try{
//            
//            em.getTransaction().begin();
//            dao.addMembroBD(m);
//            em.getTransaction().commit();
//        
//        }catch (Exception e) {
//            
//            em.getTransaction().rollback();
//            e.printStackTrace();
//            
//        } finally {
//            
//            em.close();
//            
//        }


          String[] cargos = {"Pastor(a)", "Diácono(a)", "Presbítero(a)", "Evangelista", "Missionário(a)"};
          String jcomboBox = "Diácono(a)";
          
              if(jcomboBox.equalsIgnoreCase("Pastor(a)")){
                  System.out.println("Seu cargo é pastor!");
              }else if(jcomboBox.equalsIgnoreCase("Diácono(a)")){
                  System.out.println("Seu cargo é Diácono(a)!");
              }
          
    }
}
