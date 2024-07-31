package CaptureScreenShot.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValuemathod20 {
public static WebDriver driver; {
		
	}	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("abhishekshukla3023@gmail.com",Keys.ENTER);
		WebElement Erroemag=driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		System.out.println(Erroemag.getText());
		System.out.println(Erroemag.getCssValue("color"));
		driver.quit();
}
}
