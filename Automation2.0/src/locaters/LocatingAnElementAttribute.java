package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementAttribute {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/register");
	WebElement	emailTextBox=dr.findElement(By.id("Email"));
	emailTextBox.sendKeys("abhisheshukla3023@gamil.com");
	}

}
