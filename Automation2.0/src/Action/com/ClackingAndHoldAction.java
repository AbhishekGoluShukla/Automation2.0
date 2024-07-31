package Action.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClackingAndHoldAction {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions actions=new Actions(driver);
		WebElement element=driver.findElement(By.id("box1"));
		WebElement element2=driver.findElement(By.id("box101"));
		//actions.clickAndHold(element).release(element2).perform();
		//actions.moveToElement(element).clickAndHold().moveToElement(element2).release().perform();
		//actions.clickAndHold(element).moveToElement(element2).release().perform();
		actions.moveToElement(element).clickAndHold().release(element2).perform();
		Thread.sleep(2000);
		driver.quit(); 
	}

}
