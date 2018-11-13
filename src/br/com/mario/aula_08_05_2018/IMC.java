/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mario.aula_08_05_2018;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author ifpr
 */
public class IMC extends javax.swing.JFrame {

    /**
     * Creates new form IMC
     */
    public IMC() {
        initComponents();
        rootPane.setDefaultButton(btCalcular);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPeso = new javax.swing.JTextField();
        tfAltura = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfIMC = new javax.swing.JLabel();
        tfResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfPeso.setBorder(javax.swing.BorderFactory.createTitledBorder("Peso"));

        tfAltura.setBorder(javax.swing.BorderFactory.createTitledBorder("Altura"));

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IMC");

        tfIMC.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        tfIMC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfIMC.setText("0");

        tfResultado.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        tfResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfResultado.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfIMC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(tfAltura)
                    .addComponent(tfPeso, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfIMC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfResultado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        if (!tfAltura.getText().isEmpty() && !tfPeso.getText().isEmpty()) {
            calcularImc(tfAltura.getText(), tfPeso.getText());
        }
    }//GEN-LAST:event_btCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JLabel tfIMC;
    private javax.swing.JTextField tfPeso;
    private javax.swing.JLabel tfResultado;
    // End of variables declaration//GEN-END:variables

    private void calcularImc(String altura, String peso) {
        DecimalFormat dec = new DecimalFormat("#0.00");

        double alturaUsu = Double.parseDouble(altura.replaceAll(",", "."));
        double pesoUsu = Double.parseDouble(peso);

        Double imc = (pesoUsu / (alturaUsu * alturaUsu));

        tfIMC.setText(dec.format(imc));

        if (imc <= 18.5) {
            tfResultado.setText("Voce esta abaixo do peso!");
        } else if (imc >= 18.6 && imc <= 24.9) {
            tfResultado.setText("Peso ideal!");
        } else if (imc >= 25 && imc <= 29.9) {
            tfResultado.setText("Levemente acima do peso!");
        } else if (imc >= 30 && imc <= 34.9) {
            tfResultado.setText("Obsidade grau I!");
        } else if (imc >= 35 && imc <= 39.9) {
            tfResultado.setText("Obsidade grau II (Severa)!");
        } else if (imc >= 40) {
            tfResultado.setText("Obsidade grau III (Morbida)!");
        }
    }
}
