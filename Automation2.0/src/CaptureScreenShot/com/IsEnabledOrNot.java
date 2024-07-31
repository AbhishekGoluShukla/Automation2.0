package CaptureScreenShot.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledOrNot {
  public static WebDriver driver; {
	
}
  public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	WebElement ele=driver.findElement(By.xpath("//input[@class='form-control']"));
	System.out.println(ele.isEnabled());
	
}
  
}
