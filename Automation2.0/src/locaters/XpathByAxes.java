package locaters;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.util.Anonymizer;

public class XpathByAxes {

	public static WebDriver driver; {
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shubh/Desktop/Animal.html");
	String text=driver.findElement(By.xpath("//div[@class='Mammal']/parent::div")).getText();
	System.out.println(text);
	
	}
	
}
