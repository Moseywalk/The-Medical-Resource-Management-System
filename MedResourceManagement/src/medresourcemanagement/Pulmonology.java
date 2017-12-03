package medresourcemanagement;

public class Pulmonology extends Doctor {
    
    public Pulmonology(){
     super();   
     setSpecialism();
    }

    @Override
    public final void setSpecialism() {
       this.specialism = Specialism.PULMONOLOGY;
    }
    
}
