package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends Base{

    PaymentPage(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@type='text' and contains(@name,'name')]")
    private WebElement eCard_Holders_Nam;

    public WebElement Card_Holders_Nam() {

        return eCard_Holders_Nam;
    }


    @FindBy(xpath = "//input[@type='text' and contains(@name,'number')]")
    private WebElement Card_Number;

    public WebElement Card_Number() {

        return Card_Number;
    }

    @FindBy(xpath = "//input[@type='text' and contains(@name,'expirationDate')]")
    private WebElement Expiration_Date;

    public WebElement getExpiration_Date() {
        return Expiration_Date;
    }

    public WebElement getCvc_Number() {
        return Cvc_Number;
    }

    @FindBy(xpath = "//input[@type='text' and contains(@name,'cvc')]")
    private  WebElement Cvc_Number;





}
