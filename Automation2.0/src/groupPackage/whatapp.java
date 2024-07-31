package groupPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class whatapp {
	@Test(groups = "secondgroup")
	public void  Whatapp() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://web.whatsapp.com/");
	driver.quit();
	}

}
