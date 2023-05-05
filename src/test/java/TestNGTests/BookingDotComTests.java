package TestNGTests;

import base.Base;
import base.GeneralMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stepDefinitions.BookingStepDefinitions;

import java.net.MalformedURLException;

public class BookingDotComTests {

Base base=new Base();


    @Test
    public void onewayEconomy(){
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

@Test
   public void onewayPremiumEconomy(){
       GeneralMethod generalMethod=new GeneralMethod();
       generalMethod.closesignin();
       generalMethod.navigatetoFlights();
       generalMethod.selecttriptype("oneway");
       generalMethod.selectcabinType("PREMIUM_ECONOMY");
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

    @Test
    public void onewayBusiness(){
        GeneralMethod generalMethod=new GeneralMethod();
        generalMethod.closesignin();
        generalMethod.navigatetoFlights();
        generalMethod.selecttriptype("oneway");
        generalMethod.selectcabinType("BUSINESS");
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

    @Test
    public void onewayFirstClass(){
        GeneralMethod generalMethod=new GeneralMethod();
        generalMethod.closesignin();
        generalMethod.navigatetoFlights();
        generalMethod.selecttriptype("oneway");
        generalMethod.selectcabinType("FIRST");
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

    @Test
    public void roundTripEconomy(){
        GeneralMethod generalMethod=new GeneralMethod();
        generalMethod.closesignin();
        generalMethod.navigatetoFlights();
        generalMethod.selecttriptype("roundtrip");
        generalMethod.selectcabinType("ECONOMY");
        generalMethod.selectTravellers(1,0,0);
        generalMethod.selectOriginandDestination("MAA","DEL");
        generalMethod.selectthedateforroundtrip();
        generalMethod.selecttheFlight();
        generalMethod.selectFromDialogBox();
        generalMethod.FillContactDetails();
        generalMethod.filltravelerDetails();
        generalMethod.clickonNextPage();
        generalMethod.clickonSkipSeats();
        generalMethod.fillPayment();
    }

    @Test
    public void roundTripPremiumEconomy(){
        GeneralMethod generalMethod=new GeneralMethod();
        generalMethod.closesignin();
        generalMethod.navigatetoFlights();
        generalMethod.selecttriptype("roundtrip");
        generalMethod.selectcabinType("PREMIUM_ECONOMY");
        generalMethod.selectTravellers(1,0,0);
        generalMethod.selectOriginandDestination("MAA","DEL");
        generalMethod.selectthedateforroundtrip();
        generalMethod.selecttheFlight();
        generalMethod.selectFromDialogBox();
        generalMethod.FillContactDetails();
        generalMethod.filltravelerDetails();
        generalMethod.clickonNextPage();
        generalMethod.clickonSkipSeats();
        generalMethod.fillPayment();
    }

    @Test
    public void roundTripBusiness(){
        GeneralMethod generalMethod=new GeneralMethod();
        generalMethod.closesignin();
        generalMethod.navigatetoFlights();
        generalMethod.selecttriptype("roundtrip");
        generalMethod.selectcabinType("BUSINESS");
        generalMethod.selectTravellers(1,0,0);
        generalMethod.selectOriginandDestination("MAA","DEL");
        generalMethod.selectthedateforroundtrip();
        generalMethod.selecttheFlight();
        generalMethod.selectFromDialogBox();
        generalMethod.FillContactDetails();
        generalMethod.filltravelerDetails();
        generalMethod.clickonNextPage();
        generalMethod.clickonSkipSeats();
        generalMethod.fillPayment();
    }


    public void roundTripFirstClass(){
        GeneralMethod generalMethod=new GeneralMethod();
        generalMethod.closesignin();
        generalMethod.navigatetoFlights();
        generalMethod.selecttriptype("roundtrip");
        generalMethod.selectcabinType("FIRST");
        generalMethod.selectTravellers(1,0,0);
        generalMethod.selectOriginandDestination("MAA","DEL");
        generalMethod.selectthedateforroundtrip();
        generalMethod.selecttheFlight();
        generalMethod.selectFromDialogBox();
        generalMethod.FillContactDetails();
        generalMethod.filltravelerDetails();
        generalMethod.clickonNextPage();
        generalMethod.clickonSkipSeats();
        generalMethod.fillPayment();
    }





@BeforeMethod
    public void setup(){
    System.out.println("TestNG Listeners On Start #########################################################");
    String browserName="chrome";
    try {
        base.initializeDriver(browserName);
        base.initializeLogger(BookingDotComTests.class.getName());
    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    }
}

@AfterMethod
    public void teardown(){
        base.tearDownDriver();
}

}
