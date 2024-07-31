package BachExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class R16 {
	@Test
	public void  r15() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bikewale.com/yamaha-bikes/r15/");
	driver.quit();
	}

}
