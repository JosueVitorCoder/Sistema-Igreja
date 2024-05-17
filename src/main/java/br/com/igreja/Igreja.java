package br.com.igreja;

import br.com.igreja.models.Membro;
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
        
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\Tabela de membros.png"));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            try {
                for (int readNum; (readNum = fis.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            byte[] bytes = bos.toByteArray();
            
            EntityManager em = JPAUtil.getEntityManager();
            Membro m = new Membro("Elizio", new Date(), "000.000.000-00", "Sol Nascente", "+00 (00)00000-0000", Sexo.MASCULINO, Cargo.PASTOR, StatusCivil.CASADO, bytes);
            MembroDAO dao = new MembroDAO(em);
            //
            try{
                
                em.getTransaction().begin();
                dao.addMembroBD(m);
                em.getTransaction().commit();
                
            }catch (Exception e) {
                
                em.getTransaction().rollback();
                e.printStackTrace();
                
            } finally {
                
                em.close();
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Igreja.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Igreja.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

              
          
    }
}
