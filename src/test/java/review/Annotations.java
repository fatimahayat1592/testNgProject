package review;

import org.testng.annotations.*;

public class Annotations {
    @BeforeClass
    public void beforeClass(){
        System.out.println("i am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("i am after");
    }


    @Test
    public void testA(){
        System.out.println("I am test");
    }
    @Test
    public void testB(){
        System.out.println("I am test B");
    }


}
