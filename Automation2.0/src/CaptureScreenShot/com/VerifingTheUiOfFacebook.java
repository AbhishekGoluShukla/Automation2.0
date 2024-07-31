package CaptureScreenShot.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifingTheUiOfFacebook {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      WebElement  emailTextbox= driver.findElement(By.id("email"));
	     WebElement pass= driver.findElement(By.id("passContainer"));
	      Rectangle email =emailTextbox.getRect();
	      Rectangle password=pass.getRect();
	      System.out.println(email.getHeight()+"     "+password.getHeight());
	      System.out.println(email.getWidth()+"    "+password.getWidth());
	      System.out.println(email.getX()+"    "+password.getX());
	      System.out.println(email.getY()+"    "+password.getY());
	      System.out.println("gap : "+(password.getY()-(email.getY()+email.getHeight())));
	      System.out.println(password.getY());
	     

}
}