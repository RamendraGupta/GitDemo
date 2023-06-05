package E2Eproject.Academy;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.base;

public class Listeners extends base implements ITestListener {
	ExtentTest test;
	ExtentReports extent=ExtentReportss.ExtentReportsGenerate();
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		extent.flush();
	}

	@SuppressWarnings("unused")
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
		test=extent.createTest(((ITestResult) result).getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.fail(result.getThrowable());
		String TestMethodName=result.getMethod().getMethodName();
		getScreenShotPath(TestMethodName);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Test Passed");
	}

}
