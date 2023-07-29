package class03;

import org.testng.annotations.*;

public class Annotations2 {
    @BeforeClass
    public  void beforeClass(){
        System.out.println("I am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }
    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("I am after method");
    }
    @Test
    public void AFirstTestCase(){
        System.out.println("i am the first test case");
    }

    @Test
    public void BSecondTestCase(){
        System.out.println("i am second test case");
    }

    @Test
    public  void ThirdTestCase(){
        System.out.println("i am third test case");
    }
}
