/*
*Esse documento faz parte de uma aplicação desenvolvida na matéria de APSOO-2018/2 na FACOM, 
*disciplina lecionada pelo Profª Edilson Palma
*Seu uso é permitido para fins acadêmicos, todavia mantendo a referência de autoria.
*@author Alexya M. Viana Domingues - Acadêmica de Engenharia de Software
*@author Bruna Luzia A. Rodrigues - Acadêmica de Engenharia de Software
*@author Hanna Karoline T. Palacios - Acadêmica de Engenharia de Software
*@author Gabriel Fernando Texeira - Acadêmica de Engenharia de Software
-->Classe Venda que tem como objetivo tratar o gerenciamento de dados da venda
*/
package brinqfeliz;
/**
 *
 * @author stuff
 */
public class telaPagamento extends javax.swing.JFrame {

    private telaInicial tela1;
    
    public telaPagamento() {
        initComponents();
    }

    public void enviaTotal (telaInicial tela1, String totalCompra){
      this.totalCompra.setText(totalCompra);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_finalizar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        totalPago = new javax.swing.JTextField();
        totalCompra = new javax.swing.JLabel();
        trocoCompra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Escolha a forma de pagamento:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 100, 251, 22);

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton10.setText("Dinheiro");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton10);
        jRadioButton10.setBounds(70, 140, 91, 31);

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton11.setText("Cartão de Débito");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton11);
        jRadioButton11.setBounds(70, 190, 159, 31);

        jRadioButton12.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton12.setText("Cartão de Crédito");
        getContentPane().add(jRadioButton12);
        jRadioButton12.setBounds(70, 240, 163, 31);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Total:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(380, 140, 40, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Pago:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(380, 170, 40, 17);

        btn_finalizar.setBackground(new java.awt.Color(102, 255, 0));
        btn_finalizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_finalizar.setText("Finalizar Compra");
        btn_finalizar.setEnabled(false);
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_finalizar);
        btn_finalizar.setBounds(380, 240, 131, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Troco:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(380, 290, 45, 17);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("R$");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(430, 140, 17, 17);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("R$");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(430, 170, 17, 17);

        totalPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalPago.setText(" ");
        totalPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPagoActionPerformed(evt);
            }
        });
        getContentPane().add(totalPago);
        totalPago.setBounds(460, 170, 60, 23);

        totalCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(totalCompra);
        totalCompra.setBounds(460, 140, 60, 0);

        trocoCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(trocoCompra);
        trocoCompra.setBounds(440, 290, 50, 0);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Realizar Pagamento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 180, 40);

        setSize(new java.awt.Dimension(666, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        float resultado, n1, n2;
        n1 = Float.parseFloat(totalCompra.getText());
        n2 = Float.parseFloat(totalPago.getText());
        resultado = n1-n2;
        trocoCompra.setText("R$ " + resultado);
    }//GEN-LAST:event_btn_finalizarActionPerformed

    private void totalPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPagoActionPerformed
        btn_finalizar.setEnabled(true);
    }//GEN-LAST:event_totalPagoActionPerformed

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
            java.util.logging.Logger.getLogger(telaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_finalizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JLabel totalCompra;
    private javax.swing.JTextField totalPago;
    private javax.swing.JLabel trocoCompra;
    // End of variables declaration//GEN-END:variables
}
