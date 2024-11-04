package linkTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement block=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]"));
       List<WebElement> link=block.findElements(By.tagName("a"));
        
       System.out.println(link.size());
       
       for(int i=0;i<link.size();i++) {
    	   
    	  WebElement tags= link.get(i);
    	  
    	  tags.click();
    	  Thread.sleep(3000);
    	  System.out.println(driver.getTitle());
    	  System.out.println(driver.getCurrentUrl());
    	  driver.navigate().back();
    	  
    	   block=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]"));
           link=block.findElements(By.tagName("a"));
       }
       driver.quit();
	}

}
