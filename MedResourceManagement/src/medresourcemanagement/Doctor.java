/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medresourcemanagement;

import javax.swing.JOptionPane;

/**
 *
 * @author b00720507
 */
public abstract class Doctor {
    protected String name;
    protected String contactAddress;
    protected PrefContact contact;
    protected String contactID;
    protected Specialism specialism;
    
    
    protected TimesAvailaby timesAva;
    
    public Doctor(){
        
    }
   
    @Override
   public String toString(){
       String out;
       out=name+","+contactAddress+","+contact+","+contactID+","+specialism;
       return out;
   } 
   public abstract void setSpecialism();
   
   public void setInfo(){
       name = JOptionPane.showInputDialog("Enter name");
       contactAddress = JOptionPane.showInputDialog("Enter Address");
       contact = (PrefContact.valueOf(JOptionPane.showInputDialog("Select contact type (Telephone/Skype/Facetime")));      
       contactID = JOptionPane.showInputDialog("Enter contact info");
       
   }
   
   
}
