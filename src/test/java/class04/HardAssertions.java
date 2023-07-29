package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class HardAssertions extends CommonMethods {


    @BeforeMethod(alwaysRun = true)
    public void OpenBrowserAndNavigate() {

        openBrowserAndNavigateToURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login","chrome");
    }

    @AfterMethod(alwaysRun = true)
    public void quitBrowser() {
       driver.quit();
   }

    @Test(groups = "smoke")
    public void verifyTheErrorMessage() {
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("abracadabra");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
       WebElement errorMsg= driver.findElement(By.id("spanMessage"));
       String actualErrorMessage=errorMsg.getText();
       String exceptedErrorMessage="Invalid credentials";
        Assert.assertEquals(actualErrorMessage,exceptedErrorMessage);
        boolean errorMsgIsDisplayed=errorMsg.isDisplayed();
        Assert.assertTrue(errorMsgIsDisplayed);
    }
}
