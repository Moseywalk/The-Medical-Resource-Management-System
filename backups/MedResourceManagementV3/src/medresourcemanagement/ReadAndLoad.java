/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medresourcemanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Gordo
 */
public class ReadAndLoad {

    FileReader read = null;
    BufferedReader bf = null;
    Register reg;

    private int cardioNo = 0;

    private int pulmNo = 0;

    private int infNo = 0;

    private int hemNo = 0;

    private int intNo = 0;
    //break

    private int neuroNo = 0;

    private int eyeNo = 0;

    private int orthoNo = 0;

    private int uroNo = 0;

    private int surgNo = 0;
    protected String tempName;
    protected String tempAddress;
    protected String tempContact;
    protected String tempContactID;

    public ReadAndLoad(Register reg) throws IOException {
        this.reg = reg;
        read = new FileReader(new File("records.txt"));
        bf = new BufferedReader(read);
        String input;
        String[] tokens;
        // test read it all in!
//     while(bf.ready()){
//         System.out.println(bf.readLine());
//     }
        //first look for CARDIO DOCS Tag

        input = (bf.readLine());
        System.out.println(input);
        if ("CARDIOLOGY".equals(input)) {
            this.readIn(cardioNo, input);
        }
        //cardio done
        //pulm
        input = (bf.readLine());
        System.out.println(input);
        if ("PULMONOLOGY".equals(input)) {
            this.readIn(pulmNo, input);
        }
        input = (bf.readLine());
        System.out.println(input);
        if ("INFECTIOUS_DISEASE".equals(input)) {
            this.readIn(infNo, input);
        }
        input = (bf.readLine());
        System.out.println(input);
        if ("HEMATOLOGY".equals(input)) {
            this.readIn(hemNo, input);
        }
        input = (bf.readLine());
        System.out.println(input);
        if ("INTENSIVE_CARE_MEDICINE".equals(input)) {
            this.readIn(intNo, input);
        }
        input = (bf.readLine());
        System.out.println(input);
        if ("NEUROLOGY".equals(input)) {
            this.readIn(neuroNo, input);
        }
        input = (bf.readLine());
        System.out.println(input);
        if ("OPHTHALMOLOGY".equals(input)) {
            this.readIn(eyeNo, input);
        }
        input = (bf.readLine());
        System.out.println(input);
        if ("ORTHOPEDICS".equals(input)) {
            this.readIn(orthoNo, input);
        }
        input = (bf.readLine());
        System.out.println(input);
        if ("UROLOGY".equals(input)) {
            this.readIn(uroNo, input);
        }
        input = (bf.readLine());
        System.out.println(input);
        if ("SURGERY".equals(input)) {
            this.readInSurg(surgNo);
        }
        

    }

    public final void readIn(int i, String spec) throws IOException {
        String input;
        String[] tokens;
        //then nextline char will indicate number cardio of records
        i = Integer.parseInt(bf.readLine());

        System.out.println(i);
        // next X lines will be records
        for (int x = 0; x < i; x++) {
            input = bf.readLine();
            tokens = input.split(",");
            System.out.println(tokens[0] + tokens[1] + tokens[2] + tokens[3] + tokens[4]);
            tempName = tokens[0];
            tempAddress = tokens[1];
            tempContact = tokens[2];
            tempContactID = tokens[3];
            //time to nake a new instanse of spec doc baby!
            switch (spec) {
                case "CARDIOLOGY":
                    System.out.println("Loaded and now creating new Cardio doc");
                    Cardiology temp = new Cardiology();
                    temp.setInfo(null, tempContact, tempName, tempAddress, tempContact);
                    reg.addToRegister(temp);
                    break;
                case "PULMONOLOGY":
                    System.out.println("Loaded and now creating new Pulmono doc");
                    Pulmonology temp1 = new Pulmonology();
                    temp1.setInfo(null, tempContact, tempName, tempAddress, tempContact);
                    reg.addToRegister(temp1);
                    break;
                case "INFECTIOUS_DISEASE":
                    System.out.println("Loaded and now creating new Pulmono doc");
                    InfectiousDisease temp2 = new InfectiousDisease();
                    temp2.setInfo(null, tempContact, tempName, tempAddress, tempContact);
                    reg.addToRegister(temp2);
                    break;
                case "HEMATOLOGY":
                    System.out.println("Loaded and now creating new HEMATOLOGY doc");
                    Hematology temp3 = new Hematology();
                    temp3.setInfo(null, tempContact, tempName, tempAddress, tempContact);
                    reg.addToRegister(temp3);
                    break;
                case "INTENSIVE_CARE_MEDICINE":
                    System.out.println("Loaded and now creating new INTENSIVE_CARE_MEDICINE doc");
                    InfectiousDisease temp4 = new InfectiousDisease();
                    temp4.setInfo(null, tempContact, tempName, tempAddress, tempContact);
                    reg.addToRegister(temp4);
                    break;
                case "NEUROLOGY":
                    System.out.println("Loaded and now creating new NEUROLOGY doc");
                    Neurology temp5 = new Neurology();
                    temp5.setInfo(null, tempContact, tempName, tempAddress, tempContact);
                    reg.addToRegister(temp5);
                    break;
                case "OPHTHALMOLOGY":
                    System.out.println("Loaded and now creating new OPHTHALMOLOGY doc");
                    Ophthalmology temp6 = new Ophthalmology();
                    temp6.setInfo(null, tempContact, tempName, tempAddress, tempContact);
                    reg.addToRegister(temp6);
                    break;
                case "ORTHOPEDICS":
                    System.out.println("Loaded and now creating new ORTHOPEDICS doc");
                    Orthopedics temp7 = new Orthopedics();
                    temp7.setInfo(null, tempContact, tempName, tempAddress, tempContact);
                    reg.addToRegister(temp7);
                    break;
                case "UROLOGY":
                    System.out.println("Loaded and now creating new UROLOGY doc");
                    Urology temp8 = new Urology();
                    temp8.setInfo(null, tempContact, tempName, tempAddress, tempContact);
                    reg.addToRegister(temp8);
                    break;
                    
                    
                default: System.err.println("something went wrong in load");
                    break;
            }

        }
    }

    private void readInSurg(int i) throws IOException {
       String input;
        String[] tokens;
        //then nextline char will indicate number cardio of records
        i = Integer.parseInt(bf.readLine());

        System.out.println(i);
        // next X lines will be records
        for (int x = 0; x < i; x++) {
            input = bf.readLine();
            tokens = input.split(",");
            System.out.println(tokens[0] + tokens[1] + tokens[2] + tokens[3] + tokens[4] + tokens[5]);
            tempName = tokens[0];
            tempAddress = tokens[1];
            tempContact = tokens[2];
            tempContactID = tokens[3];
            //time to nake a new instanse of spec doc baby!
           
              
                    System.out.println("Loaded and now creating new Surgeon");
                    Surgery temp = new Surgery();
                    temp.setInfo(null, tempContact, tempName, tempAddress, tempContact);
                    reg.addToRegister(temp);
                    break;
    }
    }
}
