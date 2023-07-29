package review;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class AbracadabraListener implements ITestListener {
    public void onTestSuccess(ITestResult result) {
        System.out.println("test success "+result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("test failed "+result.getName());
    }
}
