package logInTest;
import Pages.logInPage;
import Pages.welcomePage;
import baseTest.baseTest;

import org.testng.annotations.Test;

public class logInTest  extends baseTest{
    @Test
public void successfulLoginTest(){
        logInPage logInPage = new logInPage(driver);
        logInPage.setUserName("KhalidYusf");
        logInPage.setPassWord("KhalidYusf@123");
        welcomePage welcomePage= logInPage.clickLogIn();
    }
}
