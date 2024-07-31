package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperAttributTimeOutBike {
	
	@Test
	public void continentalGT650() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bikewale.com/royalenfield-bikes/continental-gt/");
	driver.quit();
		
	}
	@Test()
	public void harleydavidson(){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.harley-davidson.com/in/en/index.html");
	driver.quit();
	}
	@Test(timeOut = 3000)//this method will use to check how much time it will take and if what time we hve given if it will not work at same time we will get an exception ThreadTimeoutException
	public void Kawasaki(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bikewale.com/kawasaki-bikes/z900/");
		driver.quit();
	}
}

