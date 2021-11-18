package qaautomation2.tugas34;

import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTesNo4{
	
	@Test
	public void tessequence() {
	String asal = "Jakarta";
	String tujuan = "Tokyo";
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body")).click();
	driver.findElement(By.xpath("//span[normalize-space()='From']")).click();
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(asal);
	utils.Utility.hardWait(5);
	driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
	driver.findElement(By.xpath("//span[normalize-space()='To']")).click();
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(tujuan);
	utils.Utility.hardWait(5);
	driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-1']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
	
	By harga = By.xpath("//body/div[@id='root']/div/div/div[@class='flightBody']/div[@class='flightsContainer makeFlex spaceBetween']/div[contains(@class,'listingLhs')]/div[@class='filterWrapper']/div[2]");
	WebElement isi = driver.findElement(harga);
    System.out.println("Based on the booking's type, the top or the cheapest and the most expensive filght's price are" 
	+ isi.getText());
    
    driver.quit();
	}
	
}
