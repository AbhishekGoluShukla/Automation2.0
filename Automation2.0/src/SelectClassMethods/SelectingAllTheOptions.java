package SelectClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingAllTheOptions {
public static  WebDriver driver;{
		
	}
public static void main(String[] args) throws InterruptedException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php/");
	WebElement yeredropdown=driver.findElement(By.id("year"));
	Select select=new Select(yeredropdown);
	List<WebElement> options = select.getOptions();
	for(WebElement option:options) {
		select.selectByValue(option.getAttribute("value"));
		//Thread.sleep(200);
		//System.out.println(select.toString());
	}
}
}
