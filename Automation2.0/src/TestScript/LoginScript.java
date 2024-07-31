package TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class LoginScript {
	@Test
	
	public void loginsecnario() {
		String expectiedTitle="Demo Web Shop";
		String ecpectedLoginpageTitle = "Demo Web Shop.Login";
		SoftAssert softassert=new SoftAssert();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		String actualTitle = driver.getTitle();
		softassert.assertEquals(actualTitle, expectiedTitle,"TitleVerfaction");//Assert
		driver.findElement(By.partialLinkText("Log in")).click();
		String actualLoging=driver.getTitle();
		softassert.assertEquals(actualLoging, ecpectedLoginpageTitle,"title verifaction of login page");//Assert
		driver.findElement(By.id("Email")).sendKeys("abhishekshukla3023@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345@Klm");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		softassert.assertAll();
	}

}
