/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medsaveandload;

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
    

    public ReadAndLoad(Register reg) throws IOException {

        read = new FileReader(new File("records.txt"));
        bf = new BufferedReader(read);

        // test read it all in!
//     while(bf.ready()){
//         System.out.println(bf.readLine());
//     }
        //first look for CARDIO DOCS Tag
        
        String input =(bf.readLine());
        System.out.println(input);
        if("CARDIOLOGY".equals(input)){
            //then next char will indicate number cardio of records
            cardioNo = Integer.parseInt(bf.readLine());
            
             System.out.println(cardioNo);
             // next 2 lines will be records
             
             
        }
        
        
    }

}
