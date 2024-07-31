package locaters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipKatAutomation {
	public static WebDriver driver;{}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 15",Keys.ENTER);
		driver.findElement(By.cssSelector("img[alt='Apple iPhone 15 (Green, 128 GB)']")).click(); 
	}

}
