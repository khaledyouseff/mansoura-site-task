package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logInPage {

    private final WebDriver driver;

    public logInPage(WebDriver driver){
    this.driver=driver;
}
By username =By.id("input-12");
By password =By.id("input-17");
By login =By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div/form/div[2]/button[1]");
public void setUserName(String userName){
        driver.findElement(username).sendKeys(userName);
}
public void setPassWord(String passWord){
    driver.findElement(password).sendKeys(passWord);
}
public welcomePage clickLogIn(){
    driver.findElement(login).click();
    return new welcomePage(driver);
}
}
