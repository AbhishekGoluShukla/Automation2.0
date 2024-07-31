package JavaScriptThrowSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTO {
	public static WebDriver driver;{
		
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zomato.com/");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		WebElement email=driver.findElement(By.xpath("//label[text()='Email']"));
		jse.executeScript("argument[0].scrollIntoView(false)",email);
		//need to take a class not x path then it will run

}
}
