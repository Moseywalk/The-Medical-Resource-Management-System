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
class Register {

    //Cardiology[] cardioDocs = new Cardiology[10];
    int cardioNo = 0;
    //Pulmonology[] pulmDocs = new Pulmonology[10];
    int pulmNo = 0;
    //InfectiousDisease[] infDocs = new InfectiousDisease[10];
    int infNo = 0;
    //Hematology[] hemDocs = new Hematology[10];
    int hemNo = 0;
    //IntensiveCareMedicine[] intDocs = new IntensiveCareMedicine[10];
    int intNo = 0;
    //break
    //Neurology[] neuroDocs = new Neurology[10];
    int neuroNo = 0;
    //Ophthalmology[] eyeDocs = new Ophthalmology[10];
    int eyeNo = 0;
    //Orthopedics[] orthoDocs = new Orthopedics[10];
    int orthoNo = 0;
    //Urology[] uroDocs = new Urology[10];
    int uroNo = 0;
    //Surgery[] surgDocs = new Surgery[10];
    int surgNo = 0;
    //list of Doctors
    Doctor[] docs = new Doctor[100];
    int docsNo = 0;

    public Register() {

    }

    public void addToRegister(Doctor doc) {
        //set Doctor info
        doc.setInfo();
        if (null != doc.specialism) //find input specialism
        {
            switch (doc.specialism) {
                case CARDIOLOGY:
                    if (cardioNo <= 10) {
                        docs[docsNo] = doc;
                        cardioNo++;
                        docsNo++;
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case PULMONOLOGY:
                    if (pulmNo <= 10) {
                        docs[docsNo] = doc;
                        pulmNo++;
                        docsNo++;
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case INFECTIOUS_DISEASE:
                    if (infNo <= 10) {
                        docs[docsNo] = doc;
                        infNo++;
                        docsNo++;
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case HEMATOLOGY:
                    if (hemNo <= 10) {
                        docs[docsNo] = doc;
                        hemNo++;
                        docsNo++;
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case INTENSIVE_CARE_MEDICINE:
                    if (intNo <= 10) {
                        docs[docsNo] = doc;
                        intNo++;
                        docsNo++;
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case NEUROLOGY:
                    if (neuroNo <= 10) {
                        docs[docsNo] = doc;
                        neuroNo++;
                        docsNo++;
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case OPHTHALMOLOGY:
                    if (eyeNo <= 10) {
                        docs[docsNo] = doc;
                        eyeNo++;
                        docsNo++;
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case ORTHOPEDICS:
                    if (orthoNo <= 10) {
                        docs[docsNo] = doc;
                        orthoNo++;
                        docsNo++;
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case UROLOGY:
                    if (uroNo <= 10) {
                        docs[docsNo] = doc;
                        uroNo++;
                        docsNo++;
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case SURGERY:
                    if (surgNo <= 10) {
                        docs[docsNo] = doc;
                        surgNo++;
                        docsNo++;
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                default:
                    break;

            }
        }
        System.out.println(docs[docsNo - 1]);

    }

    public void deleteFromRegister(String name) {
        //search register for index
        try {
            int index = searchReg(name);
            docs[index] = null;
            System.out.println("deleted " + name);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
            System.out.println("Couldn't find doctor with specified name in register ");
        }

    }

    public int searchReg(String name) {
        int index = 0;
        for (int x = 0; x < docs.length; x++) {

            if (docs[x].name.equals(name)||docs[x].name.contains(name)) {
                // found it!
                System.out.println("found it at " + x);
                index = x;
                break;
            }
        }

        return index;
    }

}
