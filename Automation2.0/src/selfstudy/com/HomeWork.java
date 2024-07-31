package selfstudy.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	public static  WebDriver driver;{
		
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abhishekshukla3023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("8770710709");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
