package BachExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class snapchat {
	@Test
	public void  snapechat() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN885G0&p=snapchat");
	driver.quit();
	}

}
