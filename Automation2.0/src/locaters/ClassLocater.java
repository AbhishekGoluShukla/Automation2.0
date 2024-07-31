package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocater {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abhishekshukla3023@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345@Klm");
		driver.findElement(By.className("login-button")).click();
		driver.close();
	}

}
