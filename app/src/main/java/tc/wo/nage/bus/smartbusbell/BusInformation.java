package tc.wo.nage.bus.smartbusbell;

/**
 * Created by na on 2017-08-20.
 */

public class BusInformation {

    String busID;
    String busDestination;

    public String getBusDestination() {
        return busDestination;
    }

    public void setBusDestination(String busDestination) {
        this.busDestination = busDestination;
    }

    public String getBusID() {
        return busID;
    }

    public void setBusID(String busID) {
        this.busID = busID;
    }

    public BusInformation(String busID, String busDestination) {
        this.busID = busID;
        this.busDestination = busDestination;
    }
}
