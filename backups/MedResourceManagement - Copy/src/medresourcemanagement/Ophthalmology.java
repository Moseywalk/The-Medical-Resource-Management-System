package medresourcemanagement;

public class Ophthalmology extends Doctor{
    
    public Ophthalmology(){
        super();
    }

    @Override
    public void setSpecialism() {
        this.specialism = Specialism.OPHTHALMOLOGY;
    }
    
}
