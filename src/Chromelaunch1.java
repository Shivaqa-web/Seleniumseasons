import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Chromelaunch1 {

	public static void main(String[] args) throws InterruptedException {

		
	WebDriver driver=	new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	
	
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	
	Thread.sleep(8000);
	//driver.findElement(By.xpath("//img[@src='img/google-play.png']")).click();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getWindowHandles());
	//ydriver.navigate().back();
	Thread.sleep(8000);
	//driver.navigate().forward();
	driver.quit();
	}

}
