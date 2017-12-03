package medresourcemanagement;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

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

    public Doctor() {
        timesAva = new TimesAvailaby();
    }

    @Override
    public String toString() {
        String out;
        out = name + "," + contactAddress + "," + contact + "," + contactID + "," + specialism;
        return out;
    }

    public abstract void setSpecialism();

    public void setInfo() {
        name = JOptionPane.showInputDialog("Enter name");
        contactAddress = JOptionPane.showInputDialog("Enter Address");
        contact = (PrefContact.valueOf(JOptionPane.showInputDialog("Select contact type (Telephone/Skype/Facetime")));
        contactID = JOptionPane.showInputDialog("Enter contact info");

    }
    public void setAvailabilityTimes(String sunSt, String sunEt,String monSt,String monEt,String tueSt, String tueEt,
            String wedSt, String wedEt, String thuSt,String thuEt, String friSt, String friEt,String satSt,String satEt){
        this.timesAva.setSunTime(sunSt, sunEt);
        this.timesAva.setMonTime(monSt, monEt);
        this.timesAva.setTueTime(tueSt, tueEt);
        this.timesAva.setWedTime(wedSt, wedEt);
        this.timesAva.setThuTime(thuSt, thuEt);
        this.timesAva.setFriTime(friSt, friEt);
        this.timesAva.setSatTime(satSt, satEt);
        System.out.println("Times set!");
    }

    public Specialism getSpecialism() {
        return specialism;
    }

    public PrefContact getPrefContact() {
        return contact;
    }

    public String getContactID() {
        return this.contactID;
    }

    public String getName() {
        return this.name;
    }

    public String getContactAddress() {
        return this.contactAddress;
    }

    public void setInfo(String spec, String contactStyle, String s_name, String s_address, String s_contact) {
        name = s_name;
        contactAddress = s_address;
        contact = (PrefContact.valueOf(contactStyle));
        contactID = s_contact;
    }

}
