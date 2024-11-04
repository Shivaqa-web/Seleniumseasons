package sep28th;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {

		System.out.println("ENter the broswer ");
		Scanner input = new Scanner(System.in);
		String bro = input.nextLine();
         
		switch (bro) {
		case "Chrome":
			ChromeDriver driver = new ChromeDriver();
			driver.quit();
			break;
		case "Firefox":
			FirefoxDriver driver1 = new FirefoxDriver();
			driver1.quit();
			break;
		case "Edge":
			EdgeDriver driver2 = new EdgeDriver();
			driver2.quit();
		default:
			break;
		}

	}

}
