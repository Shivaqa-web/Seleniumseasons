package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import webElementmethos.WebElements;

public class DropDownTest3 {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("username")).sendKeys("pshiva8909");
        driver.findElement(By.id("password")).sendKeys("Shiva@123");
        driver.findElement(By.id("login")).click();
        
       WebElement Loc= driver.findElement(By.id("location"));
     List<WebElement> ALLITEMS=  Loc.findElements(By.tagName("option"));
     
     System.out.println(ALLITEMS.size());
     
     for(int i=0;i<ALLITEMS.size();i++) {
    	 WebElement lo=ALLITEMS.get(i);
    	 System.out.println(lo.getText());
        
     
      }
	}

}
