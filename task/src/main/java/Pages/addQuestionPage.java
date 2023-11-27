package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class addQuestionPage {
    WebDriver driver;

    public addQuestionPage(WebDriver driver) {
        this.driver = driver;
    }


    By requestMethod = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[1]/div/div/div/div[1]/div/div/div[1]/div[1]/div[1]");
    By getRequestMethodOption =By.xpath("//*[@id=\"list-item-199-0\"]/div/div");
    By requester = By.xpath("//*[@id=\"input-75\"]");
    By requesterOption = By.xpath("//*[@id=\"list-item-209-0\"]/div/div");
    By organization = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]");
    By organizationOption = By.xpath("//*[@id=\"list-item-233-0\"]/div/div");
    By department =By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[3]");
    By classification = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[5]/div/div/div[1]/div[1]/div[1]");
   // By questionDate = By.xpath("//*[@id=\"input-449\"]");
   // By questionTime = By.xpath("//*[@id=\"input-455\"]");
    By drug = By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div/div/div/form/div/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/input");
    By drugOption =By.xpath("/html/body/div[1]/div/div[7]/div/div[1]/div[2]/div");
    By questionTitle = By.xpath("/html/body/div[1]/div/div[1]/main/div/div/div[2]/div/div/div/form/div/div/div[3]/div/div/div[3]/div/div/div/div[1]/div[1]/input");
    By question = By.xpath("/html/body/div[1]/div/div[1]/main/div/div/div[2]/div/div/div/form/div/div/div[3]/div/div/div[4]/div/div/div/div[1]/div[1]/textarea");
    By save = By.xpath("/html/body/div[1]/div/div[1]/main/div/div/div[2]/div/div/div/div/div[1]/button");


//---------------------------------------------------------------
    //select from request method
//---------------------------------------------------------------

public void  requestMethod(){
    driver.findElement(requestMethod).click();
    driver.findElement(getRequestMethodOption).click();
    }


//---------------------------------------------------------------
    //select from requester
//---------------------------------------------------------------

    public void set3Letters(String letters){
    driver.findElement(requester).sendKeys(letters);
}
    public void  requester(){
        driver.findElement(requesterOption).click();
    }
//---------------------------------------------------------------
    //select from organization
//---------------------------------------------------------------
public void  organization(){
    driver.findElement(organization).click();
    driver.findElement(organizationOption).click();
}



//---------------------------------------------------------------
    //select from department
//---------------------------------------------------------------

    public void  department() {
        driver.findElement(department).click();
        // driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/div")).click();

    }
   public void selectDepartment(String optionText){
       driver.findElement(By.xpath("//div[text()='" + optionText + "']")).click();
   }


//---------------------------------------------------------------
    //select from Classification
//---------------------------------------------------------------
public void  Classification() {
    driver.findElement(classification).click();
   // driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div/div")).click();
}

    public void selectClassification(String optionText){
        driver.findElement(By.xpath("//div[text()='" + optionText + "']")).click();
    }




//---------------------------------------------------------------
    //select from drug
//---------------------------------------------------------------

    public void set1Letters(String letter){
        driver.findElement(drug).sendKeys(letter);
    }
    public void selectDrug(){
        driver.findElement(drugOption).click();
    }


//---------------------------------------------------------------
    //type into question title
//---------------------------------------------------------------


    public void setQuestionTitle(String title1) {
        driver.findElement(questionTitle).sendKeys(title1);
 }

//---------------------------------------------------------------
//type into question
//---------------------------------------------------------------


    public void setQuestion(String title2) {
        driver.findElement(question).sendKeys(title2);
    }


//---------------------------------------------------------------
//click save
//---------------------------------------------------------------

    public viewQuestionPage clickSave(){
    driver.findElement(save).click();
    return new viewQuestionPage(driver);
    }

//---------------------------------------------------------------
//scroll down
//---------------------------------------------------------------

public void scrollDown(){
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("scrollBy(0,500)");
}







}



