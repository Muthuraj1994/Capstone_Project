package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeatsPage extends Base{

    SeatsPage(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@type='button']//span[text()='Skip']")
    private WebElement skipbutton;

    public WebElement getSkipbutton() {
        return skipbutton;
    }
}
