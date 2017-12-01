/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import medresourcemanagement.Cardiology;
import medresourcemanagement.Doctor;
import medresourcemanagement.Hematology;
import medresourcemanagement.InfectiousDisease;
import medresourcemanagement.IntensiveCareMedicine;
import medresourcemanagement.Neurology;
import medresourcemanagement.Ophthalmology;
import medresourcemanagement.Orthopedics;
import medresourcemanagement.Pulmonology;
import medresourcemanagement.ReadAndLoad;
import medresourcemanagement.Save;
import medresourcemanagement.Specialism;
import medresourcemanagement.Surgery;
import medresourcemanagement.Urology;

/**
 *
 * @author b00720507
 */
public class Register {

    private JPanel inputs;
    public Cardiology[] cardioDocs = new Cardiology[10];
    public int cardioNo = 0;
    public Pulmonology[] pulmDocs = new Pulmonology[10];
    public int pulmNo = 0;
    public InfectiousDisease[] infDocs = new InfectiousDisease[10];
   public  int infNo = 0;
    public Hematology[] hemDocs = new Hematology[10];
   public  int hemNo = 0;
   public  IntensiveCareMedicine[] intDocs = new IntensiveCareMedicine[10];
   public  int intNo = 0;
    //break
   public  Neurology[] neuroDocs = new Neurology[10];
    public int neuroNo = 0;
    public Ophthalmology[] eyeDocs = new Ophthalmology[10];
    public int eyeNo = 0;
    public Orthopedics[] orthoDocs = new Orthopedics[10];
    public int orthoNo = 0;
   public  Urology[] uroDocs = new Urology[10];
   public  int uroNo = 0;
    public Surgery[] surgDocs = new Surgery[10];
   public  int surgNo = 0;
    //list of Doctors
    // Doctor[] docs = new Doctor[100];

    int docsNo = 0;

    public Register() {

    }

    public void addToRegister(Doctor doc) {

        Specialism s = doc.getSpecialism();
        System.out.println("Adding to register");
        if (null != doc.getSpecialism()) //find input specialism
        {
            switch (s) {
                case CARDIOLOGY:
                    if (cardioNo <= 10) {
                        cardioDocs[cardioNo] = (Cardiology) doc;
                        cardioNo++;
                        docsNo++;
                        System.out.println(cardioDocs[cardioNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case PULMONOLOGY:
                    if (pulmNo <= 10) {
                        pulmDocs[pulmNo] = (Pulmonology) doc;
                        pulmNo++;
                        docsNo++;
                        System.out.println(pulmDocs[pulmNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case INFECTIOUS_DISEASE:
                    if (infNo <= 10) {
                        infDocs[infNo] = (InfectiousDisease) doc;
                        infNo++;
                        docsNo++;
                        System.out.println(infDocs[infNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case HEMATOLOGY:
                    if (hemNo <= 10) {
                        hemDocs[hemNo] = (Hematology) doc;
                        hemNo++;
                        docsNo++;
                        System.out.println(hemDocs[hemNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case INTENSIVE_CARE_MEDICINE:
                    if (intNo <= 10) {
                        intDocs[intNo] = (IntensiveCareMedicine) doc;
                        intNo++;
                        docsNo++;
                        System.out.println(intDocs[intNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case NEUROLOGY:
                    if (neuroNo <= 10) {
                        neuroDocs[neuroNo] = (Neurology) doc;
                        neuroNo++;
                        docsNo++;
                        System.out.println(neuroDocs[neuroNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case OPHTHALMOLOGY:
                    if (eyeNo <= 10) {
                        eyeDocs[eyeNo] = (Ophthalmology) doc;
                        eyeNo++;
                        docsNo++;
                        System.out.println(eyeDocs[eyeNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case ORTHOPEDICS:
                    if (orthoNo <= 10) {
                        orthoDocs[orthoNo] = (Orthopedics) doc;
                        orthoNo++;
                        docsNo++;
                        System.out.println(orthoDocs[orthoNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case UROLOGY:
                    if (uroNo <= 10) {
                        uroDocs[uroNo] = (Urology) doc;
                        uroNo++;
                        docsNo++;
                        System.out.println(uroDocs[uroNo - 1]);
                    } else {
                        System.err.print("10 doctors of this speciality already exist... delete to continue..");
                    }
                    break;
                case SURGERY:
                    if (surgNo <= 10) {
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
        //save

    }

    public void deleteFromRegister(String name, Doctor[] docArray) {
        //search register for index
        try {
            int index = this.searchReg(name, docArray);
            docArray[index] = null;
            System.out.println("deleted " + name);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
            System.out.println("Couldn't find doctor with specified name in register ");
        }

    }

    public int searchReg(String name, Doctor[] docArray) {
        int index = 0;
        for (int x = 0; x < docArray.length; x++) {

            if (docArray[x].getName().equals(name) || docArray[x].getName().contains(name)) {
                // found it!
                System.out.println("found it at " + x);
                index = x;
                break;
            }
        }

        return index;
    }

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

    public String cardioOutput() {
        String out = "";
        for (int x = 0; x < cardioNo; x++) {
            out = cardioDocs[x].getName();
            System.out.println(cardioDocs[x]);

        }
        return out;
    }

}
