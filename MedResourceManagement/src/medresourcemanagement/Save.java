package medresourcemanagement;

import gui.Register;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Save {
    PrintWriter out;
    public Save() throws IOException{
        out = new PrintWriter(new FileWriter("Doctor Records File.txt", false));
    }
    public void writeToFile(Register reg){
//         StringBuilder sb = new StringBuilder();
       //OUTPUT for CARDIO
       //when it comes to real thing remove system.out for fileWriter methods
      out.println("CARDIOLOGY");
      out.println(reg.getCardioNo());
       for (int x=0;x<reg.getCardioNo();x++){ 
          out.println(reg.getSpecArray("Cardiology")[x]);
           
       }
       
       //OUTPUT for CARDIO
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("PULMONOLOGY");
       out.println(reg.getPulmNo());
       for (int x=0;x<reg.getPulmNo();x++){
           out.println(reg.getSpecArray("Pulmonology")[x]);
        
       }
      
       //OUTPUT for INFECTIOUS_DISEASE
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("INFECTIOUS_DISEASE");
       out.println(reg.getInfNo());
       for (int x=0;x<reg.getInfNo();x++){
           out.println(reg.getSpecArray("Infectious Disease")[x]);
         
       }
       
       //OUTPUT for CARDIO
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("HEMATOLOGY");
       out.println(reg.getHemNo());
       for (int x=0;x<reg.getHemNo();x++){
          out.println(reg.getSpecArray("Hematology")[x]);
        
       }
       
       //OUTPUT for INTENSIVE_CARE_MEDICINE
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("INTENSIVE_CARE_MEDICINE");
       out.println(reg.getIntNo());
       for (int x=0;x<reg.getIntNo();x++){
          out.println(reg.getSpecArray("Intensive Care Medicine")[x]);
         
       }
      
       //OUTPUT for NEUROLOGY
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("NEUROLOGY");
       out.println(reg.getNeuroNo());
       for (int x=0;x<reg.getNeuroNo();x++){
           out.println(reg.getSpecArray("Neurology")[x]);
        
       }
      
       //OUTPUT for OPHTHALMOLOGY
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("OPHTHALMOLOGY");
       out.println(reg.getEyeNo());
       for (int x=0;x<reg.getEyeNo();x++){
           out.println(reg.getSpecArray("Ophthalmology")[x]);
        
       }
       
       //OUTPUT for ORTHOPEDICS
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("ORTHOPEDICS");
       out.println(reg.getOrthoNo());
       for (int x=0;x<reg.getOrthoNo();x++){
 out.println(reg.getSpecArray("Orthopedics")[x]);
         
       }
    
       //OUTPUT for UROLOGY
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("UROLOGY");
       out.println(reg.getUroNo());
       for (int x=0;x<reg.getUroNo();x++){
         out.println(reg.getSpecArray("Urology")[x]);
          
       }
       
        //OUTPUT for SURGERY
       //when it comes to real thing remove system.out for fileWriter methods
       out.println("SURGERY");
       out.println(reg.getSurgNo());
       for (int x=0;x<reg.getSurgNo();x++){
          out.println(reg.getSpecArray("Surgery")[x]);
          
       }
       
       out.close();
    }
}
