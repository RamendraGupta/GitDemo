package E2Eproject.Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class homepage extends base {
	public Logger log = LogManager.getLogger(base.class.getName());
	public WebDriver driver;

	@BeforeTest
	public void Initilizer() throws IOException {
		driver = InitializeDriver();
		log.info("The Driver is Initialized");

	}

	@Test
	public void basePageNavigation() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));
		landingPage lp=new landingPage(driver);
		accessCoursesPage acp=lp.GetAcces();
		TermsAndUse tnu=acp.Terms();
		
		log.info("We got access to the Landing page of Couses");

	}

	@AfterTest
	public void CloseBrowser() {
		driver.close();
		log.info("Browser Closed");
	}

	/*
	 * @DataProvider public void getData() { // Write the count above as for 2 test
	 * 2 , 2 output as 2 and while dicribring its location use the 0,1 concept for 2
	 * // Object[][] data =new Object[1][2]; data[0][0]="username1";
	 * data[0][1]="password1";
	 * 
	 * }
	 */
}
