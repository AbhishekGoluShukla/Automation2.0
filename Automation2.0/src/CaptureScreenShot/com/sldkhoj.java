package CaptureScreenShot.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sldkhoj {
public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demowebshop.tricentis.com/login");
	      WebElement email=driver.findElement(By.id("Email"));
	      email.sendKeys("abhishekshukla3023@gmail.com");
	      System.out.println(email.getAttribute("value"));
}
}
