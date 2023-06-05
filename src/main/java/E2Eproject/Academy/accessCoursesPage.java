package E2Eproject.Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class accessCoursesPage {

	public WebDriver driver;
	By terms=By.xpath("//a[@href='/terms/']");
	
	public accessCoursesPage(WebDriver driver) {
		this.driver=driver;
	}

	public TermsAndUse Terms() 
	{
		driver.findElement(terms).click();
		TermsAndUse tnu=new TermsAndUse(driver);
		return tnu;
		
	}
}
