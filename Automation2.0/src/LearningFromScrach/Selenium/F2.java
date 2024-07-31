 package LearningFromScrach.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2 {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		//how to launch a browser->Simply creat a objet of any browser you want.
		//for Ex:
		driver=new ChromeDriver();
		//maximum the broweser.
		driver.manage().window().maximize();
		//URL
		driver.get("https://www.shoppersstack.com/");
		//how to find a element and serch any thing/
	    driver.findElement(By.id("loginBtn"));
		
		
	}

}
