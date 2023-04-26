package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends Base {


    public static void getdriver(){

    }

    public  HomePage(){
        PageFactory.initElements(driver, this);
    }


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


    @FindBy(xpath = "//span[contains(@data-date,'2023-05-28')]")
    private WebElement Select_the_date;


    @FindBy(xpath = "//span[contains(@data-date,'2023-06-01')]")
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
