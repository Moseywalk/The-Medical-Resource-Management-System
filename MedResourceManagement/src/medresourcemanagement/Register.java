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
    int neuroNo =0;
    //Ophthalmology[] eyeDocs = new Ophthalmology[10];
    int eyeNo = 0;
    //Orthopedics[] orthoDocs = new Orthopedics[10];
    int orthoNo  = 0;
    //Urology[] uroDocs = new Urology[10];
    int uroNo = 0;
    //Surgery[] surgDocs = new Surgery[10];
    int surgNo = 0;
    //list of Doctors
    Doctor[] docs = new Doctor[100];
    int docsNo =0;
    
    
    
    

    public Register() {

    }

    public void addToRegister(Doctor doc) {
        doc.setInfo();
        if(null != doc.specialism) //find input specialism
        switch (doc.specialism) {
            case Cardiology:
                docs[docsNo] = doc;
                cardioNo++;
                docsNo++;
                
                break;
            case Pulmonology:
                docs[docsNo] = doc;
                pulmNo++;
                docsNo++;
                break;
            case InfectiousDisease:
                docs[docsNo] = doc;
                infNo++;
                docsNo++;
                break;
            case Hematology:
                docs[docsNo] = doc;
                hemNo++;
                docsNo++;
                break;
            case IntensiveCareMedicine:
                docs[docsNo] = doc;
                intNo++;
                docsNo++;
                break;
            case Neurology:
                docs[docsNo] = doc;
                neuroNo++;
                docsNo++;
                break;
            case Ophthalmology:
                docs[docsNo] = doc;
                eyeNo++;
                docsNo++;
                break;
            case Orthopedics:
                docs[docsNo] = doc;
                orthoNo++;
                docsNo++;
                break;
            case Urology:
                docs[docsNo] = doc;
                uroNo++;
                docsNo++;
                break;
            case Surgery:
                docs[docsNo] = doc;
                surgNo++;
                
                
              
                break;
            default:
                System.out.println("surgeon stored");
                break;
        }
          System.out.println(docs[docsNo]);
        
        
    }
    
    public void deleteFromRegister(String name){
     //search register for index
     try{
       int index = searchReg(name);
       docs[index] = null;
       System.out.println("deleted "+name);
     }
     catch(Exception ex){
         ex.getCause();
         System.out.println("Couldn't find doctor with specified name in register ");
     }
     
    }
    public int searchReg(String name) {
        int index = 0;
        for(int x = 0; x < docs.length; x++){
         
         if(docs[x].name.equals(name)||docs[x].name.contains(name)){
             // found it!
             
             index = x;
             break;
         }
     }
        
        
        return index;
    }
    
    
    
}
