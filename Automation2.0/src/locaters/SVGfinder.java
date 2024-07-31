package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGfinder {
public static WebDriver driver; {
	
}
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
	driver .findElement(By.xpath("//a[text()='POCO M6 5G (Orion Blue, 128 GB)']/../../..//*[name()='svg']")).click();
}
}
