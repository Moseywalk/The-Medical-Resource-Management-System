package medresourcemanagement;

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
