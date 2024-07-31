package Action.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static WebDriver driver;{
		
	}
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/product.php?product=testing");
	WebElement addbutton=driver.findElement(By.id("add"));
	Actions action=new Actions(driver);
	action.doubleClick(addbutton).click().perform();
}
}
