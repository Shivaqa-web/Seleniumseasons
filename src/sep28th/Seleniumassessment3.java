package sep28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumassessment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sell on Amazon")).click();
		System.out.println(driver.findElement(By.linkText("Start Selling")).isDisplayed());
		
		Thread.sleep(9000);
		driver.navigate().back();
		driver.findElement(By.linkText("Sell under Amazon Accelerator")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Protect and Build Your Brand")).click();
		System.out.println(driver.findElement(By.linkText("Brand Registry")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.linkText("Amazon Global Selling")).click();
		System.out.println(driver.findElement(By.linkText("Register now to export")).isDisplayed());
		driver.navigate().back();
		Thread.sleep(9000);
		driver.findElement(By.linkText("Supply to Amazon")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(9000);
		driver.findElement(By.linkText("Become an Affiliate")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(9000);
		driver.findElement(By.linkText("Fulfilment by Amazon")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(9000);
		driver.findElement(By.linkText("Advertise Your Products")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(9000);
		driver.findElement(By.linkText("Amazon Pay on Merchants")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
