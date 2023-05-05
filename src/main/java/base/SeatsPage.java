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

    @FindBy(xpath = "//button[@type='button']//span[text()='Next']")
    private  WebElement Click_Next_Passenger_Detail_page;

    public WebElement getClick_Next_Passenger_Detail_pagee() {
        return Click_Next_Passenger_Detail_page;
    }
}
