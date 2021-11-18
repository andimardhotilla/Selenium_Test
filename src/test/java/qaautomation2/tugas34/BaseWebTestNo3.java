package qaautomation2.tugas34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWebTestNo3{
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	@BeforeMethod
	public void createChromeDriver() {	
		WebDriverManager.chromedriver().setup();
		driver.set (new ChromeDriver());
		driver.get().get("https://yopmail.com/en/");
		driver.get().manage().window().maximize();		
	}
	
	@AfterMethod
	public void quitChromeDriver() {
		driver.get().quit();
	}
	

}
