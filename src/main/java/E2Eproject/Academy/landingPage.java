package E2Eproject.Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {

	public WebDriver driver;
	By Accesscourceslink=By.linkText("Access all our Courses");
	By Text=By.className("ud-heading-serif-xxxl");
	
	
	public landingPage(WebDriver driver) {
	this.driver=driver;
	}

	 public accessCoursesPage GetAcces() 
	    {
	    	driver.findElement(Accesscourceslink).click();
	    	accessCoursesPage acp=new accessCoursesPage(driver);
	    	return acp;
	    }
	 
	 public WebElement text() 
	    {
	    	return driver.findElement(Text);
	    }
}
