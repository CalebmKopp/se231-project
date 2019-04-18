/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptionproject.UIpackage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author ckopp
 */
public class OutputFormUI extends UIFrame {

    private JSONObject result = new JSONObject();
    private JSONObject safeResult = new JSONObject();

    /**
     * Creates new form CipherDisplayUI
     */
    public OutputFormUI() {
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

        titleLabel = new javax.swing.JLabel();
        subtitle1Label = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        outputScrollPane = new javax.swing.JScrollPane();
        resultTextArea = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        revealToggleButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("Results");

        subtitle1Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subtitle1Label.setText("Output from last action:");

        saveButton.setText("Save To File");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        resultTextArea.setEditable(false);
        resultTextArea.setColumns(20);
        resultTextArea.setRows(5);
        outputScrollPane.setViewportView(resultTextArea);

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        revealToggleButton.setText("Reveal Key");
        revealToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revealToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputScrollPane)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(subtitle1Label, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(revealToggleButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtitle1Label)
                    .addComponent(revealToggleButton))
                .addGap(18, 18, 18)
                .addComponent(outputScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(backButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        this.saveToFile();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        UIController.getInstance().displayNextFrame(this, new EncryptionUI());
    }//GEN-LAST:event_backButtonActionPerformed

    private void revealToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revealToggleButtonActionPerformed
        // TODO add your handling code here:
        boolean selected = this.revealToggleButton.isSelected();

        if (selected) {
            this.displayResult(this.result);
        } else {
            this.displayResult(this.safeResult);
        }

    }//GEN-LAST:event_revealToggleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OutputFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputFormUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new OutputFormUI().setVisible(true);

                /*var cool = new OutputFormUI();
                cool.setVisible(true);
                System.out.println(cool.getResult());*/
            }
        });
    }

    /**
     * Receives a result and sets it to be the result
     *
     * @param result
     */
    void setResult(JSONObject result) {
        this.result = result;
    }

    @Override
    public void render() {
        this.prepareOutput();
        super.render(); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane outputScrollPane;
    private javax.swing.JTextArea resultTextArea;
    private javax.swing.JToggleButton revealToggleButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel subtitle1Label;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    /**
     *
     */
    private void saveToFile() {
        try {
            // writing JSON to file:"output.json" in cwd
            PrintWriter pw = new PrintWriter("output.json");
            pw.write(this.resultTextArea.getText());

            pw.flush();

            Popup.popupMessage("The output has been written to EncryptionProject/output.json");
        } catch (FileNotFoundException e) {
            Logger.getLogger(OutputFormUI.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void prepareOutput() {
        JSONObject safe = new JSONObject(result, JSONObject.getNames(result));
        safe.remove("keyUsed");
        this.safeResult = safe;
        this.displayResult(this.safeResult);
    }

    private void displayResult(JSONObject json) {
        this.resultTextArea.setText(json.toString(4));
    }
}
