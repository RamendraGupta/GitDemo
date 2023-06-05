package E2Eproject.Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import resources.base;

public class PageValidiator extends base {
public Logger log=LogManager.getLogger(base.class.getName());
public WebDriver driver;
	@BeforeTest
	public void Initilizer() throws IOException 
	{
		log.info("The Driver is Initialized");
		driver=InitializeDriver();
	}
	@Test
	public void basePageNavigation() throws IOException, InterruptedException 
	{
		
		driver.get(prop.getProperty("url"));
		landingPage l=new landingPage(driver);
		l.GetAcces().click();
		Assert.assertEquals(l.text().getText(), "QA Click Academy");
		log.info("Text Form the Website Validiated");
		
	}
	
	@AfterTest
	public void CloseBrowser() 
	{
		driver.close();
		log.info("Browser Closed");
	}
	}
