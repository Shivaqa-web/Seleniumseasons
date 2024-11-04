package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import webElementmethos.WebElements;

public class DropDownTest1 {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
      WebElement drop=  driver.findElement(By.id("searchDropdownBox"));
      
      List<WebElement> Allitems=  drop.findElements(By.tagName("option"));
      System.out.println(Allitems.size());
      
      
      for(int i=0;i<Allitems.size();i++) {
    	  
    	  WebElement values=Allitems.get(i);
    	  System.out.println(values.getText());
      }
	}

}
