package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class FaceBookLOginClick {
	public static WebDriver driver; {
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("8770710709");
		driver.findElement(By.id("pass")).sendKeys("8770710709ab");
		driver.findElement(By.tagName("button")).click();
	
	}

}
