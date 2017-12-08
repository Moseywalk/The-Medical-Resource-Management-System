package medresourcemanagement;

public class InfectiousDisease extends Doctor {

    public InfectiousDisease() {
        super();
        setSpecialism();
    }

    @Override
    public final void setSpecialism() {
        this.specialism = Specialism.INFECTIOUS_DISEASE;
    }

}
