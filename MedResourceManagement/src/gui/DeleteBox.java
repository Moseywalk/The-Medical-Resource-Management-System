/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import medresourcemanagement.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author b00720507
 */
public class DeleteBox implements ActionListener {

    private JComboBox jComboBox, jComboBox2;

    private String output;
    private Register reg;
 
    public DeleteBox(JComboBox<String> jComboBox1, Register reg,JComboBox<String> jComboBox2) {
        this.jComboBox = jComboBox1;
        this.jComboBox2 = jComboBox2;
        this.reg = reg;
    }


    

    @Override
    public void actionPerformed(ActionEvent e) {
        String spec = (String) jComboBox.getSelectedItem();
        System.out.println(spec);
        this.output = spec;
        
  if (spec !=null) {
                    switch (spec) {
                        case "Cardiology":
                  jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.cardioNames()));

                            break;
                        case "Pulmonology":
                        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.pulmNames()));
                            break;
                        case "Infectious Disease":
          jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.intNames()));
                            break;
                        case "Hematology":
                          jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.hemNames()));
                            break;
                        case "Intensive Care Medicine":
                     jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.intNames()));
                            break;
                        case "Neurology":
                     jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.neuroNames()));
                            break;
                        case "Ophthalmology":
         jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.eyeNames()));
                            break;
                        case "Orthopedics":
             jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.orthoNames()));
                            break;
                        case "Urology":
                       jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.uroNames()));
                            break;
                        case "Surgery":
                 jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.surgNames()));
                            break;

                        default:

                            break;

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select speciailism of doctor to be deleted and then enter name");

                }
    }

    String getOutput() {
        return output;
    }

}
