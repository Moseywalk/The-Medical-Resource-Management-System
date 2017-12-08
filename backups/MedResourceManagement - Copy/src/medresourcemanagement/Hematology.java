
package medresourcemanagement;


public class Hematology extends Doctor {
        
    
    public Hematology(){
        super();
        setSpecialism();
    }
    @Override
    public final void setSpecialism() {
        this.specialism = Specialism.HEMATOLOGY;
    }
    
}
