import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginToadactin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.name("username")).getLocation().getX());
		System.out.println(driver.findElement(By.name("username")).getLocation().getY());
		System.out.println(driver.findElement(By.name("username")).getSize().getHeight());
		driver.findElement(By.name("username")).sendKeys("reyaz0806");
		driver.findElement(By.name("password")).sendKeys("reyaz123");
	System.out.println(driver.findElement(By.name("username")).getTagName());	 
	System.out.println(driver.findElement(By.name("username")).getCssValue("color"));
	
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		
		driver.quit();

	}

}
