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
import javax.swing.JTextField;
import medresourcemanagement.*;

/**
 *
 * @author b00720507
 */
public class AddButtonListener implements ActionListener {

    String spec, contactStyle;
    SelectBox sb, sb2;
    JTextField name, address, contact;
    String s_name, s_address, s_contact;
    Register reg;

    AddButtonListener(SelectBox listen, SelectBox listen2, JTextField name, JTextField address, JTextField contact, Register reg) {
       //many variables to be used here!
        this.sb = listen;
        this.sb2 = listen2;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.reg = reg;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        spec = sb.getOutput();
        contactStyle = sb2.getOutput();
        s_name = name.getText();
        s_address = address.getText();
        s_contact = contact.getText();
        System.out.println("text fields are... " + s_name + " " + s_address + " " + s_contact);

        if (spec != null && contactStyle != null && s_name != null && s_address != null && s_contact != null) {
            //create new for each type of doc
            //all doctor references are tempory and thus called temp!
            switch (spec) {
                case "Cardiology":

                    Doctor temp = new Cardiology();
                    temp.setInfo(contactStyle, s_name, s_address, s_contact);
                    reg.addToRegister(temp);
                    break;
                case "Pulmonology":
                    Doctor temp1 = new Pulmonology();
                    temp1.setInfo(contactStyle, s_name, s_address, s_contact);
                    reg.addToRegister(temp1);
                    break;
                case "Infectious Disease":
                    Doctor temp2 = new InfectiousDisease();
                    temp2.setInfo(contactStyle, s_name, s_address, s_contact);
                    reg.addToRegister(temp2);
                    break;
                case "Hematology":
                    Doctor temp3 = new Hematology();
                    temp3.setInfo(contactStyle, s_name, s_address, s_contact);
                    reg.addToRegister(temp3);
                    break;
                case "Intensive Care Medicine":
                    Doctor temp4 = new IntensiveCareMedicine();
                    temp4.setInfo(contactStyle, s_name, s_address, s_contact);
                    reg.addToRegister(temp4);
                    break;
                case "Neurology":
                    Doctor temp5 = new Neurology();
                    temp5.setInfo(contactStyle, s_name, s_address, s_contact);
                    reg.addToRegister(temp5);
                    break;
                case "Ophthalmology":
                    Doctor temp6 = new Ophthalmology();
                    temp6.setInfo(contactStyle, s_name, s_address, s_contact);
                    reg.addToRegister(temp6);
                    break;
                case "Orthopedics":
                    Doctor temp7 = new Orthopedics();
                    temp7.setInfo(contactStyle, s_name, s_address, s_contact);
                    reg.addToRegister(temp7);
                    break;
                case "Urology":
                    Doctor temp8 = new Urology();
                    temp8.setInfo(contactStyle, s_name, s_address, s_contact);
                    reg.addToRegister(temp8);
                    break;
                case "Surgery":
                    Surgery temp9 = new Surgery();
                    String certDate = JOptionPane.showInputDialog("Enter date of last Certification");
                    temp9.setInfo(contactStyle, s_name, s_address, s_contact, certDate);
                    reg.addToRegister(temp9);
                    break;

                default:

                    break;

            }
            System.out.println("Saving...");
            reg.saveToFile();
            JOptionPane.showMessageDialog(null, "Doctor has been saved");

            //clear tboxes and reset combos
            this.name.setText(null);
            this.address.setText(null);
            this.contact.setText(null);
            sb.getJCombo().setSelectedIndex(-1);
            sb2.getJCombo().setSelectedIndex(-1);

        } else {
            System.out.println("Enter details first ");
            JOptionPane.showMessageDialog(null, "Enter all details first!",null,JOptionPane.WARNING_MESSAGE);
        }
    }

}
