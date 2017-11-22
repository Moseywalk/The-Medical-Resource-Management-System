/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medresourcemanagement;

import javax.swing.JOptionPane;

/**
 *
 * @author Gordo
 */
public class SpecialistDoc extends Doctor {
    
    public SpecialistDoc(){
        super();
       setSpecialism();
       setInfo();
     
        
    }

    @Override
    public final void setSpecialism() {
       //select specialism
       String input = JOptionPane.showInputDialog("Enter specialism");
       String spec = input.toUpperCase();
       this.specialism = Specialism.valueOf(spec);
    }

    @Override
    public final void setInfo() {
       name = JOptionPane.showInputDialog("Enter name");
       contactAddress = JOptionPane.showInputDialog("Enter Address");
       String input =JOptionPane.showInputDialog("Select contact type (Telephone/Skype/Facetime");
       String through = input.toUpperCase();
       contact = (PrefContact.valueOf(through));      
       contactID = JOptionPane.showInputDialog("Enter contact info");
    }

    @Override
    public String toString() {
       String out;
       out=name+","+contactAddress+","+contact+","+contactID+","+specialism+"\n"+timesAva;
       return out;
    }


    
}
