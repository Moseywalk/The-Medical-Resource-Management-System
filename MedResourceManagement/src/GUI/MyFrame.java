/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author b00720507
 */
public class MyFrame extends JFrame {

    public Register reg;

    public MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //set location to centre
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x - 200, y - 225);
        this.setSize(400, 450);
        this.setTitle("Medical Resource Management");

        reg = new Register();

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
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
                setSize(400, 449);
                setSize(400, 450);

            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Delete del = new Delete(reg);
                setContentPane(del);

                //gets rid of bug 
                setSize(400, 449);
                setSize(400, 450);
            }
        });
        availability.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Avail av = new Avail(reg);
                setContentPane(av);

                //gets rid of bug 
                setSize(400, 449);
                setSize(400, 450);

            }
        });

        Add newDoc = new Add(reg);
        this.setContentPane(newDoc);

        this.setVisible(true);
    }

}
