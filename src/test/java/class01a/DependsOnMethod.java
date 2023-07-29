package class01a;

import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test
    public void Login(){
        System.out.println("I am login page");
    }
    @Test(dependsOnMethods ={"Login"} )
    public void dashBoardPage(){
        System.out.println("I am dashboard page");
    }
}
