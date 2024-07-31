package groupPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AyshaKhan {
	@Test(groups = "crush")
	public void  Whatapp() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/ayeshaakhan_official/");
	driver.quit();
	}

}
