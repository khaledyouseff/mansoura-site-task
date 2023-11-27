package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainPage {
    WebDriver driver;
    public mainPage(WebDriver driver){
        this.driver=driver;
    }
    public addQuestionPage clickAddQuestion(){
        driver.findElement(By.xpath("//*[@id=\"applications\"]/div")).click();
        return new addQuestionPage(driver);
    }
}
