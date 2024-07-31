package locaters;

import javax.swing.plaf.basic.BasicArrowButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facrbook20 {
	public static WebDriver driver; {}
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("8770710709");
	driver.findElement(By.id("pass")).sendKeys("8770710709ab");
	driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
}	

}
