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
      out.println(reg.cardioNo);
       for (int x=0;x<reg.cardioNo;x++){ 
          out.println(reg.cardioDocs[x]);
           
       }
       
       //OUTPUT for CARDIO
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("PULMONOLOGY");
       out.println(reg.pulmNo);
       for (int x=0;x<reg.pulmNo;x++){
           out.println(reg.pulmDocs[x]);
        
       }
      
       //OUTPUT for INFECTIOUS_DISEASE
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("INFECTIOUS_DISEASE");
       out.println(reg.infNo);
       for (int x=0;x<reg.infNo;x++){
           out.println(reg.infDocs[x]);
         
       }
       
       //OUTPUT for CARDIO
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("HEMATOLOGY");
       out.print(reg.hemNo);
       for (int x=0;x<reg.hemNo;x++){
          out.println(reg.hemDocs[x]);
        
       }
       
       //OUTPUT for INTENSIVE_CARE_MEDICINE
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("INTENSIVE_CARE_MEDICINE");
       out.println(reg.infNo);
       for (int x=0;x<reg.infNo;x++){
          out.println(reg.infDocs[x]);
         
       }
      
       //OUTPUT for NEUROLOGY
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("NEUROLOGY");
       out.println(reg.neuroNo);
       for (int x=0;x<reg.neuroNo;x++){
           out.println(reg.neuroDocs[x]);
        
       }
      
       //OUTPUT for OPHTHALMOLOGY
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("OPHTHALMOLOGY");
       out.println(reg.eyeNo);
       for (int x=0;x<reg.eyeNo;x++){
           out.println(reg.eyeDocs[x]);
        
       }
       
       //OUTPUT for ORTHOPEDICS
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("ORTHOPEDICS");
       out.println(reg.orthoNo);
       for (int x=0;x<reg.orthoNo;x++){
 out.println(reg.orthoDocs[x]);
         
       }
    
       //OUTPUT for UROLOGY
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("UROLOGY");
       out.println(reg.uroNo);
       for (int x=0;x<reg.uroNo;x++){
         out.println(reg.uroDocs[x]);
          
       }
       
        //OUTPUT for SURGERY
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("SURGERY");
       out.println(reg.surgNo);
       for (int x=0;x<reg.surgNo;x++){
          out.println(reg.surgDocs[x]);
          
       }
       
       out.close();
    }
}
