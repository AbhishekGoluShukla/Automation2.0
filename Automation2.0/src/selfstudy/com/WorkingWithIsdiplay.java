package selfstudy.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsdiplay {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://infotech.works/services/");
		WebElement logo=driver.findElement(By.xpath("//img[@class='site_logo']"));
		//System.out.println(logo.isDisplayed());
		//System.out.println(logo.getText());
		Dimension size=logo.getSize();
		Point point=logo.getLocation();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		System.out.println("X=="+point.getX());
		System.out.println("Y=="+point.getY());
		driver.quit();
	}

}
