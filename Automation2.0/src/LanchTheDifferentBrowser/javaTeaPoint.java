package LanchTheDifferentBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class javaTeaPoint {
	@Parameters("abc")
	@Test
	//public void browser(@optional("chrom")String browserName)->when user is fail to give any browser name then it will open
	public void browser(String browserName) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("Chrom")) {
			driver=new ChromeDriver();
		}
		else  if(browserName.equalsIgnoreCase("fire fox")) {
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			Reporter.log("Invalid browser name");
		}
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/");
		driver.quit();
		
	}

}
