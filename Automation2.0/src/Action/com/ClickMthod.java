package Action.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMthod {
	public static WebDriver driver;
	{

	}

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		Thread.sleep(5000);// once your webpage loded then the popep will come//
		driver.findElement(By.id("wzrk-cancel")).click();
		Actions action = new Actions(driver);
		WebElement mouse = driver.findElement(By.xpath("//div[text()='Televisions']"));
		action.moveToElement(mouse).perform();
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.partialLinkText("Gaming Consoles"));
		//action.click(click).perform();
		//or
		action.moveToElement(click).click().perform();
		
	}

}
