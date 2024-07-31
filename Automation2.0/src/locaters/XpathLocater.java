package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocater {
   public static WebDriver driver; {}
   public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/input")).click();
}

}
