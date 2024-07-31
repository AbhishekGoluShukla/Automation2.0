package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes2 {
	public static WebDriver driver;{
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shubh/Desktop/Animal.html");
	String text=driver.findElement(By.xpath("//div[@class='Mammal']/child::div[@class='Carivore']")).getText();
	System.out.println(text);
	} 
}
