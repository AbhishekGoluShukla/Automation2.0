package selfstudy.com;

import java.util.jar.Attributes.Name;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;

public class Locaters {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abhishekshukal3023@gamil.com");
		driver.findElement(By.id("pass")).sendKeys("8770710709ab");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
