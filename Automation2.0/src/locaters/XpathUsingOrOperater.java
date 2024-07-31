package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingOrOperater {
public static WebDriver driver; {}
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='gender-male'or @id='gender-female' ]")).click();
	driver.close();
}
}
