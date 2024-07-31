package SelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingalSelectDropDown {
	public static  WebDriver driver;{
		
	}
public static void main(String[] args) throws InterruptedException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php/");
	WebElement monthdropdown=driver.findElement(By.id("month"));
	Select select=new Select(monthdropdown);
	System.out.println(select.isMultiple());
	select.selectByIndex(2);
	Thread.sleep(4000);
	select.selectByValue("8");
	Thread.sleep(4000);
	select.selectByVisibleText("Dec");
}
}
