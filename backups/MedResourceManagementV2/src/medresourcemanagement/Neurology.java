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
public class Neurology extends Doctor {
    
    
    public Neurology(){
        super();
        setSpecialism();
    }
    @Override
    public void setSpecialism() {
        this.specialism = Specialism.NEUROLOGY;
    }
    
}
