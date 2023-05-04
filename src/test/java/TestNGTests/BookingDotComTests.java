package TestNGTests;

import base.GeneralMethod;
import org.testng.annotations.Test;
import stepDefinitions.BookingStepDefinitions;

public class BookingDotComTests {




    @Test
    public void roundtrip(){
        GeneralMethod generalMethod=new GeneralMethod();
        generalMethod.closesignin();
        generalMethod.navigatetoFlights();
        generalMethod.selecttriptype("oneway");
        generalMethod.selectcabinType("ECONOMY");
        generalMethod.selectTravellers(1,0,0);
        generalMethod.selectOriginandDestination("MAA","DEL");
        generalMethod.selectthedate();
        generalMethod.selecttheFlight();
        generalMethod.selectFromDialogBox();
        generalMethod.FillContactDetails();
        generalMethod.filltravelerDetails();
        generalMethod.clickonNextPage();
        generalMethod.clickonSkipSeats();
        generalMethod.fillPayment();
    }
}
