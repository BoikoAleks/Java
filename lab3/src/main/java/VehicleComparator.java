import java.util.Comparator;

public class VehicleComparator implements Comparator<Vechicle> {
    @Override
    public int compare(Vechicle o1, Vechicle o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}
