package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    public  HomePage(){
        PageFactory.initElements(driver, this);
    }

@FindBy(xpath = "//input[@type='email']")
private  WebElement ContailEmail;


    @FindBy(xpath = "//input[@type='tel']")
    private  WebElement phonenumber;

    @FindBy(xpath = "//*[@autocomplete='given-name']")
    private  WebElement firstname;

    @FindBy(xpath = "//*[@autocomplete='family-name']")
    private  WebElement LastName;

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

    public WebElement getOrigindestinationtextbox() {
        return origindestinationtextbox;
    }

    @FindBy(xpath = "(//select[@autocomplete='sex']//child::option//following-sibling::option)[2]")
    private  WebElement Selecting_the_gender_of_passenger;

    @FindBy(xpath = "//button[@type='button']//span[text()='Next']")
    private  WebElement Click_Next_Passenger_Detail_page;
    @FindBy(xpath = "//*[contains(@role,'dialog')]")
            private WebElement dialogbox;



    @FindBy(xpath = "//a[@id='flights']")
    private WebElement flights;

    public WebElement getFlights() {
        return flights;
    }

    public WebElement getDialogbox() {
        return dialogbox;
    }


    @FindBy(xpath ="//div[text()='Round-trip']" )
    private WebElement Round_trip;

    @FindBy(xpath ="//div[text()='One-way']" )
    private WebElement One_way;

    @FindBy(xpath ="//div[text()='Multi-city']" )
    private WebElement Multi_city;

    @FindBy(xpath = "//select[@title='Cabin class']")
    private WebElement cabinClass;



    @FindBy(xpath = "//span[text()='1 adult']")
    private WebElement selecttravelers;

    @FindBy(xpath = "(//div[@class='css-6yc6o0']//child::div//child::div//child::div//child::div//following-sibling::div//child::button//following-sibling::button)[1]")
    private WebElement addadult;

    @FindBy(xpath = "(//div[@class='css-6yc6o0']//child::div//child::div//child::div//child::div//following-sibling::div//child::button//following-sibling::button)[2]")
    private WebElement addchild;

    @FindBy(xpath = "//button[@data-ui-name='button_occupancy_action_bar_done']")
    private WebElement travelerdone;

    @FindBy(xpath="//input[@placeholder='Airport or city']")
    private WebElement origindestinationtextbox;

    @FindBy(xpath = "(//li[@data-ui-name='locations_list_item'])[1]//span//input")
    private WebElement checkbox;

    @FindBy(xpath = "(//li[@data-ui-name='locations_list_item'])[1]")
    private WebElement originfirstOption;

    public WebElement getOriginfirstOption() {
        return originfirstOption;
    }

    public WebElement getOriginDestinationtextbox() {
        return origindestinationtextbox;
    }

    public WebElement getCheckbox() {
        return checkbox;
    }

    public WebElement getDestination() {
        return Destination;
    }

    public WebElement getAddadult() {
        return addadult;
    }

    public WebElement getAddchild() {
        return addchild;
    }

    public WebElement getTravelerdone() {
        return travelerdone;
    }

    public WebElement getChildage() {
        return childage;
    }

    @FindBy(xpath = "//select[@class='InputSelect-module__field___wEAQl']")
    private WebElement childage;

    public WebElement getSelecttravelers() {
        return selecttravelers;
    }

    public WebElement getCabinClass() {
        return cabinClass;
    }




    public WebElement getOne_way() {
        return One_way;
    }

    public WebElement getMulti_city() {
        return Multi_city;
    }

    @FindBy(xpath = "//button[@type='button'  and contains(@data-ui-name,'input_location_from')]")
    private WebElement Origin;


    @FindBy(xpath = "//button[@type='button'  and contains(@data-ui-name,'input_location_to')]")
    private WebElement Destination;


    @FindBy(xpath = "//button[@type='button' and contains(@data-ui-name,'button_date')]")
    private WebElement Date_Picker;


    @FindBy(xpath = "(//table[@role='grid' and contains(@class,'Calendar')])[1]")
    private WebElement Select_the_date;


    @FindBy(xpath = "(//table[@role='grid' and contains(@class,'Calendar')])[2]")
    private WebElement Reaching_date;


    @FindBy(xpath = "//button[@data-ui-name='button_search_submit']")
    private WebElement Search_button;

    @FindBy(xpath = "//select[contains(@title,'Cabin class')] ")
    private WebElement Select_class;

    @FindBy(xpath = "(//button[contains(@type,'button')])[4]")
    private WebElement adults;

    public WebElement getOrigin() {
        return Origin;
    }

    public WebElement getdestination() {
        return Destination;
    }

    public WebElement getDate_Picker() {
        return Date_Picker;
    }

    public WebElement getSelect_the_date() {
        return Select_the_date;
    }

    public WebElement getReaching_date() {
        return Reaching_date;
    }

    public WebElement getSearch_button() {
        return Search_button;
    }

    public WebElement getSelect_class() {
        return Select_class;
    }

    public WebElement getAdults() {
        return adults;
    }

    public WebElement getRound_trip() {
        return Round_trip;
    }
}
