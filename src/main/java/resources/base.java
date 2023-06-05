package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
    public WebDriver driver;
    public Properties prop;
	@SuppressWarnings("deprecation")
	public WebDriver InitializeDriver() throws IOException 
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Ramendra Gupta\\eclipse-workspace\\Academy\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String BrowserName=System.getProperty("browser");
		
		
		if(BrowserName.equals("chrome"))
		{
			  driver= new ChromeDriver();
			  System.setProperty("webdriver.chrome.driver", "C:\\work\\chomedriver.exe");
		}
		
		if(BrowserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
			//use the system here
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
		
		
	}
	
	public void getScreenShotPath(String TestCaseName) 
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\reports\\"+TestCaseName+".png";
		FileUtils.copyFile(source,destination);
	}
}
