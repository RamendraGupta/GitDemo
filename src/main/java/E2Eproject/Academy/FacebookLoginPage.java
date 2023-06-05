package E2Eproject.Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {
   public WebDriver driver;
   By Emailid=By.xpath("//input[@name='email']");
   By Password=By.id("pass");
   By LoginButoon=By.name("login");
   
   public FacebookLoginPage(WebDriver driver) 
   {
	   this.driver=driver;
   }
   
   public WebElement emailid() 
   {
	   return driver.findElement(Emailid);
   }
   
   public WebElement password() 
   {
	   return driver.findElement(Password);
   }
   
   public WebElement LoginButton()
   {
	   return driver.findElement(LoginButoon);
   }
}
