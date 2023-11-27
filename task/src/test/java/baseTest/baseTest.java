package baseTest;

import Pages.addQuestionPage;
import Pages.logInPage;
import Pages.mainPage;
import Pages.welcomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class baseTest {
protected WebDriver driver;
protected mainPage mainPage = new mainPage(driver) ;
protected logInPage logInPage = new logInPage(driver);
protected welcomePage welcomePage = new welcomePage(driver);
 protected addQuestionPage addQuestionPage = new addQuestionPage(driver);
@BeforeClass
    public void setup(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://drugstest.mans.edu.eg/");
    logInPage=new logInPage(driver);
    mainPage = new mainPage(driver);
    welcomePage = new welcomePage(driver);
   addQuestionPage=new addQuestionPage(driver);

}

}
