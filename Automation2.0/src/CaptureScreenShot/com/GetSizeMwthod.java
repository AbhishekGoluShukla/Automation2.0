package CaptureScreenShot.com;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMwthod {
public static WebDriver driver; {
	
}
public static void main(String[] args) {
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
       WebElement logo=driver.findElement(By.id("nav-logo-sprites"));
       Dimension size=logo.getSize();
       System.out.println("Height:"+size.getHeight());
       System.out.println("Width:"+size.width);
       
}
}
