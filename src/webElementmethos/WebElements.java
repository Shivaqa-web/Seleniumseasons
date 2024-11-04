package webElementmethos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		// getTitle() - User for this will return the title of the page/window/tab in
		// form of String
		System.out.println(driver.getTitle());
		// Diff b/w Close and quite methods

		// getCurrentUrl() -this will return the url present in address bar in form of
		// String
		System.out.println(driver.getCurrentUrl());

		// getPageSource():String - this will return the page source (html code) in form
		// of String
		// System.out.println(driver.getPageSource());
		// driver.findElement(By.xpath("//img[@src='img/google-play.png']")).click();
		// Using close method - to close focued driver winodw
		// driver.close();
		// using Quite method - to close all tabs/window/Webpage
		driver.findElement(By.name("username")).sendKeys("reyaz0806");
		driver.findElement(By.name("password")).sendKeys("reyaz123");
		driver.findElement(By.name("login")).click();

		Thread.sleep(10000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(10000);
		driver.quit();

	}

}
