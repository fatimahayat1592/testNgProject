package review;

import org.testng.annotations.Test;

public class EnableDisable {
    @Test(enabled = false)
    public void hello(){
        System.out.println("hellooooo");
    }
    @Test
    public void funcA(){
        System.out.println(5/1);
    }
    @Test(dependsOnMethods = "funcA")
    public void funcB(){
        System.out.println("I am dependent on A");
    }
}
