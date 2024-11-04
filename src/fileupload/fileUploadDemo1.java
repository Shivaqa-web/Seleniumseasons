package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fileUploadDemo1 {
	
	WebDriver driver;

	@BeforeMethod
	public void SetUp() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void ValidateLoginUsingValidCredentails() {
		driver.findElement(By.id("username")).sendKeys("pshiva8909");
		driver.findElement(By.id("password")).sendKeys("Shiva@123");
		driver.findElement(By.id("login")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
