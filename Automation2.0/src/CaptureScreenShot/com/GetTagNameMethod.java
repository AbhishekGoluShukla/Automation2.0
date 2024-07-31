package CaptureScreenShot.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		WebElement serchbar=driver.findElement(By.xpath("//input[@aria-label='Search Ajio']"));
		System.out.println(serchbar.getTagName());
		driver.quit();
	}
	

}
