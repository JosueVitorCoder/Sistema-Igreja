/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.igreja.views.internal;

import br.com.igreja.models.Membro;
import br.com.igreja.models.dao.MembroDAO;
import br.com.igreja.models.enums.Cargo;
import br.com.igreja.models.enums.Sexo;
import br.com.igreja.models.enums.StatusCivil;
import br.com.igreja.util.JPAUtil;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.hibernate.engine.jdbc.internal.BinaryStreamImpl;

/**
 *
 * @author demi
 */
public class TelaDeCadastroDeMembros extends javax.swing.JInternalFrame {

    // Instanciar o objeto para o fluxo de bytes
    private FileInputStream fis;
    // Variável para armazenar o tamanho da imagem
    private int tamanho;
    // Variável para armazenar a foto selecionada pelo usuário
    private Image foto;
    // Classe para persistencia 
    private EntityManager em;
    
    
    /**
     * Creates new form TelaDeLogin
     */
    public TelaDeCadastroDeMembros() {
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
        labelFoto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        formatTxtDataNascimento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        formatTxtCpf = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        formatTxtNumero = new javax.swing.JFormattedTextField();
        botaoCadastrar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jComboBoxStatusCivil = new javax.swing.JComboBox<>();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        botaoEditarImg = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Membros");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Membro(a)"));

        labelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\user_1077012.png")); // NOI18N
        labelFoto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FOTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Data de Nascimento:");

        try {
            formatTxtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("CPF:");

        try {
            formatTxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Endereço:");

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Número:");

        try {
            formatTxtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botaoCadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\botaoCadastrar.png")); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\BotaoCancelar.png")); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sexo:", "Masculino", "Feminino" }));

        jComboBoxStatusCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status Civil:", "Casado(a)", "Solteiro(a)", "Separado(a)", "Divorciado(a)", "União estável" }));

        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cargo:", "Pastor(a)", "Diácono(a)", "Presbítero(a)", "Evangelista", "Missionário(a)" }));
        jComboBoxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCargoActionPerformed(evt);
            }
        });

        botaoEditarImg.setText("Editar img");
        botaoEditarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarImgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(formatTxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(formatTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(formatTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jComboBoxStatusCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(txtEndereco)
                                        .addComponent(jComboBoxCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(botaoEditarImg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(formatTxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(formatTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEditarImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(formatTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxStatusCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrar))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        persistir();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // TODO add your handling code here:
        cadastrar();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoEditarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarImgActionPerformed
        botaoEditarImg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarFoto();
            }
        
        });
    }//GEN-LAST:event_botaoEditarImgActionPerformed

    private void jComboBoxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCargoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEditarImg;
    private javax.swing.JFormattedTextField formatTxtCpf;
    private javax.swing.JFormattedTextField formatTxtDataNascimento;
    private javax.swing.JFormattedTextField formatTxtNumero;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxStatusCivil;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void carregarFoto(){
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecionar Arquivo");
        jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de imagens(*.PNG, *.JPG, *JPEG)", "png", "jpg", "jpeg"));
        int resultado = jfc.showOpenDialog(this);
        
        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(jfc.getSelectedFile());
                tamanho = (int) jfc.getSelectedFile().length();
                foto = ImageIO.read(jfc.getSelectedFile())
                        .getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), Image.SCALE_SMOOTH);
                labelFoto.setIcon(new ImageIcon(foto));
                labelFoto.updateUI();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Tipo de Arquivo incompatível");
            }   
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma imagem compatível");
        }
    }

    private void cadastrar() {
//        Membro membro = getMembro();
    }

    // Fazendo a captação da Entidade Membro para persistência
    private Membro getMembro() {
        String nome = txtNome.getText();
        Date dataNascimeto = getDataNascimento();
        String cpf = formatTxtCpf.getText();
        String endereco = txtEndereco.getText();
        String numero = formatTxtNumero.getText();
        Sexo sexo = getSexo();
        Cargo cargo = getCargo();
        StatusCivil statusCivil = getStatusCivil();
        byte[] imagemData = converterImagemEmByte();
        
        Membro membro = new Membro(nome, dataNascimeto, cpf, endereco, numero, sexo, cargo, statusCivil, imagemData);
        
        return membro;
    }

    // Esse método Formata a data do campo formatTxt para = yyyy-MM-dd 
    // Para que seja persistido corretamente no tipo Date do MySQl.
    private Date getDataNascimento(){
        String dataString = formatTxtDataNascimento.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
          data = sdf.parse(dataString);
          SimpleDateFormat formatoNovo = new SimpleDateFormat("yyyy-MM-dd");
          String dataFormatada = formatoNovo.format(data);
        } catch (ParseException e) {
            System.out.println("Erro ao converter data: " + e.getMessage());
        }
        return data;  
    }

    private Sexo getSexo() {
        Sexo sexo = null;
        if(jComboBoxSexo.getSelectedItem().toString().equalsIgnoreCase("Sexo:")){
            JOptionPane.showMessageDialog(rootPane, "Selecione o *Sexo do novo Membro(a) da Igreja IADSN");
        }else{
            if(jComboBoxSexo.getSelectedItem().toString().equalsIgnoreCase("Masculino")){
                  sexo = Sexo.MASCULINO;
              }else if(jComboBoxSexo.getSelectedItem().toString().equalsIgnoreCase("Feminino")){
                  sexo = Sexo.FEMININO;
              }
        }
        return sexo;
    }

    // Retorna o Enum Cargo correspondente.
    private Cargo getCargo() {
        Cargo cargo = null;
        if(jComboBoxCargo.getSelectedItem().toString().equalsIgnoreCase("Cargo:")){
            JOptionPane.showMessageDialog(rootPane, "Selecione o *Cargo do novo Membro(a) da Igreja IADSN");
        }else{
            if(jComboBoxCargo.getSelectedItem().toString().equalsIgnoreCase("Pastor(a)")){
                cargo = Cargo.PASTOR;
            }else if(jComboBoxCargo.getSelectedItem().toString().equalsIgnoreCase("Diácono(a)")){
                cargo = Cargo.DIACONO;
            }else if(jComboBoxCargo.getSelectedItem().toString().equalsIgnoreCase("Presbítero(a)")){
                cargo = Cargo.PRESBÍTERO;
            }else if(jComboBoxCargo.getSelectedItem().toString().equalsIgnoreCase("Evangelista")){
                cargo = Cargo.EVANGELISTA;
            }else if(jComboBoxCargo.getSelectedItem().toString().equalsIgnoreCase("Missionário(a)")){
                cargo = Cargo.MISSIONÁRIO;
            }    
        }
        return cargo;
    }

    private StatusCivil getStatusCivil() {
        StatusCivil status = null;
        if (jComboBoxStatusCivil.getSelectedItem().toString().equalsIgnoreCase("Status Civil:")) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o *StatusCivil do novo Membro(a) da Igreja IADSN");
        } else {
            if(jComboBoxStatusCivil.getSelectedItem().toString().equalsIgnoreCase("Casado(a)")){
                status = StatusCivil.CASADO;
            }else if(jComboBoxStatusCivil.getSelectedItem().toString().equalsIgnoreCase("Solteiro(a)")){
                status = StatusCivil.SOLTEIRO;
            }else if(jComboBoxStatusCivil.getSelectedItem().toString().equalsIgnoreCase("Separado(a)")){
                status = StatusCivil.SEPARADO;
            }else if(jComboBoxStatusCivil.getSelectedItem().toString().equalsIgnoreCase("Divorciado(a)")){
                status = StatusCivil.DIVORCIADO;
            }else if(jComboBoxStatusCivil.getSelectedItem().toString().equalsIgnoreCase("União estável")){
                status = StatusCivil.UNIAO_ESTAVEL;
            }
        }
        return status;
    }

    private byte[] converterImagemEmByte() {
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
        return bytes;
    }

    private void persistir() {
        em = JPAUtil.getEntityManager();
        MembroDAO dao = new MembroDAO(em);
        try{
            em.getTransaction().begin();
            dao.addMembroBD(getMembro());
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(rootPane, "Cadastro Salvo com sucesso!");
            limparCampos();
        }catch(Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Não foi possível salvar no banco de dados.");
        }
    }

    private void limparCampos() {
        jComboBoxCargo.setSelectedIndex(0);
        jComboBoxSexo.setSelectedIndex(0);
        jComboBoxStatusCivil.setSelectedIndex(0);
        formatTxtCpf.setText("");
        formatTxtDataNascimento.setText("");
        formatTxtNumero.setText("");
        txtEndereco.setText("");
        txtNome.setText("");
    }
}
