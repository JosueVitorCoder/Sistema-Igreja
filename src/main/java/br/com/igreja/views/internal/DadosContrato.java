/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.igreja.views.internal;

import br.com.igreja.models.Contrato;
import br.com.igreja.models.dao.ConectaDAO;
import br.com.igreja.models.dao.ContratoDAO;
import br.com.igreja.util.JPAUtil;
import java.awt.Color;
import java.awt.Desktop;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author demi
 */
public class DadosContrato extends javax.swing.JInternalFrame {

    /**
     * Creates new form DadosContrato
     */
    public DadosContrato() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNomeLocatario = new javax.swing.JLabel();
        txtNomeLocatario = new javax.swing.JTextField();
        labelVigencia = new javax.swing.JLabel();
        labelValorAluguel = new javax.swing.JLabel();
        txtVigencia = new javax.swing.JTextField();
        txtValorAluguel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botaoGerarContrato = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Dados do Contrato");

        labelNomeLocatario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNomeLocatario.setText("Nome do Locatário:");

        labelVigencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelVigencia.setText("Vigência(duração):");

        labelValorAluguel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelValorAluguel.setText("Valor do Aluguel:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setText("Exemplo: MARIA DO AMPARO TEIXEIRA");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setText("Exemplo: 06 MESES");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setText("Exemplo:  R$ 750,00 (SETECENTOS E CINQUENTA REAIS) ");

        botaoGerarContrato.setText("Gerar Contrato");
        botaoGerarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerarContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelNomeLocatario)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelVigencia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelValorAluguel)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtValorAluguel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(botaoGerarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeLocatario)
                    .addComponent(txtNomeLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVigencia)
                    .addComponent(txtVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorAluguel)
                    .addComponent(txtValorAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(botaoGerarContrato)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoGerarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerarContratoActionPerformed

        gerarContrato();
    }//GEN-LAST:event_botaoGerarContratoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoGerarContrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNomeLocatario;
    private javax.swing.JLabel labelValorAluguel;
    private javax.swing.JLabel labelVigencia;
    private javax.swing.JTextField txtNomeLocatario;
    private javax.swing.JTextField txtValorAluguel;
    private javax.swing.JTextField txtVigencia;
    // End of variables declaration//GEN-END:variables

    /**
    * Gera um contrato, verificando se todos os campos estão preenchidos, 
    * e realiza a operação de persistência no banco de dados.
    */
   private void gerarContrato() {
       if (camposPreenchidos()) {
           EntityManager em = JPAUtil.getEntityManager();
           try {
               // Cria uma instância do DAO de Contrato com o EntityManager
               ContratoDAO dao = new ContratoDAO(em);
               // Inicia a transação
               em.getTransaction().begin();
               // Adiciona os dados do contrato ao banco de dados
               //dao.addContratoDataAoBanco(getContrato());
               // Comita a transação
               //em.getTransaction().commit();
               // Exibe mensagem de sucesso
               JOptionPane.showMessageDialog(rootPane, "Dados cadastrados com sucesso!");
               imprimirContrato();
           } catch (Exception e) {
               // Faz o rollback da transação em caso de erro
               em.getTransaction().rollback();
               // Exibe mensagem de erro
               JOptionPane.showMessageDialog(rootPane, "Não foi possível gerar relatório, tente novamente!");
               e.printStackTrace();
           } finally {
               // Fecha o EntityManager
               em.close();
           }
       } else {
           // Exibe mensagem de aviso se todos os campos não estiverem preenchidos
           JOptionPane.showMessageDialog(rootPane, "Todos os campos são obrigatórios!");
       }
   }
   
   public void imprimirContrato(){
       
        ConectaDAO dao = new ConectaDAO();
        Connection con = dao.connectDB();

        try {
            JasperPrint print = JasperFillManager.fillReport(".\\RelatoriosIgreja\\contrato.jasper", null, con);
            JasperViewer.viewReport(print, false); // Exibir o relatório
            
        } catch (NoClassDefFoundError e) {
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar imprimir relatório: " + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + e.getMessage());
            }
        }
   }
   
   public void imprimirContrato(String nomeLocatario, String vigenciaMeses, String valorAluguel, String cabecalho, String primeiraParte) {
    ConectaDAO dao = new ConectaDAO();
    Connection con = dao.connectDB();

    try {
        // Criar um mapa de parâmetros
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("nomeLocatario", nomeLocatario);
        parametros.put("vigenciaMeses", vigenciaMeses);
        parametros.put("valorAluguel", valorAluguel);
        parametros.put("cabecalho", cabecalho);
        parametros.put("primeiraParte", primeiraParte);

        // Preencher o relatório com a conexão ao banco de dados e os parâmetros
        JasperPrint print = JasperFillManager.fillReport(".\\RelatoriosIgreja\\contrato.jasper", parametros, con);

        // Exibir o relatório
        JasperViewer.viewReport(print, false);
    } catch (NoClassDefFoundError e) {
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao tentar imprimir relatório: " + e.getMessage());
    } finally {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }


    /**
     * Cria e retorna um objeto Contrato com os valores dos campos de texto.
     * 
     * @return um objeto Contrato com os dados preenchidos
     */
    private Contrato getContrato() {
        String nomeLocatario = txtNomeLocatario.getText();
        String vigencia = txtVigencia.getText();
        String valorAluguel = txtValorAluguel.getText();
        // Cria um novo contrato com os valores fornecidos
        return new Contrato(nomeLocatario, vigencia, valorAluguel);
    }

    /**
     * Verifica se todos os campos obrigatórios foram preenchidos.
     * 
     * @return true se todos os campos estiverem preenchidos, false caso contrário
     */
    private boolean camposPreenchidos() {
        // Atualiza a cor dos rótulos dos campos não preenchidos
        mudarCorEmpty();
        // Verifica se os campos de texto não estão vazios
        return !txtNomeLocatario.getText().isEmpty() && 
               !txtVigencia.getText().isEmpty() && 
               !txtValorAluguel.getText().isEmpty();
    }

    /**
     * Altera a cor dos rótulos dos campos obrigatórios não preenchidos para vermelho.
     * Se os campos forem preenchidos, restaura a cor original.
     */
    private void mudarCorEmpty() {
        if (txtNomeLocatario.getText().isEmpty()) {
            labelNomeLocatario.setForeground(Color.red);
            labelNomeLocatario.setText("Nome do Locatário:*");
        } else {
            labelNomeLocatario.setForeground(Color.BLACK);
            labelNomeLocatario.setText("Nome do Locatário:");
        }

        if (txtValorAluguel.getText().isEmpty()) {
            labelValorAluguel.setForeground(Color.red);
            labelValorAluguel.setText("Valor do Aluguel:*");
        } else {
            labelValorAluguel.setForeground(Color.BLACK);
            labelValorAluguel.setText("Valor do Aluguel:");
        }

        if (txtVigencia.getText().isEmpty()) {
            labelVigencia.setForeground(Color.red);
            labelVigencia.setText("Vigência(duração):*");
        } else {
            labelVigencia.setForeground(Color.BLACK);
            labelVigencia.setText("Vigência(duração):");
        }
    }

}