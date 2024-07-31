package selfstudy.com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TageNameLocater {
	public static WebDriver driver; {
		}

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement>AllLinks=driver.findElements(By.tagName("a"));
		//find the all the element of the landpage
		System.out.println("the total number of link in this webpage is:"+AllLinks.size()); 
		//find the names of all the links
		for(int i=0;i<AllLinks.size();i++) {
			System.out.println(AllLinks.get(i).getText());
		}
		

	}

}
