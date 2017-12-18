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
/**
 *
 * @author b00720507
 */
public class DeleteBox implements ActionListener {

    private JComboBox jComboBox, jComboBox2;

    private String output;
    private Register reg;

    public DeleteBox(JComboBox<String> jComboBox1, Register reg, JComboBox<String> jComboBox2) {
        this.jComboBox = jComboBox1;
        this.jComboBox2 = jComboBox2;
        this.reg = reg;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String spec = (String) jComboBox.getSelectedItem();
     
        this.output = spec;

        if (spec != null) {
            switch (spec) {
                case "Cardiology":
                    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.getNames(reg.getSpecArray("Cardiology"), reg.getCardioNo())));

                    break;
                case "Pulmonology":
                    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.getNames(reg.getSpecArray("Pulmonology"), reg.getPulmNo())));
                    break;
                case "Infectious Disease":
                    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.getNames(reg.getSpecArray("Infectious Disease"), reg.getInfNo())));
                    break;
                case "Hematology":
                    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.getNames(reg.getSpecArray("Hematology"), reg.getHemNo())));
                    break;
                case "Intensive Care Medicine":
                    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.getNames(reg.getSpecArray("Intensive Care Medicine"), reg.getIntNo())));
                    break;
                case "Neurology":
                    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.getNames(reg.getSpecArray(spec), reg.getNeuroNo())));
                    break;
                case "Ophthalmology":
                    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.getNames(reg.getSpecArray(spec), reg.getEyeNo())));
                    break;
                case "Orthopedics":
                    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.getNames(reg.getSpecArray(spec), reg.getOrthoNo())));
                    break;
                case "Urology":
                    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.getNames(reg.getSpecArray(spec), reg.getUroNo())));
                    break;
                case "Surgery":
                    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(reg.getNames(reg.getSpecArray(spec), reg.getSurgNo())));
                    break;

                default:

                    break;

            }
          

        }
    }

    String getOutput() {
        return output;
    }

}
