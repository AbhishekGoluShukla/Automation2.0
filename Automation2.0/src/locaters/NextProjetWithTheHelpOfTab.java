package locaters;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextProjetWithTheHelpOfTab {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).
		sendKeys("abhishekshukla3023@gmail.com",Keys.TAB,"12345@Klm",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		
	}

}
