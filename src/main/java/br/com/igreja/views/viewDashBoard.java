/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.igreja.views;

import br.com.igreja.views.internal.EntradaDeDizimos;
import br.com.igreja.views.internal.EntradaDeOfertas;
import br.com.igreja.views.internal.RelatorioDeOfertas;
import br.com.igreja.views.internal.RelatorioDizimos;
import br.com.igreja.views.internal.SaidaDeMembro;
import br.com.igreja.views.internal.TabelaDeMembros;
import br.com.igreja.views.internal.TelaDeCadastroDeMembros;
import java.awt.Dimension;
import javax.swing.JDesktopPane;

/**
 *
 * @author demi
 */
public class viewDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form viewDashBoard
     */
    public viewDashBoard() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jSeparator2 = new javax.swing.JSeparator();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanelPrincipal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDesktop = new javax.swing.JDesktopPane();
        labelFotoSistema = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuMembros = new javax.swing.JMenu();
        jMenuItemCadastroMembros = new javax.swing.JMenuItem();
        jMenuItemSaidaDeMembros = new javax.swing.JMenuItem();
        jMenuItemMembrosCadastrados = new javax.swing.JMenuItem();
        jMenuBalanco = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuAlugues = new javax.swing.JMenu();
        jMenuDocuments = new javax.swing.JMenu();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 900));

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(1440, 900));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel2.setText("Sistema IADSN - Sistema desenvolvido por Josué Vítor - 2024");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jDesktop.setBackground(new java.awt.Color(255, 255, 255));

        labelFotoSistema.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\Candelabro para o sistema.png")); // NOI18N

        jDesktop.setLayer(labelFotoSistema, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFotoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 1450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFotoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5344, 5344, 5344)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktop))
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuCadastros.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\cadastros.png")); // NOI18N
        jMenuCadastros.setText("Cadastros    |");

        jMenuMembros.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\Membros.png")); // NOI18N
        jMenuMembros.setText("Membros");

        jMenuItemCadastroMembros.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\Cadastro de membros.png")); // NOI18N
        jMenuItemCadastroMembros.setText("Cadastrar Novo Membro(a)");
        jMenuItemCadastroMembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroMembrosActionPerformed(evt);
            }
        });
        jMenuMembros.add(jMenuItemCadastroMembros);

        jMenuItemSaidaDeMembros.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\Saída de membro.png")); // NOI18N
        jMenuItemSaidaDeMembros.setText("Saída de Membro(a)");
        jMenuItemSaidaDeMembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaidaDeMembrosActionPerformed(evt);
            }
        });
        jMenuMembros.add(jMenuItemSaidaDeMembros);

        jMenuItemMembrosCadastrados.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\Tabela de membros.png")); // NOI18N
        jMenuItemMembrosCadastrados.setText("Membros Cadastrados");
        jMenuItemMembrosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMembrosCadastradosActionPerformed(evt);
            }
        });
        jMenuMembros.add(jMenuItemMembrosCadastrados);

        jMenuCadastros.add(jMenuMembros);

        jMenuBar1.add(jMenuCadastros);

        jMenuBalanco.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\financeiro.png")); // NOI18N
        jMenuBalanco.setText("Financeiro    |");

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\Oferta.png")); // NOI18N
        jMenu2.setText("Ofertas");

        jMenuItem3.setText("Entrada de Ofertas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem1.setText("Relatório de Ofertas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBalanco.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\dizimo.png")); // NOI18N
        jMenu3.setText("Dizímos");

        jMenuItem5.setText("Entrar com dízimos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem2.setText("Relatório de dízimos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBalanco.add(jMenu3);

        jMenuBar1.add(jMenuBalanco);

        jMenuAlugues.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\Aluguéis.png")); // NOI18N
        jMenuAlugues.setText("Aluguéis    |");
        jMenuBar1.add(jMenuAlugues);

        jMenuDocuments.setIcon(new javax.swing.ImageIcon("C:\\Users\\demi\\Documents\\NetBeansProjects\\Igreja\\src\\main\\java\\br\\com\\igreja\\imagens\\Documentos.png")); // NOI18N
        jMenuDocuments.setText("Documentos    |");
        jMenuBar1.add(jMenuDocuments);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1448, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroMembrosActionPerformed
        TelaDeCadastroDeMembros telaDeCadastro = new TelaDeCadastroDeMembros();
        jDesktop.add(telaDeCadastro);
        Dimension desktopSize = jDesktop.getSize();
        Dimension internalFrameSize = telaDeCadastro.getSize();
        telaDeCadastro.setLocation((desktopSize.width - internalFrameSize.width) / 2,
                    (desktopSize.height - internalFrameSize.height) / 2);
        telaDeCadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroMembrosActionPerformed

    private void jMenuItemSaidaDeMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaidaDeMembrosActionPerformed
        SaidaDeMembro view = new SaidaDeMembro();
        jDesktop.add(view);
        view.iniciarTela(this);
    }//GEN-LAST:event_jMenuItemSaidaDeMembrosActionPerformed

    private void jMenuItemMembrosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMembrosCadastradosActionPerformed
        TabelaDeMembros tblMembros = new TabelaDeMembros();
        jDesktop.add(tblMembros);
        tblMembros.setVisible(true);
    }//GEN-LAST:event_jMenuItemMembrosCadastradosActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        EntradaDeDizimos view = new EntradaDeDizimos();
        jDesktop.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        EntradaDeOfertas view = new EntradaDeOfertas();
        jDesktop.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        RelatorioDizimos view = new RelatorioDizimos();
        jDesktop.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        RelatorioDeOfertas view = new RelatorioDeOfertas();
        jDesktop.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenuAlugues;
    private javax.swing.JMenu jMenuBalanco;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuDocuments;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemCadastroMembros;
    private javax.swing.JMenuItem jMenuItemMembrosCadastrados;
    private javax.swing.JMenuItem jMenuItemSaidaDeMembros;
    private javax.swing.JMenu jMenuMembros;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelFotoSistema;
    // End of variables declaration//GEN-END:variables

    //possibilitar que o jDesktop seja acessado por outros internais
    public JDesktopPane getjDesktop() {
        return jDesktop;
    }
}
