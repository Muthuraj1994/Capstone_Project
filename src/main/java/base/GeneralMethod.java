package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GeneralMethod extends Base{
HomePage homePage=new HomePage();
    public void closesignin(){
        try{
            homePage.getDialogbox().findElement(By.xpath("(//button[contains(@type,'button')])[39]")).click();
            logger.info("Clicked on the pop up");
        }catch (Exception e){
            logger.info("No PopUp Found");
        }

    }
    public void navigatetoFlights(){
        homePage.getFlights().click();
    }

    public void selecttriptype(String type){
        if(type.contains("round")){
            homePage.getRound_trip().click();
        }else if(type.contains("multi")){
            homePage.getMulti_city().click();
        }else {
            homePage.getOne_way().click();

        }
    }

    public void selectcabinType(String cabintype){
        Select cabinclass=new Select(homePage.getCabinClass());
        cabinclass.selectByValue(cabintype);
    }

    public void selectTravellers(int adult,int child , int age){
        homePage.getSelecttravelers().click();
        for(int i=1;i<adult;i++){
            homePage.getAddadult().click();
        }
        if(child>0){
            for(int i=0;i<child;i++){
                homePage.getAddchild().click();
                homePage.getChildage().sendKeys(age+"");
            }

            homePage.getTravelerdone().click();
        }else homePage.getTravelerdone().click();
    }

    public void selectOriginandDestination(String origin,String destination){
        homePage.getOrigin().sendKeys(origin);
        homePage.getdestination().sendKeys(destination);
    }

    public void selectthedate(){
        homePage.getDate_Picker().click();
        homePage.getSelect_the_date().click();
        homePage.getSearch_button().click();
        /*
        Date date  = new Date(27);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
    String d = simpleDateFormat.format(date);
   String s[] = d.split(" ");
   String month_year = s[27];
   String day = s[2];

   System.out.println(month_year);
        System.out.println(day);
*/


    }
}
