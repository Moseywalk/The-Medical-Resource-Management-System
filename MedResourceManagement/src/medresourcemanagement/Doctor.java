package medresourcemanagement;

import java.time.LocalTime;

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
    //all times sun-sat kept in seperate object
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

        public void setInfo(String contactStyle, String s_name, String s_address, String s_contact) {
        name = s_name;
        contactAddress = s_address;
        contact = (PrefContact.valueOf(contactStyle));
        contactID = s_contact;
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
                 System.out.println("medresourcemanagement.Doctor.getDayTimes() - Sunday");
                break;
            case "Mon":
                out[0] = timesAva.getMonStartTime();
                out[1] = timesAva.getMonEndTime();
                System.out.println("medresourcemanagement.Doctor.getDayTimes() - Monday");
                break;
            case "Tue":
                out[0] = timesAva.getTueStartTime();
                out[1] = timesAva.getTueEndTime();
                 System.out.println("medresourcemanagement.Doctor.getDayTimes() - Tuesday");
                break;
            case "Wed":
                out[0] = timesAva.getWedStartTime();
                out[1] = timesAva.getWedEndTime();
                 System.out.println("medresourcemanagement.Doctor.getDayTimes() - Wednesday");
                break;
            case "Thu":
                out[0] = timesAva.getThurStartTime();
                out[1] = timesAva.getThursEndTime();
                System.out.println("medresourcemanagement.Doctor.getDayTimes() - Thursday");
                break;
            case "Fri":
                out[0] = timesAva.getFriStartTime();
                out[1] = timesAva.getFriEndTime();
                 System.out.println("medresourcemanagement.Doctor.getDayTimes() - Friday");
                break;
            case "Sat":
                out[0] = timesAva.getSatStartTime();
                out[1] = timesAva.getSatEndTime();
                 System.out.println("medresourcemanagement.Doctor.getDayTimes() - Saturday");
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



}
