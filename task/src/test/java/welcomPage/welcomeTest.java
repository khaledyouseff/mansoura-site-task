package welcomPage;
import Pages.logInPage;
import Pages.welcomePage;
import baseTest.baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class welcomeTest extends baseTest {

    @Test
    public void accessQuestionPage() throws InterruptedException {


        Pages.logInPage logInPage = new logInPage(driver);
        logInPage.setUserName("KhalidYusf");
        logInPage.setPassWord("KhalidYusf@123");
        welcomePage welcomePage= logInPage.clickLogIn();
       Thread.sleep(2000);


        welcomePage.clickQuestionDataIcon();
    }

}

