/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.igreja.views.internal;

import br.com.igreja.models.Membro;
import br.com.igreja.models.dao.MembroDAO;
import br.com.igreja.models.enums.Cargo;
import br.com.igreja.util.JPAUtil;
import br.com.igreja.views.viewDashBoard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author demi
 */
public class SaidaDeMembro extends javax.swing.JInternalFrame {

    private viewDashBoard dash;
    
    // Strings estáticas que irão corresponder a cada coluna da tabela
    /**
     * Creates new form SaidaDeMembro
     */
    public SaidaDeMembro() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jRadioFiltrarCargo = new javax.swing.JRadioButton();
        jComboBoxFiltragem = new javax.swing.JComboBox<>();
        botaoPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        button1 = new java.awt.Button();

        setClosable(true);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nascimento", "CPF", "Endereço", "Número", "Sexo", "Cargo", "Status Civil"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("SAÍDA DE MEMBRO(a)");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Pesquisar Cadastro: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nome:");

        jRadioFiltrarCargo.setText("Filtrar Por Cargo?");
        jRadioFiltrarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFiltrarCargoActionPerformed(evt);
            }
        });

        jComboBoxFiltragem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Pastores", "Diáconos", "Presbíteros", "Evangelistas", "Missionários" }));

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        jLabel2.setText("Arquivar Membro Selecionado:");

        jButton1.setText("Arquivar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        button1.setLabel("Lista de Aquirvados");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(botaoPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioFiltrarCargo)
                                .addGap(6, 6, 6)
                                .addComponent(jComboBoxFiltragem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButton1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jRadioFiltrarCargo))
                            .addComponent(jComboBoxFiltragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoPesquisar)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1))
                    .addComponent(jLabel2))
                .addContainerGap())
        );

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

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        // TODO add your handling code here:
        pesquisa();
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        arquivar();
        atualizarTabela();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        ListaDeAquivados view = new ListaDeAquivados();
        dash.getjDesktop().add(view);
        view.iniciar(this);
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisar;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxFiltragem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioFiltrarCargo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    
    public void iniciarTela(viewDashBoard dash){
        this.dash = dash;
        this.setVisible(true);
    }
    
    String[] columnData = {"Nome", "Nascimento", "CPF", "Endereço", "Número", "Sexo", "Cargo", "Status Civil"};
    DefaultTableModel model;
    
    private void arquivar(){
        EntityManager em = JPAUtil.getEntityManager();
        MembroDAO dao = new MembroDAO(em);
        if(membroSelecinado() != -1){
            dao.arquivar(getId());
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione o Membro(a) que deseja arquivar.");
        }
    }
    
    private Long getId(){
        EntityManager em = JPAUtil.getEntityManager();
        MembroDAO dao = new MembroDAO(em);
        return dao.getLista().get(membroSelecinado()).getId();
    }
    
    // Retorna o índice do membro selecionado pelo usuário
    private int membroSelecinado(){
        EntityManager em = JPAUtil.getEntityManager();
        MembroDAO dao = new MembroDAO(em);
        int index = -1;
        for(int i = 0; i < dao.getLista().size(); i++){
            if(tabela.isRowSelected(i)){
               index = i;
            }
        }
        return index;
    }
    
    public void atualizarTabela(){
        EntityManager em = JPAUtil.getEntityManager();
        MembroDAO dao = new MembroDAO(em);
        model = new DefaultTableModel(columnData, 0);
        List<Membro> membros = dao.getLista();
       
        for(Membro m : membros){
            if(!m.isArquivado()){
                String[] rowData = {m.getNome(), m.getDataDeNascimento().toString(), m.getCpf(), m.getEndereco(),
                m.getNumero(), m.getSexo().toString(), m.getCargo().toString(), m.getStatusCivil().toString()};
                model.addRow(rowData);
            }
        }
       tabela.setModel(model);
    }
    
    private void atualizarTabela(List<Membro> membros){
        if(membros == null){
            System.out.println("Lista de membros não pode ser nula.");
        }else{
            model = new DefaultTableModel(columnData, 0);

            for(Membro m : membros){
                if(!m.isArquivado()){
                    String[] rowData = {m.getNome(), m.getDataDeNascimento().toString(), m.getCpf(), m.getEndereco(),
                    m.getNumero(), m.getSexo().toString(), m.getCargo().toString(), m.getStatusCivil().toString()};
                    model.addRow(rowData);
                }
            }
            tabela.setModel(model);
        }
    }
    
    private void pesquisa(){
        EntityManager em = JPAUtil.getEntityManager();
        MembroDAO dao = new MembroDAO(em);
        String jpql;
        TypedQuery<Membro> query;
        List<Membro> membrosResult = null;
        if(getCargoPesquisa() != null){
            jpql = "SELECT m FROM Membro m WHERE m.nome LIKE :nome AND m.cargo = :cargo";
            query = em.createQuery(jpql, Membro.class);
            query.setParameter("nome", "%"+txtNome.getText()+"%");
            query.setParameter("cargo", getCargoPesquisa());
            membrosResult = query.getResultList();
        }else{
            try{
                jpql = "SELECT m FROM Membro m WHERE m.nome LIKE :nome";
                query = em.createQuery(jpql, Membro.class);
                query.setParameter("nome", "%"+txtNome.getText()+"%");
                membrosResult = query.getResultList();
            }catch (Exception e) {
             // Trate a exceção adequadamente (por exemplo, logar o erro ou mostrar uma mensagem ao usuário)
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao realizar a pesquisa: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        atualizarTabela(membrosResult);
    }
   
   private Cargo getCargoPesquisa(){
       Cargo cargo = null;
       if(jRadioFiltrarCargo.isSelected()){
           switch(jComboBoxFiltragem.getSelectedItem().toString()){
               case "N/A":
                   cargo = Cargo.NA;
                   break;
                case "Pastores":
                    cargo = Cargo.PASTOR;
                   break;
                case "Diáconos":
                    cargo = Cargo.DIACONO;
                   break;
                case "Presbíteros":
                    cargo = Cargo.PRESBÍTERO;
                   break;
                case "Evangelistas":
                    cargo = Cargo.EVANGELISTA;
                   break;
                case "Missionários":
                    cargo = Cargo.MISSIONÁRIO;
                   break;
           }
       }
       return cargo; 
   }

    public viewDashBoard getDash() {
        return dash;
    }
}