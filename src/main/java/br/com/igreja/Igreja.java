package br.com.igreja;

import br.com.igreja.models.Oferta;
import br.com.igreja.models.dao.ConectaDAO;
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
        
        ConectaDAO dao = new ConectaDAO();
        Connection con = dao.connectDB();

        try {
            // Exemplo de uma consulta simples
            String sql = "SELECT * FROM membros";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                // Supondo que sua tabela tenha uma coluna "nome"
                String nome = rs.getString("nome");
                System.out.println("Nome: " + nome);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados: " + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }
}