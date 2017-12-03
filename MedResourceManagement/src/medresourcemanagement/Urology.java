
package medresourcemanagement;

public class Urology extends Doctor{
    
    public Urology(){
        super();
        setSpecialism();
    }

    @Override
    public final void setSpecialism() {
       this.specialism = Specialism.UROLOGY;
    }
    
}
