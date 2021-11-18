package qaautomation2.tugas34;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumTestNo3 extends BaseWebTestNo3{
	
	@Test
	public void testdalamiframe() {
		String email = "automationtest";
		driver.get().findElement(By.xpath("//input[@id='login']")).sendKeys(email);
		driver.get().findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();
		driver.get().switchTo().frame("ifmail");
//		Karena ketentuan tugas untuk ekstrak dari email yang paling pertama (yang langsung muncul saat iframe di buka),
//		maka dapat langsung dipilih xpath-nya jadi "//body" untuk isinya
		WebElement body = driver.get().findElement(By.xpath("//body"));
		String isi = body.getText();
	    System.out.println("Element identified with xpath: " + isi);
	}	
}
