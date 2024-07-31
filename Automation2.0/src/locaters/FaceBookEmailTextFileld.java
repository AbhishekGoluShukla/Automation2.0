package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookEmailTextFileld {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	WebElement	emailTextBox=driver.findElement(By.id("email"));
	emailTextBox.sendKeys("abhisheshukla3023@gamil.com");

}
}