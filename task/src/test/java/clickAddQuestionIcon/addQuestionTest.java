package clickAddQuestionIcon;

import Pages.logInPage;
import Pages.welcomePage;
import baseTest.baseTest;
import org.testng.annotations.Test;

public class addQuestionTest extends baseTest {
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
    }
}
