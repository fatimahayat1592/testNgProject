package review;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Annotations3 {
    @BeforeTest
    public void bTest(){
        System.out.println("i am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }
}
