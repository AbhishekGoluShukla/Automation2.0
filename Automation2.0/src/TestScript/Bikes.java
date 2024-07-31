package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bikes {
	
	@Test
	public void continentalGT650() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bikewale.com/royalenfield-bikes/continental-gt/");
	driver.quit();
		
	}
	@Test
	public void harleydavidson(){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.harley-davidson.com/in/en/index.html");
	driver.quit();
	}
	@Test(priority = -5,invocationCount = 2,threadPoolSize = 2)//invocationCount how many type to run same test case//thredPoolsize when we have to execute same test case papally  
	public void Kawasaki(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bikewale.com/kawasaki-bikes/z900/");
		driver.quit();
	}
}
