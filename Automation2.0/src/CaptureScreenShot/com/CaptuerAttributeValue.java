package CaptureScreenShot.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptuerAttributeValue {
public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.shaadi.com/");
	      WebElement logo=driver.findElement(By.xpath("//img[@data-testid='shaadi_logo']"));
	      String value=logo.getAttribute("title");
	      System.out.println("----->"+value+"<-----");

}
}
