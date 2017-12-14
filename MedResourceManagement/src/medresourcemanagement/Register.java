package medresourcemanagement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author b00720507
 */
public class Register {

    /**
     *
     */
    //public ArrayList cardioDocs = new ArrayList<Cardiology>();
    private final Cardiology[] cardioDocs = new Cardiology[10];
    private int cardioNo = 0;
    //public ArrayList pulmDocs =  new ArrayList<Pulmonology>();
    private final Pulmonology[] pulmDocs = new Pulmonology[10];
    private int pulmNo = 0;
    //public ArrayList infDocs = new ArrayList<InfectiousDisease>();
    private final InfectiousDisease[] infDocs = new InfectiousDisease[10];
    private int infNo = 0;
    //public ArrayList hemDocs = new ArrayList<Hematology>();
    private final Hematology[] hemDocs = new Hematology[10];
    private int hemNo = 0;
    //public ArrayList intDocs = new ArrayList<IntensiveCareMedicine>();
    private final IntensiveCareMedicine[] intDocs = new IntensiveCareMedicine[10];
    private int intNo = 0;
    //break
    //public ArrayList neuroDocs = new ArrayList<Neurology>();
    private final Neurology[] neuroDocs = new Neurology[10];
    private int neuroNo = 0;
    //public ArrayList eyeDocs = new ArrayList<Ophthalmology>();
    private final Ophthalmology[] eyeDocs = new Ophthalmology[10];
    private int eyeNo = 0;
    //public ArrayList orthoDocs = new ArrayList <Orthopedics>();
    private final Orthopedics[] orthoDocs = new Orthopedics[10];
    private int orthoNo = 0;
    //public ArrayList uroDocs = new ArrayList<Urology>();
    private final Urology[] uroDocs = new Urology[10];
    private int uroNo = 0;
    //public ArrayList surgDocs = new ArrayList<Surgery>();
    private final Surgery[] surgDocs = new Surgery[10];
    private int surgNo = 0;
    //list of Doctors   
    public Object[] list = {cardioDocs, pulmDocs, infDocs, hemDocs, intDocs, neuroDocs, eyeDocs, orthoDocs, uroDocs, surgDocs};
    int docsNo = 0;

    public Register() {
        this.loadFromFile();
        this.readAvailabiltyTime();
    }

    public void addToRegister(Doctor doc) {
        Specialism s = doc.getSpecialism();
        System.out.println("Adding to register");
        if (null != doc.getSpecialism()) //find input specialism
        {
            switch (s) {
                case CARDIOLOGY:

                    if (cardioNo < 10) {
                        cardioDocs[cardioNo] = (Cardiology) doc;
                        cardioNo++;
                        docsNo++;
                        System.out.println(cardioDocs[(cardioNo - 1)]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case PULMONOLOGY:
                    if (pulmNo < 10) {
                        pulmDocs[pulmNo] = (Pulmonology) doc;
                        pulmNo++;
                        docsNo++;
                        System.out.println(pulmDocs[pulmNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case INFECTIOUS_DISEASE:
                    if (infNo < 10) {
                        infDocs[infNo] = (InfectiousDisease) doc;
                        infNo++;
                        docsNo++;
                        System.out.println(infDocs[infNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case HEMATOLOGY:
                    if (hemNo < 10) {
                        hemDocs[hemNo] = (Hematology) doc;
                        hemNo++;
                        docsNo++;
                        System.out.println(hemDocs[hemNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case INTENSIVE_CARE_MEDICINE:
                    if (intNo < 10) {
                        intDocs[intNo] = (IntensiveCareMedicine) doc;
                        intNo++;
                        docsNo++;
                        System.out.println(intDocs[intNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case NEUROLOGY:
                    if (neuroNo < 10) {
                        neuroDocs[neuroNo] = (Neurology) doc;
                        neuroNo++;
                        docsNo++;
                        System.out.println(neuroDocs[neuroNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case OPHTHALMOLOGY:
                    if (eyeNo < 10) {
                        eyeDocs[eyeNo] = (Ophthalmology) doc;
                        eyeNo++;
                        docsNo++;
                        System.out.println(eyeDocs[eyeNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case ORTHOPEDICS:
                    if (orthoNo < 10) {
                        orthoDocs[orthoNo] = (Orthopedics) doc;
                        orthoNo++;
                        docsNo++;
                        System.out.println(orthoDocs[orthoNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case UROLOGY:
                    if (uroNo < 10) {
                        uroDocs[uroNo] = (Urology) doc;
                        uroNo++;
                        docsNo++;
                        System.out.println(uroDocs[uroNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case SURGERY:
                    if (surgNo < 10) {
                        surgDocs[surgNo] = (Surgery) doc;
                        surgNo++;
                        docsNo++;
                        System.out.println(surgDocs[surgNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                default:
                    break;

            }
        }

    }

    public void deleteFromRegister(String name, Doctor[] docArray, String spec) {
        //search register for index

        try {
            int index = this.searchSpecReg(name, docArray);
            docArray[index] = null;

            System.out.println("deleted " + name);

            switch (spec) {
                case "Cardiology":
                    cardioNo--;
                    sortNull(index, cardioDocs);
                    saveToFile();
                    break;
                case "Pulmonology":

                    pulmNo--;
                    sortNull(index, pulmDocs);
                    saveToFile();
                    break;
                case "Infectious Disease":

                    infNo--;
                    sortNull(index, infDocs);
                    saveToFile();
                    break;
                case "Hematology":

                    hemNo--;
                    sortNull(index, hemDocs);
                    saveToFile();
                    break;
                case "Intensive Care Medicine":

                    intNo--;
                    sortNull(index, intDocs);
                    saveToFile();
                    break;
                case "Neurology":

                    neuroNo--;
                    sortNull(index, neuroDocs);
                    saveToFile();
                    break;
                case "Ophthalmology":

                    eyeNo--;
                    sortNull(index, eyeDocs);
                    saveToFile();
                    break;
                case "Orthopedics":

                    orthoNo--;
                    sortNull(index, orthoDocs);
                    saveToFile();
                    break;
                case "Urology":

                    uroNo--;
                    sortNull(index, uroDocs);
                    saveToFile();
                    break;
                case "Surgery":

                    surgNo--;
                    sortNull(index, surgDocs);
                    saveToFile();
                    break;

                default:

                    break;

            }

        } catch (Exception ex) {
            System.out.println(ex.getCause());
            System.out.println("Couldn't find doctor with specified name in register ");
        }

    }

    private void sortNull(int index, Doctor[] docArray) {
        //move null to end
        System.out.println("Sort");
        for (int a = index; a < 10; a++) {
            if (a != 9) {
                docArray[a] = docArray[a + 1];
            } else {
                docArray[a] = null;
            }
        }
    }

    public int searchSpecReg(String name, Doctor[] docArray) {
        int index = -1;

        for (int x = 0; x < 10; x++) {
            if (docArray[x].getName().equals(name)) {
                index = x;
                System.out.println("Found at " + x);
                break;
            }
        }

        return index;
    }

    public int[] searchReg(String name) {
        int[] indexes = {-1, -1};
        int check = -1;

        //search all arrays 
        //if cardio 
        boolean found = false;
        try {
            check = searchSpecReg(name, cardioDocs);
        } catch (Exception ex) {

        }

        if (check >= 0 && !found) {
            System.out.println("Doctor Found at " + check + " in cardio");
            indexes[0] = 1;
            indexes[1] = check;
            found = true;
        } else {
            try {
                check = searchSpecReg(name, pulmDocs);
            } catch (Exception ex) {

            }
        }
        if (check >= 0 && !found) {
            System.out.println("Doctor Found at " + check);
            indexes[0] = 2;
            indexes[1] = check;
            found = true;
        } else {

            try {
                check = searchSpecReg(name, infDocs);
            } catch (Exception ex) {

            }
        }
        if (check >= 0 && !found) {
            System.out.println("Doctor Found at " + check);
            indexes[0] = 3;
            indexes[1] = check;
            found = true;
        } else {

            try {
                check = searchSpecReg(name, hemDocs);
            } catch (Exception ex) {

            }
        }
        if (check >= 0 && !found) {
            System.out.println("Doctor Found at " + check);
            indexes[0] = 4;
            indexes[1] = check;
            found = true;
        } else {
            try {

                check = searchSpecReg(name, intDocs);
            } catch (Exception ex) {

            }
        }
        if (check >= 0 && !found) {
            System.out.println("Doctor Found at " + check);
            indexes[0] = 5;
            indexes[1] = check;
            found = true;
        } else {
            try {

                check = searchSpecReg(name, neuroDocs);
            } catch (Exception ex) {

            }
        }
        if (check >= 0 && !found) {
            System.out.println("Doctor Found at " + check);
            indexes[0] = 6;
            indexes[1] = check;
            found = true;
        } else {
            try {
                check = searchSpecReg(name, eyeDocs);
            } catch (Exception ex) {

            }
        }
        if (check >= 0 && !found) {
            System.out.println("Doctor Found at " + check);
            indexes[0] = 7;
            indexes[1] = check;
            found = true;
        } else {
            try {
                check = searchSpecReg(name, orthoDocs);
            } catch (Exception ex) {

            }
        }
        if (check >= 0 && !found) {
            System.out.println("Doctor Found at " + check);
            indexes[0] = 8;
            indexes[1] = check;
            found = true;
        } else {

            try {
                check = searchSpecReg(name, uroDocs);
            } catch (Exception ex) {

            }
        }
        if (check >= 0 && !found) {
            System.out.println("Doctor Found at " + check);
            indexes[0] = 9;
            indexes[1] = check;
            found = true;
        } else {
            try {
                check = searchSpecReg(name, surgDocs);
            } catch (Exception ex) {

            }
        }
        if (check >= 0 && !found) {
            System.out.println("Doctor Found at " + check);
            indexes[0] = 10;
            indexes[1] = check;
            found = true;
        }

        return indexes;
    }

    public Doctor getDoc(int[] where) {
        Doctor out = null;
        if (where[0] == 1) {
            out = cardioDocs[where[1]];
        }
        if (where[0] == 2) {
            out = pulmDocs[where[1]];
        }
        if (where[0] == 3) {
            out = infDocs[where[1]];
        }
        if (where[0] == 4) {
            out = hemDocs[where[1]];
        }
        if (where[0] == 5) {
            out = intDocs[where[1]];
        }
        if (where[0] == 6) {
            out = neuroDocs[where[1]];
        }
        if (where[0] == 7) {
            out = eyeDocs[where[1]];
        }
        if (where[0] == 8) {
            out = orthoDocs[where[1]];
        }
        if (where[0] == 9) {
            out = uroDocs[where[1]];
        }
        if (where[0] == 10) {
            out = surgDocs[where[1]];
        }

        return out;
    }

    /* -------------------------------------------------------*/
    public void saveToFile() {
        Save s = null;
        try {
            s = new Save();
        } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        s.writeToFile(this);
    }

    public void loadFromFile() {
        ReadAndLoad rAndL = null;

        try {
            rAndL = new ReadAndLoad(this);
        } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readAvailabiltyTime() {
        try {
            ReadAvailabilityTime times = new ReadAvailabilityTime();
            times.readAvailabilityFile(this);
            times.sortInputs(this);
        } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /* ------------------------GetNames-------------------------------*/
        public String[] getNames(Doctor[] list, int docNo) {
        String[] out = new String[docNo];

        for (int x = 0; x < docNo; x++) {
            try {
                out[x] = list[x].getName();
            } catch (NullPointerException ex) {
                out[x] = null;
            }

            //System.out.println(out[x]);

        }

        return out;
    }
    public String[] getNamesWithNulls(Doctor[] list) {
        String[] out = new String[10];

        for (int x = 0; x < 10; x++) {
            try {
                out[x] = list[x].getName();
            } catch (NullPointerException ex) {
                out[x] = null;
            }

            //System.out.println(out[x]);

        }

        return out;
    }

    /* -------------------------------------------------------*/
    public Doctor[] getSpecArray(String spec) {
        Doctor[] out = null;
        {
            switch (spec) {
                case "Cardiology":
                    out = cardioDocs;
                    break;
                case "Pulmonology":
                    out = pulmDocs;
                    break;
                case "Infectious Disease":
                    out = infDocs;
                    break;
                case "Hematology":
                    out = hemDocs;
                    break;
                case "Intensive Care Medicine":
                    out = infDocs;
                    break;
                case "Neurology":
                    out = neuroDocs;
                    break;
                case "Ophthalmology":
                    out = eyeDocs;
                    break;
                case "Orthopedics":
                    out = orthoDocs;
                    break;
                case "Urology":
                    out = uroDocs;
                    break;
                case "Surgery":
                    out = surgDocs;
                    break;

                default:

                    break;

            }

            return out;
        }
    }

    /* -----GETTERS--------------------------------------------------*/
    public int getCardioNo() {
        return this.cardioNo;
    }

    public int getPulmNo() {
        return this.pulmNo;
    }

    public int getInfNo() {
        return this.infNo;
    }

    public int getHemNo() {
        return this.hemNo;
    }

    public int getIntNo() {
        return this.intNo;
    }

    public int getNeuroNo() {
        return this.neuroNo;
    }

    public int getEyeNo() {
        return this.eyeNo;
    }

    public int getOrthoNo() {
        return this.orthoNo;
    }

    public int getUroNo() {
        return this.uroNo;
    }

    public int getSurgNo() {
        return this.surgNo;
    }

    /* -----SETTERS--------------------------------------------------*/
    public void setCardioNo(int in) {
        this.cardioNo = in;
    }

    public void setPulmNo(int in) {
        this.pulmNo = in;
    }

    public void setInfNo(int in) {
        this.infNo = in;
    }

    public void setHemNo(int in) {
        this.hemNo = in;
    }

    public void setIntNo(int in) {
        this.intNo = in;
    }

    public void setNeuroNo(int in) {
        this.neuroNo = in;
    }

    public void setEyeNo(int in) {
        this.eyeNo = in;
    }

    public void setOrthoNo(int in) {
        this.orthoNo = in;
    }

    public void setUroNo(int in) {
        this.uroNo = in;
    }

    public void setSurgNo(int in) {
        this.surgNo = in;
    }

}
