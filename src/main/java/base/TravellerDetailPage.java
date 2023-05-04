package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravellerDetailPage extends Base{


    TravellerDetailPage(){

        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@type='email']")
    private WebElement ContailEmail;

    @FindBy(xpath = "//input[@type='tel']")
    private  WebElement phonenumber;

    @FindBy(xpath = "//*[@autocomplete='given-name']")
    private  WebElement firstname;

    public WebElement getContailEmail() {
        return ContailEmail;
    }

    public WebElement getPhonenumber() {
        return phonenumber;
    }

    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getLastName() {
        return LastName;
    }

    public WebElement getSelecting_the_gender_of_passenger() {
        return Selecting_the_gender_of_passenger;
    }

    public WebElement getClick_Next_Passenger_Detail_page() {
        return Click_Next_Passenger_Detail_page;
    }

    @FindBy(xpath = "//*[@autocomplete='family-name']")
    private  WebElement LastName;


    @FindBy(xpath = "//select[@autocomplete='sex']")
    private  WebElement Selecting_the_gender_of_passenger;

    @FindBy(xpath = "//button[@type='button']//span[text()='Next']")
    private  WebElement Click_Next_Passenger_Detail_page;




}
