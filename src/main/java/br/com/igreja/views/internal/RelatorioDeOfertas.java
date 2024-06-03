/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.igreja.views.internal;

import br.com.igreja.models.Dizimo;
import br.com.igreja.models.Oferta;
import br.com.igreja.models.dao.DizimoDAO;
import br.com.igreja.models.dao.OfertaDAO;
import br.com.igreja.util.JPAUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author demi
 */
public class RelatorioDeOfertas extends javax.swing.JInternalFrame {

    /**
     * Creates new form RelatorioDeOfertas
     */
    public RelatorioDeOfertas() {
        initComponents();
        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jComboBoxFiltragem3 = new javax.swing.JComboBox<>();
        botaoPesquisar3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSpinnerAno = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Relatório de Ofertas");

        jComboBoxFiltragem3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anual", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        botaoPesquisar3.setText("Pesquisar");
        botaoPesquisar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisar3ActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Relatório de Ofertas");

        jSpinnerAno.setModel(new javax.swing.SpinnerNumberModel(2024, 2024, null, 1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Filtro:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ano:");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Total:");

        labelValor.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelValor.setText("00,00");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setText("R$");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelValor)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelValor)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxFiltragem3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(botaoPesquisar3))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFiltragem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(botaoPesquisar3)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisar3ActionPerformed
        // TODO add your handling code here:
        pesquisa();
    }//GEN-LAST:event_botaoPesquisar3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoPesquisar1;
    private javax.swing.JButton botaoPesquisar2;
    private javax.swing.JButton botaoPesquisar3;
    private javax.swing.JComboBox<String> jComboBoxFiltragem;
    private javax.swing.JComboBox<String> jComboBoxFiltragem1;
    private javax.swing.JComboBox<String> jComboBoxFiltragem2;
    private javax.swing.JComboBox<String> jComboBoxFiltragem3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerAno;
    private javax.swing.JLabel labelValor;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    EntityManager em = JPAUtil.getEntityManager(); 
    OfertaDAO ofertaDAO = new OfertaDAO(em);
    List<Oferta> ofertasResult = ofertaDAO.getOfertaList();
    //List<Oferta> ofertasResult = null;
    private void pesquisa() {
        EntityManager emtt = JPAUtil.getEntityManager();
        OfertaDAO dao = new OfertaDAO(emtt);
        if(getMes() != 0 && getMes() != -1){
           ofertasResult = dao.getPesquisa(getAno(), getMes());
        }else{
            ofertasResult = dao.getPesquisa(getAno());
        }
        //System.out.println("Res: "+getMes() + "()" + getAno());
        atualizarTabela();
    }
    
    private int getMes(){
        int mes = -1;
        String item = jComboBoxFiltragem3.getSelectedItem().toString();
        System.out.println("Item: "+item);
        switch(item){
            case "Anual":
                mes = 0;
                break;
            case "Janeiro":
                mes = 1;
                break;
            case "Fevereiro":
                mes = 2;
                break;
            case "Março":
                mes = 3;
                break;
            case "Abril":
                mes = 4;
                break;
            case "Maio":
                mes = 5;
                break;
            case "Junho":
                mes = 6;
                break;
            case "Julho":
                mes = 7;
                break;
            case "Agosto":
                mes = 8;
                break;
            case "Setembro":
                mes = 9;
                break;
            case "Outubro":
                mes = 10;
                break;
            case "Novembro":
                mes = 11;
                break;
            case "Dezembro":
                mes = 12;
                break;
        }
        return mes;
    }
    
    private int getAno(){
        return Integer.parseInt(jSpinnerAno.getValue().toString());
    }
    
    String[] column = {"Data", "Valor"};
    DefaultTableModel model = new DefaultTableModel(column, 0);
    private void atualizarTabela(){
        DefaultTableModel model = new DefaultTableModel(column, 0);
        EntityManager em = JPAUtil.getEntityManager();
        OfertaDAO dao = new OfertaDAO(em);
        if(ofertasResult == null){
           ofertasResult = dao.getOfertaList();
        }
        Oferta oferta = null;
        
        for(int i=0; i<ofertasResult.size(); i++){
            oferta = ofertasResult.get(i);
            String[] rowData = {formatarData(oferta.getData()), String.valueOf(oferta.getValor())};
            model.addRow(rowData);
        }
        tabela.setModel(model);
        try{
           atualizarValor(); 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private String formatarData(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data = sdf.format(date);
        return data;
    }
    
    private void atualizarValor() {
        double valor = 0.0;
        EntityManager em = JPAUtil.getEntityManager();
        DizimoDAO dao = new DizimoDAO(em);
        
        for(Oferta o : ofertasResult){
            valor += o.getValor();
        }
        labelValor.setText(String.valueOf(valor));
    }
}
