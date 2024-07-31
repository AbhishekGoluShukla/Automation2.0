package CaptureScreenShot.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValueMethod {
	
	public static WebDriver driver; {
		
	}	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("xyz",Keys.ENTER);
		WebElement errormasseg=driver.findElement(By.xpath("//span[@data-valmsg-for='Email']"));
		System.out.println(errormasseg.getText());
		System.out.println(errormasseg.getCssValue("color"));//srech in google rbg converter
		driver.quit();
	}
		
	

}
