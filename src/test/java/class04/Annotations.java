package class04;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("I am before suit");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("I am after suit");
    }

}
