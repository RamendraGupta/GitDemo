package E2Eproject.Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class udemyBusiness {

	public WebDriver driver;
	By udemyBusinessxpath=By.linkText("Udemy Business");
    
    

	public udemyBusiness(WebDriver driver) {
		// TODO Auto-generated constructor stub
	    this.driver=driver;
	}

	public WebElement BusinessPage() 
    {
    	return driver.findElement(udemyBusinessxpath);
    }
}
