/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author b00720507
 */
public class MyFrame extends JFrame {
    
    public Register reg;
    public MyFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(300, 350);
        this.setSize(400,450);
        reg = new Register();

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem input = new JMenuItem("New Doctor");
        JMenuItem delete = new JMenuItem("Remove Doctor");
        JMenuItem availability = new JMenuItem("Doctors Available");
        this.setJMenuBar(menuBar);
        menuBar.add(menu);
        menu.add(input);
        menu.add(delete);
        menu.add(availability);
        
        
        
        
        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Add doc = new Add(reg);
                setContentPane(doc);
              
                //gets rid of bug 
               setSize(400,499);
               setSize(400,500);
                
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Delete del = new Delete(reg);
               setContentPane(del);
              
                setSize(400,499);
                setSize(400,500);
            }
        });
        availability.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Avail av = new Avail(reg);
                setContentPane(av);
                
                setSize(400,499);
                setSize(400,500);
                
                
            }
        });
        
        Add newDoc = new Add(reg);
        this.setContentPane(newDoc);
        
        this.setVisible(true);

//        Login newLogin = new Login(reg);
//        this.setContentPane(newLogin);
//        this.setVisible(true);
    }


}
