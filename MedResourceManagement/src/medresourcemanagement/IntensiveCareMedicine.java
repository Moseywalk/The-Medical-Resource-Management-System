package medresourcemanagement;

public class IntensiveCareMedicine extends Doctor {
    
    public IntensiveCareMedicine(){
        super();
        setSpecialism();
    }

    @Override
    public final void setSpecialism() {
        this.specialism = Specialism.INTENSIVE_CARE_MEDICINE;
    }
    
}
