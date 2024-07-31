package CaptureScreenShot.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDiaplayIsSelectedIsEnabled {
public static WebDriver driver; {
		
	}	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		//Is selected//for radio button and check box
		WebElement maleradiobotton=driver.findElement(By.id("gender-male"));
		if(maleradiobotton.isSelected()) {
			System.out.println("It is selected");
		}
		else {
			System.out.println("It is selecting it now");
			maleradiobotton.click();
		}
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	    WebElement rembermecheckbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	    System.out.println(rembermecheckbox.isSelected());
	    driver.quit();
		
}
}