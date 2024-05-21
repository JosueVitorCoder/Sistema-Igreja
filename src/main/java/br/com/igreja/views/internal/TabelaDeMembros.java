/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.igreja.views.internal;

import br.com.igreja.models.Membro;
import br.com.igreja.models.dao.MembroDAO;
import br.com.igreja.util.JPAUtil;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author demi
 */
public class TabelaDeMembros extends javax.swing.JInternalFrame {

    /**
     * Creates new form TabelaDeMembros
     */
    //Variavel que será ultilizada para que o jComboBoxFiltragem fique invisivel um vez
    int cont = -1;
    public TabelaDeMembros() {
        initComponents();
        if(cont == -1){
            jComboBoxFiltragem.setVisible(false);
            cont = 0;
        }
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

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jComboBoxFiltragem = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioFiltrarCargo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelDetalhes = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setClosable(true);
        setTitle("Tabela de Membros");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nascimento", "CPF", "Endereço", "Número", "Sexo", "Cargo", "Status Civil"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 650, 440));

        jComboBoxFiltragem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Pastores", "Diáconos", "Presbíteros", "Evangelistas", "Missionários" }));
        getContentPane().add(jComboBoxFiltragem, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 128, 135, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Membros IADSN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 652, 13));

        jRadioFiltrarCargo.setText("Filtrar Por Cargo?");
        jRadioFiltrarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFiltrarCargoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioFiltrarCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 129, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Pesquisar Cadastro: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 97, 209, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 652, 9));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nome:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 97, -1, -1));

        labelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\user_1077012.png")); // NOI18N
        labelFoto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FOTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        getContentPane().add(labelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Data de Entrada:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Número:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Endereço:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel9.setText("N/A");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 140, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel10.setText("N/A");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 130, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 180, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 180, 10));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel11.setText("N/A");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 140, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel13.setText("N/A");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 140, -1));

        labelDetalhes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDetalhes.setForeground(new java.awt.Color(51, 51, 255));
        labelDetalhes.setText("Detalhes");
        getContentPane().add(labelDetalhes, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioFiltrarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFiltrarCargoActionPerformed
        jRadioFiltrarCargo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jRadioFiltrarCargo.isSelected()){
                    jComboBoxFiltragem.setVisible(true);
                }else if(!jRadioFiltrarCargo.isSelected()){
                    jComboBoxFiltragem.setVisible(false);
                }
            }
        });
    }//GEN-LAST:event_jRadioFiltrarCargoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxFiltragem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioFiltrarCargo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelDetalhes;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    EntityManager em = JPAUtil.getEntityManager();
    // Strings estáticas que irão corresponder a cada coluna da tabela
    String[] columnData = {"Nome", "Nascimento", "CPF", "Endereço", "Número", "Sexo", "Cargo", "Status Civil"};
    DefaultTableModel model;
    
    public void atualizarTabela(){
       model = new DefaultTableModel(columnData, 0);
       MembroDAO dao = new MembroDAO(em);
       List<Membro> membros = dao.getLista();
       
       for(Membro m : membros){
           String[] rowData = {m.getNome(), m.getDataDeNascimento().toString(), m.getCpf(), m.getEndereco(),
               m.getNumero(), m.getSexo().toString(), m.getCargo().toString(), m.getStatusCivil().toString()};
           model.addRow(rowData);
       }

       tabela.setModel(model);
    }
}
