package TestNGTests;

import commonUtils.RestAssuredBase;
import org.testng.annotations.Test;

public class RestAssuredTests {
    RestAssuredBase restAssuredBase=new RestAssuredBase();
    @Test
    public void getFlights(){
        restAssuredBase.get_Flights();
        restAssuredBase.validateResponse();
        restAssuredBase.validateStatusCode();
    }
}
