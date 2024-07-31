package Rstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File2uplod {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.xpath("//a[@id='pickfiles']")).sendKeys("C:\\Users\\shubh\\Documents\\Abc.exe");
		driver.quit();
	}
	

}
