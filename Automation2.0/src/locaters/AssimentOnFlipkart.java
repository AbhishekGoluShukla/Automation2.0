package locaters;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.model.WindowID;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.remote.service.DriverFinder;

import net.bytebuddy.asm.Advice.Enter;

public class AssimentOnFlipkart {
	public static WebDriver driver; {
		}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iPhone",Keys.ENTER);
		driver.findElement(By.partialLinkText("Apple iPhone 14 Plus (Yellow, 128 GB)")).click();
		String parentWindowId=driver.getWindowHandle();
		Set<String> allWindow=driver.getWindowHandles();
		allWindow.remove(parentWindowId);
		for(String windowId :allWindow){
		driver.switchTo().window(windowId);
		}
		driver.findElement(By.id("pincodeInputId")).sendKeys("483501",Keys.ENTER);
	}
}

