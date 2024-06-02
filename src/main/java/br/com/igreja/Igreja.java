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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author demi
 */
public class Igreja {

    public static void main(String[] args) {
        // Aqui faço vários testes aleatórios para testar certas funcionalidades
        EntityManager em = JPAUtil.getEntityManager();
        DizimoDAO dao = new DizimoDAO(em);
        List<Dizimo> list = dao.getPesquisa(5, 2024);
        System.out.println(list);
        
        
    }
}