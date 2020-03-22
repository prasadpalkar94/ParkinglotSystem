import java.util.ArrayList;
import java.util.List;

public class ParkingLotAnalyzer {

     boolean unPark = false;
     int check;
     List<Boolean> lot_List = new ArrayList<>();
     int capacity = 15;

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

    public boolean isFull(){
        while (lot_List.size() != capacity ){
            lot_List.add(true);
        }
        if (lot_List.size() > capacity){
            check = 1;
            return true;
        }
        throw new ParkingLotException("NOT ENOUGH SPACE",ParkingLotException.ExceptionType.SPACE_OCCUPIED);
    }

    public boolean check_Security_Informed() {
        isFull();
        if(this.check == 1){
            return true;
        }
            return false;
    }

    public boolean checkEmptyLot() {
        if (lot_List.size() < capacity){
            return true;
        }
        throw new ParkingLotException("ENOUGH SPACE AVAILABLE",ParkingLotException.ExceptionType.ENOUGH_SPACE_AVAILABLE);
    }
}
