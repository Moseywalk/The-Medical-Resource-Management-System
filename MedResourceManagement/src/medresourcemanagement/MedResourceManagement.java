package medresourcemanagement;

import gui.MyFrame;

/**
 *
 * @author b00720507
 */
public class MedResourceManagement {

    public static void main(String[] args) {
        MedResourceManagement mrm = new MedResourceManagement();
        mrm.setUpObjs();

    }

    public void setUpObjs() {
        Register reg = new Register();
        MyFrame frame = new MyFrame(reg);
    
      
    }
}
