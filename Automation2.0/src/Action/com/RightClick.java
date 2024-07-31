package Action.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		WebElement click=driver.findElement(By.name("username"));
		Actions ac=new Actions(driver);
		//ac.contextClick(click).perform();//or
		ac.moveToElement(click).click().perform();
	
	}

}
