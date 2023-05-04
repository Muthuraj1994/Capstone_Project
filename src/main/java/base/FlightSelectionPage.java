package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSelectionPage extends Base{

    public  FlightSelectionPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button//span[text()='See flight']")
    private WebElement selectFlight;

    public WebElement getSelectFlight() {
        return selectFlight;
    }

    @FindBy(xpath = "//*[@role='dialog']")
    private WebElement dialogBox;

    public WebElement getDialogBox() {
        return dialogBox;
    }


}
