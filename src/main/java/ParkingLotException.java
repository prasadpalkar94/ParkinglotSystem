public class ParkingLotException extends RuntimeException {
    public enum ExceptionType{
        SPACE_OCCUPIED,ENOUGH_SPACE_AVAILABLE;
    }
    public ExceptionType type;

    public ParkingLotException(String message, ExceptionType exceptionType)
    {
        super(message);
        this.type = exceptionType;
    }
}
