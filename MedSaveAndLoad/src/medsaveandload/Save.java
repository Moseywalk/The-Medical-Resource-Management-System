/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medsaveandload;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author b00720507
 */
public class Save {
    PrintWriter out;
    public Save() throws IOException{
        out = new PrintWriter(new FileWriter("records.txt", false));
    }
    public void writeToFile(Register reg){
//         StringBuilder sb = new StringBuilder();
       //OUTPUT for CARDIO
       //when it comes to real thing remove system.out for fileWriter methods
      out.println("CARDIOLOGY");
       for (int x=0;x<reg.cardioNo;x++){ 
          out.println(reg.cardioDocs[x]);
           
       }
       
       //OUTPUT for CARDIO
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("PULMONOLOGY");
       for (int x=0;x<reg.pulmNo;x++){
           out.println(reg.pulmDocs[x]);
        
       }
      
       //OUTPUT for INFECTIOUS_DISEASE
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("INFECTIOUS_DISEASE");
       for (int x=0;x<reg.infNo;x++){
           out.println(reg.infDocs[x]);
         
       }
       
       //OUTPUT for CARDIO
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("HEMATOLOGY");
       for (int x=0;x<reg.hemNo;x++){
          out.println(reg.hemDocs[x]);
        
       }
       
       //OUTPUT for INTENSIVE_CARE_MEDICINE
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("INTENSIVE_CARE_MEDICINE");
       for (int x=0;x<reg.infNo;x++){
          out.println(reg.infDocs[x]);
         
       }
      
       //OUTPUT for NEUROLOGY
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("NEUROLOGY");
       for (int x=0;x<reg.neuroNo;x++){
           out.println(reg.neuroDocs[x]);
        
       }
      
       //OUTPUT for OPHTHALMOLOGY
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("OPHTHALMOLOGY");
       for (int x=0;x<reg.eyeNo;x++){
           out.println(reg.eyeDocs[x]);
        
       }
       
       //OUTPUT for ORTHOPEDICS
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("ORTHOPEDICS");
       for (int x=0;x<reg.orthoNo;x++){
 out.println(reg.orthoDocs[x]);
         
       }
    
       //OUTPUT for UROLOGY
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("UROLOGY");
       for (int x=0;x<reg.uroNo;x++){
         out.println(reg.uroDocs[x]);
          
       }
       
        //OUTPUT for SURGERY
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("SURGERY");
       for (int x=0;x<reg.surgNo;x++){
          out.println(reg.surgDocs[x]);
          
       }
       
       out.close();
    }
}
