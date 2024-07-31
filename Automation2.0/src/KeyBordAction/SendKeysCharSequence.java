package KeyBordAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysCharSequence {
	public static WebDriver driver; {
		
	}
 public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	Actions actions=new Actions(driver);
	WebElement beuty=driver.findElement(By.xpath("//input[ @class='sc-eDvSVe gUjMRV sc-eeMvmM jsHpoY search-input-elm sc-eeMvmM jsHpoY search-input-elm']"));
	actions.sendKeys(beuty,"Shose For Man").perform();
	actions.keyDown(Keys.ENTER).perform();
	actions.keyUp(Keys.ENTER).perform();
}
}
