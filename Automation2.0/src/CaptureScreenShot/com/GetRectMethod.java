package CaptureScreenShot.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		  driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in/");
	       WebElement logo=driver.findElement(By.id("nav-logo-sprites"));
	       Rectangle  rectangle=logo.getRect();
	       System.out.println("Hight : "+rectangle.getHeight());
	       System.out.println("Width : "+rectangle.getWidth());
	       System.out.println("X : "+rectangle.getX());
	       System.out.println("Y : "+rectangle.getY());
	       
}
}
