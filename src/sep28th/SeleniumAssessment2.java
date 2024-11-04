package sep28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssessment2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot Password?")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.linkText("New User Register Here")).click();
		System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.linkText("Go to bliud 2")).click();
		System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
