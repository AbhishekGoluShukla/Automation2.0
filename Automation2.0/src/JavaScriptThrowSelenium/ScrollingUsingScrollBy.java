package JavaScriptThrowSelenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingScrollBy {
public static WebDriver driver; {
	
}
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.zomato.com/");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,3000)");
	
	
}
}
