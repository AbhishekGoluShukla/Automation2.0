package BachExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class royalEnfield {
	@Test
	public void  royalEnfieldd() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.royalenfield.com/in/en/home/");
	driver.quit();

}
}
