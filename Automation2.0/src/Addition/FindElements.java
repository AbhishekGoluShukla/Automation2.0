package Addition;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15");
		driver.findElement(By.id("nav-search-submit-button")).click();
	//	driver.findElement(By.xpath("//span[contains(text(),'iPhone 15 (128 GB) - Blue')]/../../../../..//button")).click();
		List<WebElement> AllpriceElement = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(WebElement allprice:AllpriceElement) {
			System.out.println(allprice.getText());
		}
		
	}
	
}
