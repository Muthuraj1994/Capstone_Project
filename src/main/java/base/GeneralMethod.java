package base;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class GeneralMethod extends Base {
    HomePage homePage = new HomePage();
    FlightSelectionPage flightSelectionPage = new FlightSelectionPage();
    TravellerDetailPage travellerDetailPage = new TravellerDetailPage();
    SeatsPage seatsPage = new SeatsPage();

    PaymentPage paymentPage = new PaymentPage();

    public void closesignin() {
        try {
            // Thread.sleep(10000);
            homePage.getDialogbox().findElement(By.xpath("//button[contains(@aria-label,'Dismiss') and @type='button']")).click();
            logger.info("Clicked on the pop up");
        } catch (Exception e) {
            logger.info("No PopUp Found");
        }

    }

    public void navigatetoFlights() {
        homePage.getFlights().click();
    }

    public void selecttriptype(String type) {
        if (type.contains("round")) {
            homePage.getRound_trip().click();
        } else if (type.contains("multi")) {
            homePage.getMulti_city().click();
        } else {
            homePage.getOne_way().click();

        }
    }

    public void selectcabinType(String cabintype) {
        Select cabinclass = new Select(homePage.getCabinClass());
        cabinclass.selectByValue(cabintype);
    }

    public void selectTravellers(int adult, int child, int age) {
        homePage.getSelecttravelers().click();
        for (int i = 1; i < adult; i++) {
            homePage.getAddadult().click();
        }
        if (child > 0) {
            for (int i = 0; i < child; i++) {
                homePage.getAddchild().click();
                homePage.getChildage().sendKeys(age + "");
            }

            homePage.getTravelerdone().click();
        } else homePage.getTravelerdone().click();
    }

    public void selectOriginandDestination(String origin, String destination) {
        homePage.getOrigin().click();
        homePage.getOriginDestinationtextbox().sendKeys(origin);
        if (homePage.getCheckbox().isSelected()) {
            logger.info("The option is already selected");
        } else {
            homePage.getOriginfirstOption().click();
        }


        homePage.getdestination().click();
        homePage.getOriginDestinationtextbox().sendKeys(destination);
        if (homePage.getCheckbox().isSelected()) {
            logger.info("The option is already selected");
        } else {
            homePage.getOriginfirstOption().click();
        }
    }

    public void selectthedate() {
        homePage.getDate_Picker().click();
        homePage.getSelect_the_date().click();
        homePage.getSearch_button().click();
    }

    public void selectthedateforroundtrip() {
        homePage.getDate_Picker().click();
        homePage.getSelect_the_date().click();
        homePage.getSelect_the_second_date().click();
        homePage.getSearch_button().click();
    }

    public void selecttheFlight() {
        flightSelectionPage.getSelectFlight().click();
    }

    public void selectFromDialogBox() {
        flightSelectionPage.getDialogBox().findElement(By.xpath("//button[@type='button']//span[text()='Select']")).click();
    }

    public void FillContactDetails() {
        String email = RandomStringUtils.random(6, true, true) + "@gmail.com";
        String phone = "9" + RandomStringUtils.random(9, false, true);
        travellerDetailPage.getClick_Next_Passenger_Detail_page().click();
        travellerDetailPage.getContailEmail().sendKeys(email);
        travellerDetailPage.getPhonenumber().sendKeys(phone);
    }

    public void filltravelerDetails() {
        String firstName = RandomStringUtils.random(6, true, false);
        String lastName = RandomStringUtils.random(6, true, false);
        travellerDetailPage.getFirstname().sendKeys(firstName);
        travellerDetailPage.getLastName().sendKeys(lastName);
        homePage.getSelecting_the_gender_of_passenger().click();
        //  Select select=new Select(travellerDetailPage.getSelecting_the_gender_of_passenger());
        //  select.selectByValue("male");
    }

    public void clickonNextPage() {
        travellerDetailPage.getClick_Next_Passenger_Detail_page().click();
    }

    public void clickonSkipSeats() {
        SeatsPage seatsPage1=new SeatsPage();
        try {
            seatsPage1.getClick_Next_Passenger_Detail_pagee().click();

        }catch (StaleElementReferenceException Stale){
            logger.info("Stale Element Exception Occured");
        }catch (Exception e){
            logger.info("Selection of seats screen has not displayed");
        }

        try{
            seatsPage1.getSkipbutton().click();
        }catch (StaleElementReferenceException Stale){
            logger.info("Stale Element Exception Occured");
        }catch (Exception e){
            logger.info("Selection of seats screen has not displayed");
        }

        try {

            seatsPage1.getClick_Next_Passenger_Detail_pagee().click();

        }catch (StaleElementReferenceException Stale){
            logger.info("Stale Element Exception Occured");
        }catch (Exception e){
            logger.info("Selection of seats screen has not displayed");
        }

    }


    public void fillPayment() {

        WebElement element=paymentPage.getBack();

        JavascriptExecutor je = (JavascriptExecutor) driver;

        je.executeScript("arguments[0].scrollIntoView(true);",element);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Payment']")));
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }
        paymentPage.Card_Holders_Nam().clear();
        paymentPage.Card_Holders_Nam().sendKeys("MuthuRaja");
        paymentPage.Card_Number().sendKeys("4433636363636366");
        paymentPage.getExpiration_Date().sendKeys("01/26");
        paymentPage.getCvc_Number().sendKeys("123");
    }

}