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
    public void setInfo() {

        name = JOptionPane.showInputDialog("Enter name");
        contactAddress = JOptionPane.showInputDialog("Enter Address");
        contact = (PrefContact.valueOf(JOptionPane.showInputDialog("Select contact type (Telephone/Skype/Facetime")));
        contactID = JOptionPane.showInputDialog("Enter contact info");
        DateOfLatestCert = JOptionPane.showInputDialog("Enter date of latest Cert");
    }
}
