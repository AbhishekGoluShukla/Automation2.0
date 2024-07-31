package Action.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByMethod {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.paiinternational.in/shop/categories/furniture-2/");
		WebElement slider=driver.findElement(By.xpath("//span[@class='irs-slider from']"));
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDropBy(slider, 40, 0).perform();
		Thread.sleep(3000);
		action.dragAndDropBy(slider, -40, 0).perform();
		driver.quit();
		
		
		
	}
	
	

}
