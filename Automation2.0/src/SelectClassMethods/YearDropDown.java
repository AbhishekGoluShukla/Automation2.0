package SelectClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YearDropDown {
	public static  WebDriver driver;{
		
	}
public static void main(String[] args) throws InterruptedException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php/");
	WebElement yeredropdown=driver.findElement(By.id("year"));
	Select select=new Select(yeredropdown);
	System.out.println(select.isMultiple());
	select.selectByIndex(2);
	Thread.sleep(4000);
	select.selectByValue("2024");
	Thread.sleep(4000);
	select.selectByVisibleText("2001");
	List<WebElement> options = select.getOptions();
	for(WebElement option:options) {
		System.out.println(option.getText());
	}
}
}
