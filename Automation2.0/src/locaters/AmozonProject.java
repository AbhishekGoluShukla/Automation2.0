package locaters;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class AmozonProject {
	public static WebDriver driver; {}
 public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphon",Keys.ENTER);
	Set<String> parentWindowId = driver.getWindowHandles();
    Set<String> allWindowId = driver.getWindowHandles();  
    allWindowId.remove(parentWindowId);
    Set<String> allWindowIds = driver.getWindowHandles();
	for(String WindowId:allWindowIds) { 
		driver.switchTo().window(WindowId);
    	
    }
    
    
}
}
