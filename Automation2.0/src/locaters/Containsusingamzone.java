package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Containsusingamzone {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15 pro max ",Keys.ENTER);
		String print = driver.findElement(By.xpath("//span[text()='iPhone 15 Pro Max (256 GB) - Blue Titanium']/../../../..//span[@class='a-price-whole'][1]")).getText();
		System.out.println(print);
	}

}
