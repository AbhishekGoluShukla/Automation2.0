package Action.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingByAmount {
public static WebDriver driver; {
		
	}
	public static void main(String[] args)   {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//span[text()='TRY AGAIN']"));
		//action.scrollByAmount(0,10000 ).perform();
		action.scrollToElement(element).perform();
		//driver.quit();
	}

}
