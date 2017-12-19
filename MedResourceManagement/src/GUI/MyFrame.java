
package gui;

import medresourcemanagement.Register;
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
    public JFrame self;
    
    public MyFrame(Register regIn) {
        //set up objects
        //this is so jframe referenece can be passed to actionlisteners
        self = this; 
        this.reg = regIn;
        
        //boring frame stuff 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //set location to centre
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x - 200, y - 225);
        this.setSize(400, 450);
        this.setTitle("Medical Resource Management");
        

        //add menu objects (also boring!)
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
        
        //add action listeners 
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
                 Availability avPanel = new Availability(reg, self);
                setContentPane(avPanel);

                //gets rid of bug 
                setSize(400, 449);
                setSize(400, 450);

            }
        });

        Availability avPanel = new Availability(reg, self);
        this.setContentPane(avPanel);

        this.setVisible(true);
    }

}
