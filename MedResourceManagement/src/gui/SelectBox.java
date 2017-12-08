/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 *
 * @author b00720507
 */
public class SelectBox implements ActionListener {

    private String output;
    private JComboBox jComboBox;

    public SelectBox() {

    }

    SelectBox(JComboBox<String> jComboBox2) {
        this.jComboBox = jComboBox2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String out = (String) jComboBox.getSelectedItem();
        System.out.println(out);
        this.output = out;
    }

    public String getOutput() {
        return output;
    }

    public JComboBox getJCombo() {
        return this.jComboBox;
    }
}
