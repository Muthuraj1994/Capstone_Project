package stepDefinitions;

import base.GeneralMethod;
import io.cucumber.java.en.Given;
import org.testng.annotations.Test;

public class BookingStepDefinitions {

    GeneralMethod generalMethod=new GeneralMethod();
    @Given(": User uses the booking.com application as guest user")
    public void user_uses_the_booking_com_application_as_guest_user() {
        // Write code here that turns the phrase above into concrete actions
      generalMethod.closesignin();
    }
    @Given(": User Selects the Flights Section")
    public void user_selects_the_flights_section() {
        // Write code here that turns the phrase above into concrete actions
      generalMethod.navigatetoFlights();
    }
    @Given(": User Selects the travel type as {string}")
    public void user_selects_the_travel_type_as(String traveltype) {
        // Write code here that turns the phrase above into concrete actions
        generalMethod.selecttriptype(traveltype);
    }
    @Given(": User selects the cabintype as {string}")
    public void user_selects_the_cabintype_as(String cabintype) {
        // Write code here that turns the phrase above into concrete actions
       generalMethod.selectcabinType(cabintype);
    }

    @Given(": User enters the travelers Information {int} and  and {int}  age {int}")
    public void user_enters_the_travelers_information_and_and_age(Integer Adult, Integer Child, Integer Age) {
        generalMethod.selectTravellers(Adult,Child,Age);

    }

    @Given(": User select the date and clicks on search button")
    public void user_select_the_date_and_clicks_on_search_button() {
       generalMethod.selectthedate();
    }

    @Given(": Users selects Origin {string} and Destination {string}")
    public void users_selects_origin_and_destination(String origin, String destination) {
        // Write code here that turns the phrase above into concrete actions
       generalMethod.selectOriginandDestination(origin,destination);
    }




}
