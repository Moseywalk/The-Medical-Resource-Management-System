/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medsaveandload;

/**
 *
 * @author b00720507
 */
public class MedSaveAndLoad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Register reg = new Register();
       Cardiology card = new Cardiology();
       card.setInfo(null,"Skype","Gordon","address","oasdas");
       Cardiology gor = new Cardiology();
       gor.setInfo(null,"Skype","werwer","address","oasdas");
       Hematology qwe = new Hematology();
       gor.setInfo(null,"Skype","werwer","address","oasdas");
       Surgery zxc = new Surgery();
       zxc.setInfo(null,"Skype","name","address","oasdas");
       reg.addToRegister(card);
       reg.addToRegister(gor);
       reg.addToRegister(qwe);
       reg.addToRegister(zxc);
       
       reg.saveToFile();
       reg.loadFromFile();
       
       
       
     
        
        
    }
    
}
