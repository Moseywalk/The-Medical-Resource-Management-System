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
public class Cardiology extends Doctor{

    public Cardiology(){
        super();
        setSpecialism();
    }
    
    @Override
    public final void setSpecialism() {
        specialism = Specialism.CARDIOLOGY;
    }
    
    
}
