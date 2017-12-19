/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medresourcemanagement;

import java.time.LocalTime;

/**
 *
 * @author Gordo
 */
public class Report {

    private Register reg;
 
    private final LocalTime one = LocalTime.of(1, 00);
    private final LocalTime two = LocalTime.of(2, 00);
    private final LocalTime three = LocalTime.of(3, 00);
    private final LocalTime four = LocalTime.of(4, 00);
    private final LocalTime five = LocalTime.of(5, 00);
    private final LocalTime six = LocalTime.of(6, 00);
    private final LocalTime seven = LocalTime.of(7, 00);
    private final LocalTime eight = LocalTime.of(8, 00);
    private final LocalTime nine = LocalTime.of(9, 00);
    private final LocalTime ten = LocalTime.of(10, 00);
    private final LocalTime eleven = LocalTime.of(11, 00);
    private final LocalTime midday = LocalTime.NOON;
    private final LocalTime thirteen = LocalTime.of(13, 00);
    private final LocalTime fourteen = LocalTime.of(14, 00);
    private final LocalTime fifthteen = LocalTime.of(15, 00);
    private final LocalTime sixteen = LocalTime.of(16, 00);
    private final LocalTime seventeen = LocalTime.of(17, 00);
    private final LocalTime eighteen = LocalTime.of(18, 00);
    private final LocalTime nineteen = LocalTime.of(19, 00);
    private final LocalTime twenty = LocalTime.of(20, 00);
    private final LocalTime twentyOne = LocalTime.of(21, 00);
    private final LocalTime twentyTwo = LocalTime.of(22, 00);
    private final LocalTime twentythree = LocalTime.of(23, 00);
   private final LocalTime midnight = LocalTime.MIDNIGHT;

    private LocalTime[] allTimes = new LocalTime[25];
    //availavilityHours[0] to be kept null
    private boolean[] availabilityHoursSun = new boolean[25];
    private boolean[] availabilityHoursMon = new boolean[25];
    private boolean[] availabilityHoursTue = new boolean[25];
    private boolean[] availabilityHoursWed = new boolean[25];
    private boolean[] availabilityHoursThu = new boolean[25];
    private boolean[] availabilityHoursFri = new boolean[25];
    private boolean[] availabilityHoursSat = new boolean[25];

    public Report(Register reg) {
        for (int x = 1; x < 25; x++) {
            availabilityHoursSun[x] = false;
            availabilityHoursMon[x] = false;
            availabilityHoursTue[x] = false;
            availabilityHoursWed[x] = false;
            availabilityHoursThu[x] = false;
            availabilityHoursFri[x] = false;
            availabilityHoursSat[x] = false;

            allTimes[1] = one;
            allTimes[2] = two;
            allTimes[3] = three;
            allTimes[4] = four;
            allTimes[5] = five;
            allTimes[6] = six;
            allTimes[7] = seven;
            allTimes[8] = eight;
            allTimes[9] = nine;
            allTimes[10] = ten;
            allTimes[11] = eleven;
            allTimes[12] = midday;
            allTimes[13] = thirteen;
            allTimes[14] = fourteen;
            allTimes[15] = fifthteen;
            allTimes[16] = sixteen;
            allTimes[17] = seventeen;
            allTimes[18] = eighteen;
            allTimes[19] = nineteen;
            allTimes[20] = twenty;
            allTimes[21] = twentyOne;
            allTimes[22] = twentyTwo;
            allTimes[23] = twentythree;
            allTimes[24] = midnight;

        }
        this.reg = reg;

    }

    public String genReport(String day, int noOfDocs, Doctor[] arrayOfDocs) {
        String out = "";

        switch (day) {
            case "Sun":

                LocalTime[] startAndEnd;

                for (int x = 0; x < noOfDocs; x++) {
                    startAndEnd = arrayOfDocs[x].getDayTimes("Sun");
                    if (startAndEnd[0] == startAndEnd[1]) {
                        System.out.println("start " + startAndEnd[0] + " end" + startAndEnd[1]);
                        System.out.println(startAndEnd[0].compareTo(one));
                    } else {
                        //find the range of times the doc is available   
                        for (int y = 1; y < 25; y++) {
                            if (allTimes[y].isAfter(startAndEnd[0]) && allTimes[y].isBefore(startAndEnd[1])) {
                                // one is in range
                                availabilityHoursSun[y] = true;
                                
                            }
                            System.out.println("for "+arrayOfDocs[x].toString()+" availablity time is "+availabilityHoursSun[y]);
                        }

                    }
                }
             
            case "Mon":
                                for (int x = 0; x < noOfDocs; x++) {
                    startAndEnd = arrayOfDocs[x].getDayTimes("Mon");
                    if (startAndEnd[0] == startAndEnd[1]) {
                        System.out.println("start " + startAndEnd[0] + " end" + startAndEnd[1]);
                        System.out.println(startAndEnd[0].compareTo(one));
                    } else {
                        //find the range of times the doc is available   
                        for (int y = 1; y < 25; y++) {
                            if (allTimes[y].isAfter(startAndEnd[0]) && allTimes[y].isBefore(startAndEnd[1])) {
                                // one is in range
                                availabilityHoursSun[y] = true;
                                
                            }
                            System.out.println("for "+arrayOfDocs[x].toString()+" availablity time is "+availabilityHoursSun[y]);
                        }

                    }
                }

            case "Tue":
                                for (int x = 0; x < noOfDocs; x++) {
                    startAndEnd = arrayOfDocs[x].getDayTimes("Tue");
                    if (startAndEnd[0] == startAndEnd[1]) {
                        System.out.println("start " + startAndEnd[0] + " end" + startAndEnd[1]);
                        System.out.println(startAndEnd[0].compareTo(one));
                    } else {
                        //find the range of times the doc is available   
                        for (int y = 1; y < 25; y++) {
                            if (allTimes[y].isAfter(startAndEnd[0]) && allTimes[y].isBefore(startAndEnd[1])) {
                                // one is in range
                                availabilityHoursSun[y] = true;
                                
                            }
                            System.out.println("for "+arrayOfDocs[x].toString()+" availablity time is "+availabilityHoursSun[y]);
                        }

                    }
                }

            case "Wed":
                                for (int x = 0; x < noOfDocs; x++) {
                    startAndEnd = arrayOfDocs[x].getDayTimes("Wed");
                    if (startAndEnd[0] == startAndEnd[1]) {
                        System.out.println("start " + startAndEnd[0] + " end" + startAndEnd[1]);
                        System.out.println(startAndEnd[0].compareTo(one));
                    } else {
                        //find the range of times the doc is available   
                        for (int y = 1; y < 25; y++) {
                            if (allTimes[y].isAfter(startAndEnd[0]) && allTimes[y].isBefore(startAndEnd[1])) {
                                // one is in range
                                availabilityHoursSun[y] = true;
                                
                            }
                            System.out.println("for "+arrayOfDocs[x].toString()+" availablity time is "+availabilityHoursSun[y]);
                        }

                    }
                }

            case "Thu":
                                for (int x = 0; x < noOfDocs; x++) {
                    startAndEnd = arrayOfDocs[x].getDayTimes("Thu");
                    if (startAndEnd[0] == startAndEnd[1]) {
                        System.out.println("start " + startAndEnd[0] + " end" + startAndEnd[1]);
                        System.out.println(startAndEnd[0].compareTo(one));
                    } else {
                        //find the range of times the doc is available   
                        for (int y = 1; y < 25; y++) {
                            if (allTimes[y].isAfter(startAndEnd[0]) && allTimes[y].isBefore(startAndEnd[1])) {
                                // one is in range
                                availabilityHoursSun[y] = true;
                                
                            }
                            System.out.println("for "+arrayOfDocs[x].toString()+" availablity time is "+availabilityHoursSun[y]);
                        }

                    }
                }

            case "Fri":
                                for (int x = 0; x < noOfDocs; x++) {
                    startAndEnd = arrayOfDocs[x].getDayTimes("Fri");
                    if (startAndEnd[0] == startAndEnd[1]) {
                        System.out.println("start " + startAndEnd[0] + " end" + startAndEnd[1]);
                        System.out.println(startAndEnd[0].compareTo(one));
                    } else {
                        //find the range of times the doc is available   
                        for (int y = 1; y < 25; y++) {
                            if (allTimes[y].isAfter(startAndEnd[0]) && allTimes[y].isBefore(startAndEnd[1])) {
                                // one is in range
                                availabilityHoursSun[y] = true;
                                
                            }
                            System.out.println("for "+arrayOfDocs[x].toString()+" availablity time is "+availabilityHoursSun[y]);
                        }

                    }
                }

            case "Sat":
                                for (int x = 0; x < noOfDocs; x++) {
                    startAndEnd = arrayOfDocs[x].getDayTimes("Sat");
                    if (startAndEnd[0] == startAndEnd[1]) {
                        System.out.println("start " + startAndEnd[0] + " end" + startAndEnd[1]);
                        System.out.println(startAndEnd[0].compareTo(one));
                    } else {
                        //find the range of times the doc is available   
                        for (int y = 1; y < 25; y++) {
                            if (allTimes[y].isAfter(startAndEnd[0]) && allTimes[y].isBefore(startAndEnd[1])) {
                                // one is in range
                                availabilityHoursSun[y] = true;
                                
                            }
                            System.out.println("for "+arrayOfDocs[x].toString()+" availablity time "+y+" is "+availabilityHoursSun[y]);
                        }

                    }
                }

            default:

                break;

        }
          for (int y = 1; y < 25; y++) {
              System.out.println("time "+y+" = "+availabilityHoursSun[y]);
              
          }
        return out;
    }

}
