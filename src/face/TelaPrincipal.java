/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package face;

/**
 *
 * @author Metodologia
 */
public class TelaPrincipal extends javax.swing.JFrame {
   
    
    public static boolean cadastro;
    
    
    
    public TelaPrincipal() {
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

        jdpPrincipal = new javax.swing.JDesktopPane();
        txtReceberMaterial = new javax.swing.JLabel();
        btnReceberMaterial = new javax.swing.JButton();
        btnDevolverMaterial = new javax.swing.JButton();
        txtDevolverMaterial = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnMaterial = new javax.swing.JMenu();
        mniCadastrarMaterial = new javax.swing.JMenuItem();
        mniEntradaMaterial = new javax.swing.JMenuItem();
        mniSaidaMaterial = new javax.swing.JMenuItem();
        mnAluno = new javax.swing.JMenu();
        mnDisciplina = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        setResizable(false);
        getContentPane().setLayout(null);

        jdpPrincipal.setBackground(new java.awt.Color(240, 240, 240));
        jdpPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jdpPrincipal.setPreferredSize(new java.awt.Dimension(830, 378));

        txtReceberMaterial.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtReceberMaterial.setForeground(new java.awt.Color(255, 255, 255));
        txtReceberMaterial.setText("RECEBER");

        btnReceberMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btn-entrada.png"))); // NOI18N
        btnReceberMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceberMaterialActionPerformed(evt);
            }
        });

        btnDevolverMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btn-saida.png"))); // NOI18N

        txtDevolverMaterial.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtDevolverMaterial.setForeground(new java.awt.Color(255, 255, 255));
        txtDevolverMaterial.setText("DEVOLVER");

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addGroup(jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpPrincipalLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtReceberMaterial)
                        .addGap(86, 86, 86)
                        .addComponent(txtDevolverMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdpPrincipalLayout.createSequentialGroup()
                        .addComponent(btnReceberMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnDevolverMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpPrincipalLayout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addGroup(jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReceberMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDevolverMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReceberMaterial)
                    .addComponent(txtDevolverMaterial))
                .addGap(286, 286, 286))
        );
        jdpPrincipal.setLayer(txtReceberMaterial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(btnReceberMaterial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(btnDevolverMaterial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(txtDevolverMaterial, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jdpPrincipal);
        jdpPrincipal.setBounds(0, 0, 1040, 768);

        mnMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu-material.png"))); // NOI18N
        mnMaterial.setText("Material");
        mnMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnMaterialMouseClicked(evt);
            }
        });
        mnMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMaterialActionPerformed(evt);
            }
        });

        mniCadastrarMaterial.setText("Cadastrar Material");
        mniCadastrarMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniCadastrarMaterialMouseClicked(evt);
            }
        });
        mniCadastrarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadastrarMaterialActionPerformed(evt);
            }
        });
        mnMaterial.add(mniCadastrarMaterial);

        mniEntradaMaterial.setText("Entrada de Material");
        mniEntradaMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniEntradaMaterialMouseClicked(evt);
            }
        });
        mnMaterial.add(mniEntradaMaterial);

        mniSaidaMaterial.setText("Saída de Material");
        mnMaterial.add(mniSaidaMaterial);

        jMenuBar1.add(mnMaterial);

        mnAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu-aluno.png"))); // NOI18N
        mnAluno.setText("Aluno");
        mnAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnAlunoMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnAluno);

        mnDisciplina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu-disciplina.png"))); // NOI18N
        mnDisciplina.setText("Disciplina");
        jMenuBar1.add(mnDisciplina);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu-logout.png"))); // NOI18N
        jMenu4.setText("Sair");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1036, 833));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
             System.exit(0);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMaterialActionPerformed
        // TODO add your handling code here:
        
        //ACÃO
        
       
        
            
        
    }//GEN-LAST:event_mnMaterialActionPerformed

    private void mnMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnMaterialMouseClicked
        // TODO add your handling code here:
        
        
        
               
    }//GEN-LAST:event_mnMaterialMouseClicked

    private void mnAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAlunoMouseClicked
        // TODO add your handling code here:
        
         TelaAluno ta = new TelaAluno();
        
        jdpPrincipal.add(ta);
        
        ta.setVisible(true);
        
    }//GEN-LAST:event_mnAlunoMouseClicked

    private void mniEntradaMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniEntradaMaterialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mniEntradaMaterialMouseClicked

    private void mniCadastrarMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniCadastrarMaterialMouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_mniCadastrarMaterialMouseClicked

    private void mniCadastrarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastrarMaterialActionPerformed
        // TODO add your handling code here:
        
        TelaMaterial tm = new TelaMaterial();
        
        jdpPrincipal.add(tm);
        
        tm.setVisible(true);
        
    }//GEN-LAST:event_mniCadastrarMaterialActionPerformed

    private void btnReceberMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceberMaterialActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_btnReceberMaterialActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolverMaterial;
    private javax.swing.JButton btnReceberMaterial;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenu mnAluno;
    private javax.swing.JMenu mnDisciplina;
    private javax.swing.JMenu mnMaterial;
    private javax.swing.JMenuItem mniCadastrarMaterial;
    private javax.swing.JMenuItem mniEntradaMaterial;
    private javax.swing.JMenuItem mniSaidaMaterial;
    private javax.swing.JLabel txtDevolverMaterial;
    private javax.swing.JLabel txtReceberMaterial;
    // End of variables declaration//GEN-END:variables

    
}
