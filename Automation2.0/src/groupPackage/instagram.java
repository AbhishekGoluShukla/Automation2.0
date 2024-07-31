package groupPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class instagram {
	@Test(groups = "firstgroup")
	public void  insta() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/?hl=en");
	driver.quit();
	}

}
