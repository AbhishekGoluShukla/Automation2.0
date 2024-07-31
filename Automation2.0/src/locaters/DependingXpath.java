package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependingXpath {
	public static WebDriver driver;{
		
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/cell-phones");
		driver.findElement(By.partialLinkText("Computers")).click();
		driver.findElement(By.partialLinkText("Desktops")).click();
		driver.findElement(By.xpath("//a[text()='Build your own cheap computer']/../..//input[@value='Add to cart']")).click();	
	}

}
