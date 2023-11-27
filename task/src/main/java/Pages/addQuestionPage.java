package Pages;

import org.openqa.selenium.By;
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

    By requestMethod = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[1]/div/div/div/div[1]/div/div/div[1]");
    By requester = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[1]/div/div/div/div[3]/div/div/div[1]");
    By organization = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]");
    By department = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[3]/div/div/div[1]/div[1]/div[1]");
    By classification = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[5]/div/div/div[1]/div[1]/div[1]");
    By questionDate = By.xpath("//*[@id=\"input-449\"]");
    By questionTime = By.xpath("//*[@id=\"input-455\"]");
    By drug = By.id("input-472");
    By questionTitle = By.id("input-488");
    By question = By.id("input-492");
    By diagnose = By.id("input-931");


//---------------------------------------------------------------
    //select from request method
//---------------------------------------------------------------

public void  requestMethod(){
    driver.findElement(By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[1]/div/div/div/div[1]/div/div/div[1]/div[1]/div[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"list-item-199-0\"]/div/div")).click();
    }


//---------------------------------------------------------------
    //select from requester
//---------------------------------------------------------------

    public void set3Letters(String letters){
    driver.findElement(By.xpath("//*[@id=\"input-75\"]")).sendKeys(letters);
}
    public void  requester(){
        driver.findElement(By.xpath("//*[@id=\"list-item-209-0\"]/div/div")).click();
    }
//---------------------------------------------------------------
    //select from organization
//---------------------------------------------------------------

    public void findOrganizationDropdown() {
        driver.findElement(organization);
    }

    private Select findOrganization() {
        return new Select (driver.findElement(organization));
    }

    public void selectOrganization(String option3){
        findOrganization().selectByVisibleText(option3);
    }
    public List<String> getSelectedOrganization(){
        List<WebElement> selectedElement=
                findOrganization().getAllSelectedOptions();
        return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());

    }
//---------------------------------------------------------------
    //select from department
//---------------------------------------------------------------

    public void findDepartmentDropdown() {
        driver.findElement(department);
    }

    private Select findDepartment() {
        return new Select (driver.findElement(department));
    }

    public void selectDepartment(String option4){
        findDepartment().selectByVisibleText(option4);
    }
    public List<String> getSelectedDepartment(){
        List<WebElement> selectedElement=
                findDepartment().getAllSelectedOptions();
        return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());

    }
//---------------------------------------------------------------
    //select from Classification
//---------------------------------------------------------------

    public void findClassificationDropdown() {
        driver.findElement(classification);
    }

    private Select findClassification() {
        return new Select (driver.findElement(classification));
    }

    public void selectClassification(String option5){
        findClassification().selectByVisibleText(option5);
    }
    public List<String> getSelectedClassification(){
        List<WebElement> selectedElement=
                findClassification().getAllSelectedOptions();
        return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());

    }
//---------------------------------------------------------------
    //select Question date
//---------------------------------------------------------------
public void clickQuestionDate(){
        driver.findElement(questionDate).click();
}
public void clickDay(){
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/div[2]/table/tbody/tr[1]/td[5]/button")).click();

}

//---------------------------------------------------------------
    //select question time
//---------------------------------------------------------------
public void clickTime(){
        driver.findElement(questionTime).click();
}
public void chooseHour(){
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div[2]/div/div/div/span[2]")).click();
}

//---------------------------------------------------------------
    //select from drug
//---------------------------------------------------------------

    public void findDrugDropdown() {
        driver.findElement(drug);
    }

    public void set1letters(String letter) {
        driver.findElement(drug).sendKeys(letter);
    }

    private Select findDrug() {
        return new Select(driver.findElement(requester));
    }

    public void selectDrug(String option6){
        findDrug().selectByVisibleText(option6);
    }
    public List<String> getSelectedDrug(){
        List<WebElement> selectedElement=
                findDrug().getAllSelectedOptions();
        return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());

    }
public void clickBlank(){
        driver.findElement(By.xpath("//*[@id=\"AppsContent\"]/div")).click();
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
//type into question
//---------------------------------------------------------------


    public void setDiagnose(String Diagnose) {
        driver.findElement(diagnose).sendKeys(Diagnose);
    }











}



