package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.CommonMethods;

public class SoftAssertions extends CommonMethods {


    @BeforeMethod(alwaysRun = true)
    public void OpenBrowserAndNavigate() {

        openBrowserAndNavigateToURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login","chrome");
    }

    @AfterMethod(alwaysRun = true)
    public void quitBrowser() {
         driver.quit();
    }

    @Test(groups = "regression")
    public void verifyTheWelcomeMessage() {
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
       WebElement welcomeMsg= driver.findElement(By.id("welcome"));

//        verify is displayed
        boolean isDisplayed = welcomeMsg.isDisplayed();
        SoftAssert soft= new SoftAssert();
        soft.assertTrue(isDisplayed);

//        verify the message is welcome admin
        String actualWelcomeText = welcomeMsg.getText();
        String expectedWelcomeText="Welcome Admin";
        soft.assertEquals(actualWelcomeText,expectedWelcomeText);
        //  assert all the assertions that have been made
        soft.assertAll();

    }
}
