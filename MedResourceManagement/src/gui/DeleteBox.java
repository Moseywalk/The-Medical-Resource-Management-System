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
public class DeleteBox implements ActionListener {

    private JComboBox jComboBox;

    private String output;
    private Register reg;

    public DeleteBox(JComboBox<String> jComboBox1, Register reg) {
        this.jComboBox = jComboBox1;

        this.reg = reg;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String spec = (String) jComboBox.getSelectedItem();
        System.out.println(spec);
        this.output = spec;

    }

    String getOutput() {
        return output;
    }

}
