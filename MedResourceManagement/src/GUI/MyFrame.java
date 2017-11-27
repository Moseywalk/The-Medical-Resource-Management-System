/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

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
        Add newDoc = new Add();
        this.setContentPane(newDoc);
        
        this.setVisible(true);
    }
}
