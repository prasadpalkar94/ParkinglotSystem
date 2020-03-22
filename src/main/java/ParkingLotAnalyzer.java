import java.util.ArrayList;

public class ParkingLotAnalyzer {

     boolean unPark = false;

    public boolean parkVehicle() {
        return true;
    }

    boolean park = parkVehicle();

    public boolean unParkVehicle() {
        if (park == true) {
            unPark = true;
        }
        return unPark;
    }


}
