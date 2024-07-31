package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bike2DeprndonMethod {
	
	@Test
	public void continentalGT650() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bikewale.com/royalenfield-bikes/continental-gt/");
	driver.quit();
		
	}
	//@Test(dependsOnMethods = {"continentalGT650","Kawasaki"})//it manes first this two will work after this harldydivtion work
	@Test
	public void harleydavidson(){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.harley-davidson.com/in/en/index.html");
	driver.quit();
	}
	@Test  
	public void Kawasaki(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bikewale.com/kawasaki-bikes/z900/");
		Assert.fail();//this method  will help to fail intcally fail.
		driver.quit();
	}
}

