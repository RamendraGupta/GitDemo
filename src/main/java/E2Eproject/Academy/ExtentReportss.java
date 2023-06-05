package E2Eproject.Academy;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportss {

	static ExtentReports extent;
	@BeforeTest
	public static ExtentReports ExtentReportsGenerate() 
	{
		String pathoffile=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(pathoffile);
		reporter.config().setReportName("Web Automation");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ramendra Gupta");
		return extent;
	}
	
	
}
