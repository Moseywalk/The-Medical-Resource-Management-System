/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.spi.RegisterableService;
import javax.swing.*;

/**
 *
 * @author b00720507
 */
public class MyFrame extends JFrame {
    public MyFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(300, 350);
        this.setSize(400,450);

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
               Add doc = new Add();
                setContentPane(doc);
              
                //gets rid of bug 
               setSize(400,499);
               setSize(400,500);
                
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Delete del = new Delete();
               setContentPane(del);
              
                setSize(400,499);
                setSize(400,500);
            }
        });
        availability.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Add newDoc = new Add();
        this.setContentPane(newDoc);
        
        this.setVisible(true);
    }


}
