package medresourcemanagement;

public class Orthopedics extends Doctor {
    
    public Orthopedics(){
        super();
        setSpecialism();
    }
    @Override
    public void setSpecialism() {
        this.specialism = Specialism.ORTHOPEDICS;
    }
    
}
