package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Containfiuncationtofinduniclyamount {
public static WebDriver driver; {
	
}
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("s24 ultra mobile",Keys.ENTER);
	String price = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S24 Ultra 5G (Titanium Black, 256 GB)']/../../..//div[contains(text(),'₹')][1]")).getText();
	System.out.println(price);
}

}
