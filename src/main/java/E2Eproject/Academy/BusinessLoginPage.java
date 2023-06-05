package E2Eproject.Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusinessLoginPage {
	public Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	By LoginButton=By.xpath("//a[@href='javascript:void(0);']");
	
	public BusinessLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	    this.driver=driver.;
	}

	public WebElement LoginIN() 
	{
		return driver.findElement(LoginButton);
	}
}
