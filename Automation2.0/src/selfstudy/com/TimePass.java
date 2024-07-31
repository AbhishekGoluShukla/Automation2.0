package selfstudy.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimePass { 
	public static WebDriver driver;{
		
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://workmen.digital.lntecc.com/WISA/Authentication/Login");
        WebElement size  =	driver.findElement(By.xpath("//img[@class='wisa-png-logo']"));
		Dimension x=size.getSize();
		System.out.println(x.getHeight());
		System.out.println(x.getWidth());

        Point  piont=size.getLocation();
        System.out.println("Y=="+piont.getX());
        System.out.println("X=="+piont.getY());
       
	}

}
