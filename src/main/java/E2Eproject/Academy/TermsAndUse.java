package E2Eproject.Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TermsAndUse {

	public WebDriver driver;
	By ContactUs=By.linkText("12. How to Contact Us");
	
	public TermsAndUse(WebDriver driver) {
		// TODO Auto-generated constructor stub
	    this.driver=driver;
	}

	public landingPage contactus() 
	{
	    driver.findElement(ContactUs).click();
	    
	}
}
