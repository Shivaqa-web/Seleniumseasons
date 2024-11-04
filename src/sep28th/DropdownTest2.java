package sep28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");
		//selectByValue("search-alias=stripbooks");
		
		//selectByIndex(12);
		
	    Thread.sleep(3000);
	    driver.quit();
	}

}
