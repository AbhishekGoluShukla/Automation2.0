package CaptureScreenShot.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDispled {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement logoOfGoogle=driver.findElement(By.xpath("//img[@alt='Google']"));
		System.out.println(logoOfGoogle.isDisplayed());
	}

}
