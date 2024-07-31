package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static WebDriver driver; {
	}
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//strong[text()='Your Personal Details']/../following-sibling::div//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//strong[text()='Your Personal Details']/../following-sibling::div//input[@id='FirstName']")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//strong[text()='Your Personal Details']/../following-sibling::div//input[@id='LastName']")).sendKeys("Shukla");
		driver.findElement(By.xpath("//strong[text()='Your Personal Details']/../following-sibling::div//input[@id='Email']")).sendKeys("abhishekshukal3023@gmail.com");
		driver.findElement(By.xpath("//strong[text()='Your Password']/../following-sibling::div//input[@id='Password']")).sendKeys("12345@Klm");
		driver.findElement(By.xpath("//strong[text()='Your Password']/../following-sibling::div//input[@id='ConfirmPassword']")).sendKeys("12345@Klm");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("//strong[text()='Returning Customer']/../following-sibling::div//input[@id='Email']")).sendKeys("abhishekshukla3023@gmail.com");
		driver.findElement(By.xpath("//strong[text()='Returning Customer']/../following-sibling::div//input[@id='Password']")).sendKeys("12345@Klm");
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
	}

}
