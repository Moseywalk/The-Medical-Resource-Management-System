package medresourcemanagement;

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
