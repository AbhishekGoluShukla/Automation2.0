package DeledingMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstClassOFDeleting {
public static WebDriver driver;{
	
}
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/books");
	WebElement dropdown=driver.findElement(By.id("products-orderby"));
	Select select=new Select(dropdown);
	//select.selectByIndex(0);
	//select.selectByIndex(2);
	select.selectByIndex(1);
	System.out.println(select.getFirstSelectedOption().getText());
	driver.quit();
	
}
}
