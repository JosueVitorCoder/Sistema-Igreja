/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.igreja.views.internal;

import br.com.igreja.models.Membro;
import br.com.igreja.models.dao.MembroDAO;
import br.com.igreja.models.enums.Cargo;
import br.com.igreja.util.JPAUtil;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
        atualizarTabela();
        atualizarDadoPrevios();
        
        if(cont == -1){
            jComboBoxFiltragem.setVisible(false);
            cont = 0;
        }
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
        txtNome = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelNomePrevio = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        labelEnderecoPrevio = new javax.swing.JLabel();
        labelNumeroPrevio = new javax.swing.JLabel();
        labelDetalhes = new javax.swing.JLabel();
        botao123 = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setClosable(true);
        setTitle("Tabela de Membros");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

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
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 652, 10));

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
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 97, 209, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 652, 9));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nome:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 97, -1, -1));

        labelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\user_1077012.png")); // NOI18N
        labelFoto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FOTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        getContentPane().add(labelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 80, 90));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Data de Entrada:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Número:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Endereço:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel9.setText("N/A");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 140, -1));

        labelNomePrevio.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelNomePrevio.setText("N/A");
        getContentPane().add(labelNomePrevio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 130, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 180, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 180, 10));

        labelEnderecoPrevio.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelEnderecoPrevio.setText("N/A");
        getContentPane().add(labelEnderecoPrevio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 140, -1));

        labelNumeroPrevio.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelNumeroPrevio.setText("N/A");
        getContentPane().add(labelNumeroPrevio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 140, -1));

        labelDetalhes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDetalhes.setForeground(new java.awt.Color(51, 51, 255));
        labelDetalhes.setText("Detalhes");
        getContentPane().add(labelDetalhes, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        botao123.setText("visualizar");
        botao123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao123ActionPerformed(evt);
            }
        });
        getContentPane().add(botao123, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 100, -1));

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

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

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        atualizarDadoPrevios();
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void botao123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao123ActionPerformed
        atualizarDadoPrevios();
    }//GEN-LAST:event_botao123ActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        // TODO add your handling code here:
        pesquisa();
    }//GEN-LAST:event_botaoPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao123;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JComboBox<String> jComboBoxFiltragem;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel labelDetalhes;
    private javax.swing.JLabel labelEnderecoPrevio;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelNomePrevio;
    private javax.swing.JLabel labelNumeroPrevio;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    // MembroDAO que será ultilizado em um ou mais métodos
    EntityManager em = JPAUtil.getEntityManager();
    MembroDAO dao = new MembroDAO(em);
    // Strings estáticas que irão corresponder a cada coluna da tabela
    String[] columnData = {"Nome", "Nascimento", "CPF", "Endereço", "Número", "Sexo", "Cargo", "Status Civil"};
    DefaultTableModel model;
    
    private void atualizarTabela(){
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
    
    // Retorna o índice do membro selecionado pelo usuário
    private int membroSelecinado(){
        int index = -1;
        for(int i = 0; i < dao.getLista().size(); i++){
            if(tabela.isRowSelected(i)){
               index = i;
            }
        }
        return index;
    }
    
   private void atualizarDadoPrevios() {
    int indice = membroSelecinado();
    
    if (indice != -1) {
        labelNomePrevio.setText(getMembroList().get(indice).getNome());
        labelEnderecoPrevio.setText(getMembroList().get(indice).getEndereco());
        labelNumeroPrevio.setText(getMembroList().get(indice).getNumero());

        byte[] fotoByte = getMembroList().get(indice).getFoto();
        if (fotoByte != null) {
            ByteArrayInputStream bais = new ByteArrayInputStream(fotoByte);
            BufferedImage bufferedImage;
            try {
                bufferedImage = ImageIO.read(bais);
                if (bufferedImage != null) {
                    // Redimensiona a imagem para caber no JLabel
                    Image scaledImage = bufferedImage.getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon imageIcon = new ImageIcon(scaledImage);
                    labelFoto.setIcon(imageIcon);
                } else {
                    System.out.println("A imagem é nula.");
                    labelFoto.setIcon(null);
                }
            } catch (IOException ex) {
                System.out.println("Não foi possível converter a imagem!");
                ex.printStackTrace();
                labelFoto.setIcon(null);
            }
        } else {
            System.out.println("A foto byte é nula.");
            labelFoto.setIcon(null);
        }
    }
    System.out.println("Indice: " + indice);
    }
    
    private void pesquisa(){
        
        List<Membro> membrosResult = null;
        if(getCargoPesquisa() != null){
            membrosResult = dao.pesquisaPorNomeECargo(txtNome.getText(), getCargoPesquisa());
        }else{
            membrosResult = dao.pesquisaPorNome(txtNome.getText());
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
   
   private List<Membro> getMembroList(){
        List<Membro> membros = new ArrayList<>();
        
        // A lista deve corresponder as exigencias do usuário
        // Então aqui é onde vamos criar o retorno correspondente.

        if(txtNome.getText().trim().isEmpty()){
            if(jRadioFiltrarCargo.isSelected()){
            for(Membro m : dao.getLista()){
                if(!m.isArquivado() && m.getCargo() == getCargoPesquisa()){
                    membros.add(m);
                }
            }
            }else{
                for(Membro m : dao.getLista()){
                    if(!m.isArquivado()){
                        membros.add(m);
                    }
                }
            }
        }else{
            if(jRadioFiltrarCargo.isSelected()){
            for(Membro m : dao.pesquisaPorNomeECargo(txtNome.getText(), getCargoPesquisa())){
                if(!m.isArquivado()){
                    membros.add(m);
                }
            }
            }else{
                for(Membro m : dao.pesquisaPorNome(txtNome.getText())){
                    if(!m.isArquivado()){
                        membros.add(m);
                    }
                }
            }
        }
        return membros;
   }
}
