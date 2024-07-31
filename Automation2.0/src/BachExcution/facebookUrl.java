package BachExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebookUrl {
	@Test
	public void  facebook() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN885G0&p=fb+facebook");
	driver.quit();
	}

}


