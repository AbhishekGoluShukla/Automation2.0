package JavaScriptThrowSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClicByJavaScript {
	public static WebDriver driver;{
		
	}

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
		 List<WebElement> diabletextbox = driver.findElements(By.xpath("//input[@class='form-control']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments.value='Manual'", diabletextbox);
		
}
}
