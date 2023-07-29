package review;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
    //your test case going to same
    //but data that you will be using is doing to different
    @DataProvider(name="myData")
    public Object[][] data() {
        Object[][] randomData = {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"1", "2", "3"},
                {"4", "g", "6"}
        };
        return randomData;
    }
        @Test(dataProvider = "myData")
                public void randomTest(String inputA,String inputB,String inputC){
            System.out.println(inputA);
            System.out.println(inputB);
            System.out.println(inputC);
    }
}
