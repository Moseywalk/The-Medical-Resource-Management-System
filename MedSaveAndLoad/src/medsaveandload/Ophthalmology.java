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
public class Ophthalmology extends Doctor{
    
    public Ophthalmology(){
        super();
    }

    @Override
    public void setSpecialism() {
        this.specialism = Specialism.OPHTHALMOLOGY;
    }
    
}
