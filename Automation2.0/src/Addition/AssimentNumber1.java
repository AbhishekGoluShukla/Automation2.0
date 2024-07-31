package Addition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssimentNumber1 {
 public static WebDriver driver;{
	
}
 public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/shubh/Downloads/Assessment1.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()=' Click Me !!!']")).click();
     Set<String> allwindowIds = driver.getWindowHandles();
     for (String windowIs : allwindowIds) {
    	 driver.switchTo().window(windowIs);
         if (driver.getCurrentUrl().contains("burgerking.in")) {
        	 {
        		 driver.close();
        	 }
         }
     }
  }
}
