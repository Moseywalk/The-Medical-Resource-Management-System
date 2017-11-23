/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medresourcemanagement;

import gui.MainPanel;
import gui.MyFrame;

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
        frame.run();
        MainPanel main = new MainPanel();
      
        //example new surgeon 
        Doctor s = new Surgery();
        Doctor t = new Cardiology();
        reg.addToRegister(s);
        reg.addToRegister(t);
        reg.deleteFromRegister("Gordon");
      
    }
}
