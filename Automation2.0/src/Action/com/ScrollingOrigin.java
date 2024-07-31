package Action.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollingOrigin {
public static WebDriver driver; {
		
	}
	public static void main(String[] args)   {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Actions action=new Actions(driver);
		WebElement abc=driver.findElement(By.xpath("//h4[@class='sc-eDvSVe fsMfOn']"));
		action.scrollFromOrigin(ScrollOrigin.fromElement(abc), 0, 300).perform();
		
	}
}
