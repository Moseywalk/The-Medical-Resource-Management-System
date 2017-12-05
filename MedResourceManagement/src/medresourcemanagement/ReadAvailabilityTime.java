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
import java.util.ArrayList;

/**
 *
 * @author hannahmcmenamin
 */
public class ReadAvailabilityTime {

    private final ArrayList tempName = new ArrayList();
    //private String[] tempName;

    private final ArrayList tempSundaySt = new ArrayList();
    private final ArrayList tempSundayEt = new ArrayList();

    private final ArrayList tempMondaySt = new ArrayList();
    private final ArrayList tempMondayEt = new ArrayList();

    private final ArrayList tempTuesdaySt = new ArrayList();
    private final ArrayList tempTuesdayEt = new ArrayList();

    private final ArrayList tempWednesdaySt = new ArrayList();
    private final ArrayList tempWednesdayEt = new ArrayList();

    private final ArrayList tempThursdaySt = new ArrayList();
    private final ArrayList tempThursdayEt = new ArrayList();

    private final ArrayList tempFridaySt = new ArrayList();
    private final ArrayList tempFridayEt = new ArrayList();

    private final ArrayList tempSaturdaySt = new ArrayList();
    private final ArrayList tempSaturdayEt = new ArrayList();

    private int records = 0;

    public ReadAvailabilityTime() {

    }

    public void readAvailabilityFile(Register reg) throws IOException {
        System.out.println("Reading from file");

        // this.reg = reg;
        FileReader read = new FileReader(new File("Availability Update File.txt"));
        BufferedReader bf = new BufferedReader(read);
        String line;
        String[] tokens;

        while (bf.ready()) {
            //read name
            line = bf.readLine();
            System.out.println(line);
            tempName.add(line);

            //Read in Sunday
            line = bf.readLine();
            //System.out.println(line);
            tokens = line.split(" ");
            tempSundaySt.add(records, tokens[1]);
            tempSundayEt.add(records, tokens[2]);
            System.out.println(tempSundaySt.get(records));
            System.out.println(tempSundayEt.get(records));

            //read in Monday       
            line = bf.readLine();
            tokens = line.split(" ");

            tempMondaySt.add(records, tokens[1]);
            tempMondayEt.add(records, tokens[2]);
            System.out.println(tempMondaySt.get(records));
            System.out.println(tempMondayEt.get(records));

            //read in Tuesday   
            line = bf.readLine();
            tokens = line.split(" ");

            tempTuesdaySt.add(records, tokens[1]);
            tempTuesdayEt.add(records, tokens[2]);
            System.out.println(tempTuesdaySt.get(records));
            System.out.println(tempTuesdayEt.get(records));

            //read in Wednesday  
            line = bf.readLine();
            tokens = line.split(" ");

            tempWednesdaySt.add(records, tokens[1]);
            tempWednesdayEt.add(records, tokens[2]);
            System.out.println(tempWednesdaySt.get(records));
            System.out.println(tempWednesdayEt.get(records));

            //read in Thursday
            line = bf.readLine();
            tokens = line.split(" ");

            tempThursdaySt.add(records, tokens[1]);
            tempThursdayEt.add(records, tokens[2]);

            System.out.println(tempThursdaySt.get(records));
            System.out.println(tempThursdayEt.get(records));

            //read in Friday
            line = bf.readLine();
            tokens = line.split(" ");

            tempFridaySt.add(records, tokens[1]);
            tempFridayEt.add(records, tokens[2]);
            System.out.println(tempFridaySt.get(records));
            System.out.println(tempFridayEt.get(records));

            //read in Saturday
            line = bf.readLine();
            tokens = line.split(" ");

            tempSaturdaySt.add(records, tokens[1]);
            tempSaturdayEt.add(records, tokens[2]);
            System.out.println(tempSaturdaySt.get(records));
            System.out.println(tempSaturdayEt.get(records));
            //incriment 
            records++;
        }

        System.out.println(records);

    }

    public void sortInputs(Register reg) {

        for (int x = 0; x < records; x++) {
            //search the Register for names
            String out = tempName.get(x).toString();
            System.out.println(out);
            //indexes signifies particular register and position within reg
            int[] indexes = reg.searchReg(tempName.get(x).toString());
            // check indexes
            for (int y = 0; y < indexes.length; y++) {
                System.out.println(indexes[y]);
            }

            try {
                System.out.println(reg.getDoc(indexes).getName() + " ref works");
            } catch (Exception ex) {

            }
            String tempName = this.tempName.get(x).toString();
            String tempSunS = this.tempSundaySt.get(x).toString();
            String tempSunE = this.tempSundayEt.get(x).toString();
            String tempMonS = this.tempMondaySt.get(x).toString();
            String tempMonE = this.tempMondayEt.get(x).toString();
            String tempTueS = this.tempTuesdaySt.get(x).toString();
            String tempTueE = this.tempTuesdayEt.get(x).toString();
            String tempWedS = this.tempWednesdaySt.get(x).toString();
            String tempWedE = this.tempWednesdayEt.get(x).toString();
            String tempThuS = this.tempThursdaySt.get(x).toString();
            String tempThuE = this.tempThursdayEt.get(x).toString();
            String tempFriS = this.tempFridaySt.get(x).toString();
            String tempFriE = this.tempFridayEt.get(x).toString();
            String tempSatS = this.tempSaturdaySt.get(x).toString();
            String tempSatE = this.tempSaturdayEt.get(x).toString();

            try {
                reg.getDoc(indexes).setAvailabilityTimes(tempSunS, tempSunE, tempMonS, tempMonE, tempTueS, tempTueE,
                        tempWedS, tempWedE, tempThuS, tempThuE, tempFriS, tempFriE, tempSatS, tempSatE);
            } catch (Exception ex) {
                System.err.println(ex.getCause() + ": No reference for Doctor can be found");
            }
        }

    }

}
