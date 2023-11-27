package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcomePage {
     WebDriver driver;
    public welcomePage(WebDriver driver){
        this.driver=driver;
    }

public mainPage clickQuestionDataIcon(){
        driver.findElement(By.xpath("//*[@id=\"subsystems\"]/div/div/div/div[2]")).click();
        return new mainPage(driver);
}

}
