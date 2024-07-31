package CaptureScreenShot.com;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.AstSorter;

public class CaptringLocationOfWebElement {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		  driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in/");
	       WebElement logo=driver.findElement(By.id("nav-logo-sprites"));
	     Point  loc=logo.getLocation();
	     System.out.println("X  :  "+loc.getX());
	     System.out.println("Y  :  "+loc.getY());
	}

}
