package AddQuestionTest;
import Pages.addQuestionPage;
import Pages.viewQuestionPage;
import Pages.logInPage;
import baseTest.baseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class addQuestionTest extends baseTest{
    @Test
    public void accessQuestionPage() throws InterruptedException {

//login
        Pages.logInPage logInPage = new logInPage(driver);
        logInPage.setUserName("KhalidYusf");
        logInPage.setPassWord("KhalidYusf@123");
        Pages.welcomePage welcomePage= logInPage.clickLogIn();
        Thread.sleep(2000);

//click question data
        welcomePage.clickQuestionDataIcon();
        Thread.sleep(2000);

//click add question
        mainPage.clickAddQuestion();

// add question data

        addQuestionPage.requestMethod();
        addQuestionPage.set3Letters("احم");
        Thread.sleep(2000);
        addQuestionPage.requester();
        addQuestionPage.organization();
        Thread.sleep(2000);
        addQuestionPage.department();
        addQuestionPage.selectDepartment("Emergency surgery unit");
        addQuestionPage.Classification();
        addQuestionPage.selectClassification("اتاحية الأدوية");
        addQuestionPage.set1Letters("n");
        Thread.sleep(7000);
        addQuestionPage.selectDrug();
        Thread.sleep(2000);
        //addQuestionPage.clickBlank();
        addQuestionPage.scrollDown();
        addQuestionPage.setQuestionTitle("a question about a drug");
        addQuestionPage.setQuestion("what is the effect of this drug");
        addQuestionPage.scrollDown();
        viewQuestionPage v = addQuestionPage.clickSave();
        Thread.sleep(4000);
        //Assert.assertTrue(v.getAlertMessage().contains("a question about a drug"));
       assertEquals(v.getAlertMessage() , "a question about a drug","you are redirected to wrong page");


    }






}
