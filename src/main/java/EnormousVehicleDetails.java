public class EnormousVehicleDetails {
    public String number_Plate;
    public String brand_Name;
    public String vehicle_Color;
    public double time_Per_Hour;
    public String car_Park_Time;

    public static final double charge = 80;

    public EnormousVehicleDetails(String number_Plate, String brand_Name, String vehicle_Color, double time_Per_Hour, String car_Park_Time) {
        this.number_Plate = number_Plate;
        this.brand_Name = brand_Name;
        this.vehicle_Color = vehicle_Color;
        this.time_Per_Hour = time_Per_Hour;
        this.car_Park_Time = car_Park_Time;
    }
}
