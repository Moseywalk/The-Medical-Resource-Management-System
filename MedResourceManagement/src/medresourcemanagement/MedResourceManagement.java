/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medresourcemanagement;

import GUI.MyFrame;



/**
 *
 * @author b00720507
 */
public class MedResourceManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MedResourceManagement mrm = new MedResourceManagement();
        mrm.setUpObjs();

    }

    public void setUpObjs() {
        Register reg = new Register();
        MyFrame frame = new MyFrame();
        frame.setUpFrame();
        //example new surgeon 
        
//        Doctor s = new SpecialistDoc();
//        Doctor t = new SpecialistDoc();
//        reg.addToRegister(s);
//        reg.addToRegister(t);
//        reg.deleteFromRegister("Gordon");
      
    }
}
