/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.program;

import javax.swing.DefaultListModel;

/**
 *
 * @author bruno
 */
public class ContagemSwing extends javax.swing.JFrame {

    /**
     * Creates new form ContagemSwing
     */
    public ContagemSwing() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliVal01 = new javax.swing.JSlider();
        sliVal02 = new javax.swing.JSlider();
        sliVal03 = new javax.swing.JSlider();
        lblVal01 = new javax.swing.JLabel();
        lblVal02 = new javax.swing.JLabel();
        lblVal03 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltsCont = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contagem Personalizada");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Início");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Fim");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 51, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Passo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, -1, -1));

        sliVal01.setMaximum(10);
        sliVal01.setValue(0);
        sliVal01.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliVal01StateChanged(evt);
            }
        });
        getContentPane().add(sliVal01, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 25));

        sliVal02.setMaximum(50);
        sliVal02.setMinimum(10);
        sliVal02.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliVal02StateChanged(evt);
            }
        });
        getContentPane().add(sliVal02, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 51, -1, 25));

        sliVal03.setMaximum(5);
        sliVal03.setValue(0);
        sliVal03.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliVal03StateChanged(evt);
            }
        });
        getContentPane().add(sliVal03, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 82, -1, 25));

        lblVal01.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVal01.setText("0");
        getContentPane().add(lblVal01, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 20, -1, -1));

        lblVal02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVal02.setText("10");
        getContentPane().add(lblVal02, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 51, -1, -1));

        lblVal03.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVal03.setText("0");
        getContentPane().add(lblVal03, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 82, -1, -1));

        btnCalc.setBackground(new java.awt.Color(102, 153, 255));
        btnCalc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCalc.setForeground(new java.awt.Color(0, 0, 0));
        btnCalc.setText("Contar!");
        btnCalc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 143, 160, -1));

        ltsCont.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(ltsCont);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 160, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Quando altera o slider, para mostrar no label o valor
    private void sliVal01StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliVal01StateChanged
        // Pegando valor do slider
        int val01 = sliVal01.getValue();
        lblVal01.setText(Integer.toString(val01));      //Colocando valor no label
    }//GEN-LAST:event_sliVal01StateChanged

    private void sliVal02StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliVal02StateChanged
        int val02 = sliVal02.getValue();
        lblVal02.setText(Integer.toString(val02));
    }//GEN-LAST:event_sliVal02StateChanged

    private void sliVal03StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliVal03StateChanged
        int val03 = sliVal03.getValue();
        lblVal03.setText(Integer.toString(val03));
    }//GEN-LAST:event_sliVal03StateChanged

    //Ação do botão
    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // Pegando valor dos sliders
        int valIni = sliVal01.getValue();
        int valFim = sliVal02.getValue();
        int valPas = sliVal03.getValue();
        
        DefaultListModel list = new DefaultListModel();     //Importando para alterar a lista
        
        //For para contagem
        for (int cont = valIni; cont <= valFim; cont+=valPas){
            list.addElement(cont);
        }
        //Adicionando na lista
        ltsCont.setModel(list);
    }//GEN-LAST:event_btnCalcActionPerformed

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
            java.util.logging.Logger.getLogger(ContagemSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContagemSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContagemSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContagemSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContagemSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVal01;
    private javax.swing.JLabel lblVal02;
    private javax.swing.JLabel lblVal03;
    private javax.swing.JList<String> ltsCont;
    private javax.swing.JSlider sliVal01;
    private javax.swing.JSlider sliVal02;
    private javax.swing.JSlider sliVal03;
    // End of variables declaration//GEN-END:variables
}
