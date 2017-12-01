/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author b00720507
 */
public class DeleteBox implements ActionListener{
   private JComboBox jComboBox;
    private JComboBox jComboBox2;
 private String output;
 private Register reg;
 private JPanel parent;
 private JTextField textF;
 private JButton deleteButton;
 
    public DeleteBox(JComboBox<String> jComboBox1, JComboBox<String> jComboBox2, Register reg) {
        this.jComboBox = jComboBox1;
        this.jComboBox2 = jComboBox2;
        this.reg = reg;
    }

    DeleteBox(JComboBox<String> jComboBox1, JComboBox<String> jComboBox2, JTextField jTextField1, Register reg) {
       this.jComboBox = jComboBox1;
        this.jComboBox2 = jComboBox2;
        this.reg = reg;
        this.textF = jTextField1;
        
    }

 

    @Override
    public void actionPerformed(ActionEvent e) {
     String spec = (String) jComboBox.getSelectedItem();
        System.out.println(spec);
        this.output = spec;
    
                if (spec != null) {

                    switch (spec) {
                        case "Cardiology":
//                            String[] test = {"test","test"};
//                            System.out.println("gui.DeleteBox.actionPerformed()");
//                           jComboBox2 = new JComboBox<>(test);
                            
                          
                          
                           

                            break;
                        case "Pulmonology":

                            break;
                        case "Infectious Disease":

                            break;
                        case "Hematology":

                            break;
                        case "Intensive Care Medicine":

                            break;
                        case "Neurology":

                            break;
                        case "Ophthalmology":

                            break;
                        case "Orthopedics":

                            break;
                        case "Urology":

                            break;
                        case "Surgery":

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
