package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingAndOperater {
public static WebDriver driver; {}
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//img[@alt='Grocery' and @alt='Mobiles']"));
	}
}