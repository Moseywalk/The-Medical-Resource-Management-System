/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author b00712596
 */
public class MyFrame extends JFrame{
    
public MyFrame(){    
 
}
public void setUpFrame(){
    this.setSize(new Dimension(350,400));
 this.setVisible(true);
 this.setLocation(300, 300);
 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
 MainPanel panel = new MainPanel(this);
 this.add(panel);
}
//MainPanel a = new MainPanel();
//a.setVisible(true);
//a.setSize(500,200);
// a.setLocationRelativeTo(null);
       
        
    
    
    
}
