package sep28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAssessment4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		new Select(driver.findElement(By.id("day"))).selectByValue("10");
		new Select(driver.findElement(By.id("month"))).selectByValue("1");
		new Select(driver.findElement(By.id("year"))).selectByValue("1999");
		Thread.sleep(9000);
		driver.quit();

	}

}
