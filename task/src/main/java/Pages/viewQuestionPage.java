package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class viewQuestionPage {
    WebDriver driver;
    public viewQuestionPage(WebDriver driver){
        this.driver=driver;
    }
    By text = By.xpath("//*[contains(text(), 'a question about a drug')]");
    By text1 = By.cssSelector("div.col-sm-8 col-md-10 col-lg-10 col");
    By text2 = By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/span");
    public String getAlertMessage() {
        return driver.findElement(text2).getText();

    }


}
