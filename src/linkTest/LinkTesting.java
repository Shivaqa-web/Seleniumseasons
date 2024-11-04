package linkTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTesting {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
		List<WebElement> A = driver.findElements(By.tagName("a"));

		System.out.println(A.size());

		for (int i = 0; i < A.size(); i++) {
			WebElement Link = A.get(i);
		//	System.out.println(Link);
			System.out.println(Link.getAttribute("href"));
			System.out.println(Link.getText());

		}
		driver.quit();
	}

}
