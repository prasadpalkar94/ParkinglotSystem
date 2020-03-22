import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ParkingLotTest {
     ParkingLotAnalyzer parkingLotAnalyzer;

    @Before
    public void setUp() throws Exception {
        parkingLotAnalyzer = new ParkingLotAnalyzer();
    }


    @Test
    public void givenCondition_When_There_Is_Space_For_Park_shouldReturnTrue() {
        boolean park = parkingLotAnalyzer.parkVehicle();
        Assert.assertTrue(park);
    }
}
