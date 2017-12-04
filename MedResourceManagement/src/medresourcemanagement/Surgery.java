/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medresourcemanagement;

import javax.swing.JOptionPane;

public class Surgery extends Doctor {

    public String DateOfLatestCert;

    public Surgery() {
        super();
        setSpecialism();

    }

    @Override
    public final void setSpecialism() {
        this.specialism = Specialism.SURGERY;
    }

    @Override
    public String toString() {
        String out;
        out = name + "," + contactAddress + "," + contact + "," + contactID + "," + specialism + "," + DateOfLatestCert;
        return out;
    }

    @Override

    
//       public void setInfo(String spec, String contactStyle, String s_name, String s_address, String s_contact) {
//        name = s_name;
//        contactAddress = s_address;
//        contact = (PrefContact.valueOf(contactStyle));
//        contactID = s_contact;
//        DateOfLatestCert = JOptionPane.showInputDialog(null, "Enter date of latest Cert");
//    }
        public void setInfo(String spec, String contactStyle, String s_name, String s_address, String s_contact) {
        name = s_name;
        contactAddress = s_address;
        contact = (PrefContact.valueOf(contactStyle));
        contactID = s_contact;
        DateOfLatestCert = JOptionPane.showInputDialog("Enter Date of Last Certificate");
    }
        public void setInfo(String spec, String contactStyle, String s_name, String s_address, String s_contact, String date) {
        name = s_name;
        contactAddress = s_address;
        contact = (PrefContact.valueOf(contactStyle));
        contactID = s_contact;
        DateOfLatestCert = date;
    }
}
