package BachExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaBik {
	@Test
	public void  javabik() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bikewale.com/jawa-bikes/");
	driver.quit();
	}

}


