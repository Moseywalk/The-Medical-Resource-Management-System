package medresourcemanagement;

import java.time.LocalTime;
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
        out = name + ";" + contactAddress + ";" + contact + ";" + contactID + ";" + specialism;
        return out;
    }

    public abstract void setSpecialism();

    public void setInfo() {
        name = JOptionPane.showInputDialog("Enter name");
        contactAddress = JOptionPane.showInputDialog("Enter Address");
        contact = (PrefContact.valueOf(JOptionPane.showInputDialog("Select contact type (Telephone/Skype/Facetime")));
        contactID = JOptionPane.showInputDialog("Enter contact info");

    }

    public void setAvailabilityTimes(String sunSt, String sunEt, String monSt, String monEt, String tueSt, String tueEt,
            String wedSt, String wedEt, String thuSt, String thuEt, String friSt, String friEt, String satSt, String satEt) {
        this.timesAva.setSunTime(sunSt, sunEt);
        this.timesAva.setMonTime(monSt, monEt);
        this.timesAva.setTueTime(tueSt, tueEt);
        this.timesAva.setWedTime(wedSt, wedEt);
        this.timesAva.setThuTime(thuSt, thuEt);
        this.timesAva.setFriTime(friSt, friEt);
        this.timesAva.setSatTime(satSt, satEt);
        System.out.println("Times set!");
    }

    public LocalTime[] getDayTimes(String day) {
        LocalTime[] out = new LocalTime[2];
        switch (day) {
            case "Sun":
                out[0] = timesAva.getSunStartTime();
                out[1] = timesAva.getSunEndTime();
                break;
            case "Mon":
                out[0] = timesAva.getMonStartTime();
                out[1] = timesAva.getMonEndTime();
                System.out.println("medresourcemanagement.Doctor.getDayTimes()");
                break;
            case "Tue":
                out[0] = timesAva.getTueStartTime();
                out[1] = timesAva.getTueEndTime();
                break;
            case "Wed":
                out[0] = timesAva.getWedStartTime();
                out[1] = timesAva.getWedEndTime();
                break;
            case "Thu":
                out[0] = timesAva.getThurStartTime();
                out[1] = timesAva.getThursEndTime();
                break;
            case "Fri":
                out[0] = timesAva.getFriStartTime();
                out[1] = timesAva.getFriEndTime();
                break;
            case "Sat":
                out[0] = timesAva.getSatStartTime();
                out[1] = timesAva.getSatEndTime();
                break;
            default:

                break;

        }

        return out;
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
