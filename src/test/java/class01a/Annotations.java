package class01a;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
    @Test(enabled = false)
    public void Atest() {
        System.out.println("A");
    }

    @Test
    public void Btest() {
        System.out.println("B");
    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("Before");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("After");
    }
}



