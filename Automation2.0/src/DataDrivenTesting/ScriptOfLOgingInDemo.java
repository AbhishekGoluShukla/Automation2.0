package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptOfLOgingInDemo {
	public static WebDriver driver;{	
	}
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\shubh\\Automation2.0\\Automation2.0\\Jars\\Test\\DemoWebShopPropertFile");
		FileInputStream fis=new FileInputStream(f);
		Properties por=new Properties();
		por.load(fis);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).
		sendKeys(por.getProperty("email"));
		driver.findElement(By.id("Password")).sendKeys(por.getProperty("pass"));
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
}
}
