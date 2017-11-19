/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medresourcemanagement;

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
    
   
   public String toString(){
       String out;
       out=name+","+contactAddress+","+contact+","+contactID+","+specialism;
       return out;
   } 
   
}
