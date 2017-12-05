/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import medresourcemanagement.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
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

    AddButtonListener(SelectBox listen) {

    }

    AddButtonListener(SelectBox listen, SelectBox listen2, JTextField name, JTextField address, JTextField contact,Register reg) {
        this.sb = listen;
        this.sb2 = listen2;
        this.name = name;
        this.address = address;
        this.contact = contact;
        //make register
        this.reg = reg;

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        
        spec = sb.getOutput();
        contactStyle = sb2.getOutput();
        s_name = name.getText();
        s_address = address.getText();
        s_contact = contact.getText();
        System.out.println("text fields are... " + s_name +" "+ s_address +" "+ s_contact);

        if (spec != null && contactStyle != null) {
            //create new 
            
            switch (spec) {
                case "Cardiology":
                    System.out.println("addddddddddddding");
                    Doctor temp = new Cardiology();
                    temp.setInfo(spec,contactStyle,s_name,s_address,s_contact);
                    reg.addToRegister(temp);
                    break;
                case "Pulmonology":
                    Doctor temp1 = new Pulmonology();
                    System.out.println(spec + " add button listener");
                    temp1.setInfo(spec,contactStyle,s_name,s_address,s_contact);
                    reg.addToRegister(temp1);
                    break;
                case "Infectious Disease":
                   
                    Doctor temp2 = new InfectiousDisease();
                    temp2.setInfo(spec,contactStyle,s_name,s_address,s_contact);
                    reg.addToRegister(temp2);
                    break;
                case "Hematology":
                    Doctor temp3 = new Hematology();
                    temp3.setInfo(spec,contactStyle,s_name,s_address,s_contact);
                    reg.addToRegister(temp3);
                    break;
                case "Intensive Care Medicine":
                   Doctor temp4 = new IntensiveCareMedicine();
                    temp4.setInfo(spec,contactStyle,s_name,s_address,s_contact);
                    reg.addToRegister(temp4);
                    break;
                case "Neurology":
                    Doctor temp5 = new Neurology();
                    temp5.setInfo(spec,contactStyle,s_name,s_address,s_contact);
                    reg.addToRegister(temp5);
                    break;
                case "Ophthalmology":
                     Doctor temp6 = new Ophthalmology();
                    temp6.setInfo(spec,contactStyle,s_name,s_address,s_contact);
                    reg.addToRegister(temp6);
                    break;
                case "Orthopedics":
                   Doctor temp7 = new Orthopedics();
                    temp7.setInfo(spec,contactStyle,s_name,s_address,s_contact);
                    reg.addToRegister(temp7);
                    break;
                case "Urology":
                    Doctor temp8 = new Urology();
                    temp8.setInfo(spec,contactStyle,s_name,s_address,s_contact);
                    reg.addToRegister(temp8);
                    break;
                case "Surgery":
                   Doctor temp9 = new Surgery();
                    temp9.setInfo(spec,contactStyle,s_name,s_address,s_contact);
                    reg.addToRegister(temp9);
                    break;

                default:

                    break;
                   
            }
             System.out.println("Saving...");
             reg.saveToFile();
             
            
           //clear tboxes
           this.name.setText(null);
           this.address.setText(null);
           this.contact.setText(null);
           sb.getJCombo().setSelectedIndex(-1);
           sb2.getJCombo().setSelectedIndex(-1);
            
        } else {
            System.out.println("Enter details first ");
        }
    }

}
