package E2Eproject.Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UdemyClick {

	public WebDriver driver;
	By UdemyClickhere=By.xpath("//a[@href='http://www.udemy.com/']");
	
	public UdemyClick(WebDriver driver) {
		// TODO Auto-generated constructor stub
	    this.driver=driver;
	}

	public WebElement Clickhere() 
	{
		return driver.findElement(UdemyClickhere);
	}
	
	
}
