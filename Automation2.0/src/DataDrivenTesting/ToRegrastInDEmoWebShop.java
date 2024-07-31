package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FramWorkPackeg.ExalUtlite;

public class ToRegrastInDEmoWebShop {
	public static WebDriver driver;{
		
	}
	 public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		String sheetname="Sheet1";
		String firstName=ExalUtlite.readDataFromExal(sheetname, 1, 0);
		String lastName=ExalUtlite.readDataFromExal(sheetname, 1, 1);
		String email=ExalUtlite.readDataFromExal(sheetname, 1, 2);
		String password=ExalUtlite.readDataFromExal(sheetname, 1, 3);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.id("register-button")).click();
	}

}
