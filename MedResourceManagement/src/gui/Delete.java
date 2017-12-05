/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import medresourcemanagement.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author b00720507
 */
public class Delete extends javax.swing.JPanel {

    /**
     * Creates new form Delete
     */
    private Register reg;

    public Delete() {

    }

    Delete(Register reg) {
        this.reg = reg;
        initComponents();
        DeleteBox listen = new DeleteBox(jComboBox1, this.reg);
        jComboBox1.addActionListener(listen);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String[] test = {"test","test"};
//                            System.out.println("gui.DeleteBox.actionPerformed()");
//                           jComboBox2 = new JComboBox<>(test);
                String spec = listen.getOutput();

                if (spec != null && jTextField1.getText() != null) {
                    switch (spec) {
                        case "Cardiology":
                            reg.deleteFromRegister(jTextField1.getText(), reg.getSpecArray("Cardiology"), "Cardiology");

                            break;
                        case "Pulmonology":
                            reg.deleteFromRegister(jTextField1.getText(), reg.getSpecArray("Pulmonology"), "Pulmonology");
                            break;
                        case "Infectious Disease":
                            reg.deleteFromRegister(jTextField1.getText(), reg.getSpecArray("Infectious Disease"), "Infectious Disease");
                            break;
                        case "Hematology":
                            reg.deleteFromRegister(jTextField1.getText(), reg.getSpecArray("Hematology"), "Hematology");
                            break;
                        case "Intensive Care Medicine":
                            reg.deleteFromRegister(jTextField1.getText(), reg.getSpecArray("Intensive Care Medicine"), "Intensive Care Medicine");
                            break;
                        case "Neurology":
                            reg.deleteFromRegister(jTextField1.getText(), reg.getSpecArray("Neurology"), "Neurology");
                            break;
                        case "Ophthalmology":
                            reg.deleteFromRegister(jTextField1.getText(), reg.getSpecArray("Ophthalmology"), "Ophthalmology");
                            break;
                        case "Orthopedics":
                            reg.deleteFromRegister(jTextField1.getText(), reg.getSpecArray("Orthopedics"), "Orthopedics");
                            break;
                        case "Urology":
                            reg.deleteFromRegister(jTextField1.getText(), reg.getSpecArray("Urology"), "Urology");
                            break;
                        case "Surgery":
                            reg.deleteFromRegister(jTextField1.getText(), reg.getSpecArray("Surgery"), "Surgery");
                            break;

                        default:

                            break;

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select speciailism of doctor to be deleted and then enter name");

                }
                jComboBox1.setSelectedIndex(-1);
                jTextField1.setText("");
            }

        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiology", "Pulmonology", "Infectious Disease", "Hematology", "Intensive Care Medicine", "Neurology", "Ophthalmology", "Orthopedics", "Urology", "Surgery" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Speciality ");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Name of Doctor to Delete");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Delete doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jButton1)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
//        if (jComboBox1.getSelectedItem().toString().equals("Cardiology")) {
//            //reset jtextArea
//            jTextArea1.setText("");
//            //set textbox
//            String[] names = reg.cardioNames();
//            for (int x = 0; x < 10; x++) {
//                
//                jTextArea1.append(names[x] + "\n");
//
//            }
//
//        } else if (jComboBox1.getSelectedItem().toString().equals("Pulmonology")) {
//            String[] names = reg.pulmNames();
//            //reset jtextArea
//            jTextArea1.setText("");
//            for (int x = 0; x < 10; x++) {
//                jTextArea1.append(names[x] + "\n");
//            }
//
//        } else if (jComboBox1.getSelectedItem().toString().equals("Infectious Disease")) {
//            String[] names = reg.infNames();
//            //reset jtextArea
//            jTextArea1.setText("");
//            for (int x = 0; x < 10; x++) {
//                jTextArea1.append(names[x] + "\n");
//            }
//
//        } else if (jComboBox1.getSelectedItem().toString().equals("Hematology")) {
//            String[] names = reg.hemNames();
//            //reset jtextArea
//            jTextArea1.setText("");
//            for (int x = 0; x < 10; x++) {
//                jTextArea1.append(names[x] + "\n");
//            }
//
//        } else if (jComboBox1.getSelectedItem().toString().equals("Intensive Care Medicine")) {
//            String[] names = reg.intNames();
//            //reset jtextArea
//            jTextArea1.setText("");
//            for (int x = 0; x < 10; x++) {
//                jTextArea1.append(names[x] + "\n");
//            }
//
//        } else if (jComboBox1.getSelectedItem().toString().equals("Neurology")) {
//            String[] names = reg.neuroNames();
//            //reset jtextArea
//            jTextArea1.setText("");
//            for (int x = 0; x < 10; x++) {
//                jTextArea1.append(names[x] + "\n");
//            }
//
//        } else if (jComboBox1.getSelectedItem().toString().equals("Ophthalmology")) {
//            String[] names = reg.eyeNames();
//            //reset jtextArea
//            jTextArea1.setText("");
//            for (int x = 0; x < 10; x++) {
//                jTextArea1.append(names[x] + "\n");
//            }
//
//        } else if (jComboBox1.getSelectedItem().toString().equals("Orthopedics")) {
//            String[] names = reg.orthoNames();
//            //reset jtextArea
//            jTextArea1.setText("");
//            for (int x = 0; x < 10; x++) {
//                jTextArea1.append(names[x] + "\n");
//            }
//
//        } else if (jComboBox1.getSelectedItem().toString().equals("Urology")) {
//            String[] names = reg.uroNames();
//            //reset jtextArea
//            jTextArea1.setText("");
//            for (int x = 0; x < 10; x++) {
//                jTextArea1.append(names[x] + "\n");
//            }
//
//        } else if (jComboBox1.getSelectedItem().toString().equals("Surgery")) {
//            String[] names = reg.surgNames();
//            //reset jtextArea
//            jTextArea1.setText("");
//            for (int x = 0; x < 10; x++) {
//                jTextArea1.append(names[x] + "\n");
//            }
//
//        }
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
