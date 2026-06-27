package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public void onStart(ITestContext context){
        ExtentSparkReporter spartReporter = new ExtentSparkReporter("test-output/ExecutionResults.html");
        spartReporter.config().setReportName("Final Project Suite");
        spartReporter.config().setDocumentTitle("Test Results");
        extent = new ExtentReports();
        extent.attachReporter(new ExtentObserver[]{spartReporter});
        extent.setSystemInfo("team1", "Mohamed Hafez\n**Marwan Mohamed\n**Rahma Osama");
        extent.setSystemInfo("Environment", "Production");
        extent.setSystemInfo("Browser", "Chrome");
    }

    public void onTestStart(ITestResult result){
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    public void onTestSuccess(ITestResult result){
        test.get().log(Status.PASS, "Test Passed Successfully");
    }

    public void onTestFailure(ITestResult result){
        test.get().log(Status.FAIL, "Test Failed");
        test.get().log(Status.FAIL, result.getThrowable());
    }

    public void onTestSkipped(ITestResult result){
        test.get().log(Status.SKIP, "Test Skipped");
    }

    public void onFinish(ITestContext context){
        extent.flush();
    }
}
