/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import medresourcemanagement.Cardiology;
import medresourcemanagement.Specialism;

/**
 *
 * @author b00720507
 */

public class AddButton implements ActionListener{
    private Specialism spec;
    public AddButton(Specialism specin){
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(spec){
            
            case CARDIOLOGY:
                Cardiology temp = new Cardiology();
                System.out.println("this is working");
                break;
                    
            
            
        }
    }
    
}
