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
    int docsNo = cardioNo+pulmNo+infNo+hemNo+intNo+neuroNo+eyeNo+orthoNo+uroNo+surgNo;
    
    
    
    

    public Register() {

    }

    public void addToRegister(Doctor doc) {
        doc.setInfo();
        if(null != doc.specialism) //find input specialism
        switch (doc.specialism) {
            case Cardiology:
                docs[docsNo] = doc;
                cardioNo++;
                break;
            case Pulmonology:
                docs[docsNo] = doc;
                pulmNo++;
                break;
            case InfectiousDisease:
                docs[docsNo] = doc;
                infNo++;
                break;
            case Hematology:
                docs[docsNo] = doc;
                hemNo++;
                break;
            case IntensiveCareMedicine:
                docs[docsNo] = doc;
                intNo++;
                break;
            case Neurology:
                docs[docsNo] = doc;
                neuroNo++;
                break;
            case Ophthalmology:
                docs[docsNo] = doc;
                eyeNo++;
                break;
            case Orthopedics:
                docs[docsNo] = doc;
                orthoNo++;
                break;
            case Urology:
                docs[docsNo] = doc;
                uroNo++;
                break;
            case Surgery:
                docs[docsNo] = doc;
                surgNo++;
                System.out.println("surgeon stored");
                System.out.println(doc);
                break;
            default:
                break;
        }
        
        
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
         
         if(docs[x].name.equals(name)){
             // found it!
             
             index = x;
             break;
         }
     }
        
        
        return index;
    }
    
    
    
}
