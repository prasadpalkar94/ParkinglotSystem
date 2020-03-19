public class VehicleDetailsDTO {
    public String number_Plate;
    public String brand_Name;
    public String vehicle_Color;
    public double time_Per_Hour;
    public String car_Park_Time;

    public VehicleDetailsDTO(MiniatureVehicleDetails miniVehicles) {
        number_Plate=miniVehicles.number_Plate;
        brand_Name=miniVehicles.brand_Name;
        vehicle_Color=miniVehicles.vehicle_Color;
        time_Per_Hour=miniVehicles.time_Per_Hour;
        car_Park_Time=miniVehicles.car_Park_Time;
    }

    public VehicleDetailsDTO(EnormousVehicleDetails largeVehicles) {
        number_Plate=largeVehicles.number_Plate;
        brand_Name=largeVehicles.brand_Name;
        vehicle_Color=largeVehicles.vehicle_Color;
        time_Per_Hour=largeVehicles.time_Per_Hour;
        car_Park_Time=largeVehicles.car_Park_Time;
    }
}
