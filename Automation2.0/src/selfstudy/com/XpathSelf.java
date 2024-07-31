package selfstudy.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelf {
public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://infotech.works/services/");
		WebElement text=driver.findElement(By.xpath("//a[@class='vc_general vc_btn3 vc_btn3-size-lg vc_btn3-shape-round vc_btn3-style-outline-custom vc_btn3-block']/../../../../..//a[text()='Benefit From Our Value Proposition']"));
		System.out.println(text.getText());
		System.out.println(text.getCssValue("Value"));
		driver.quit();
		

}
}
