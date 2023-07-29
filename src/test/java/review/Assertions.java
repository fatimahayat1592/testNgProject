package review;

import class02.SoftAssertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
    @Test
    public void hardAssert(){
        String actualName="Fatima";
        String actualDesignation="Teacher";
        Assert.assertEquals(actualName,"Fatima");
        System.out.println("hello i am here");
        Assert.assertEquals(actualDesignation,"Teacher");

    }
    @Test
    public void softAssert(){
        //i am getting this info from webelement on website
        String actualName="Fatima";
        String actualDesignation="Teacher";
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(actualName,"fat");
        System.out.println("hello here");
        soft.assertEquals(actualDesignation,"Teacher");
        soft.assertAll();
    }
}
