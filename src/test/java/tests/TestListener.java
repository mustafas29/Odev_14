package tests;

import com.codeborne.selenide.Selenide;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("TEST STARTED --> " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("TEST PASSED --> " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("TEST FAILED --> " + result.getName());

        // Screenshot
        String screenshot = Selenide.screenshot("FAILED_" + result.getName());
        System.out.println("Screenshot saved: " + screenshot);
    }
    
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("TEST SKIPPED --> " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Bu metod genellikle boş bırakılır
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("=== TEST EXECUTION STARTED ===");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("=== ALL TESTS FINISHED ===");
    }
}
