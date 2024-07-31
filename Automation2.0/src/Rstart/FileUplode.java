package Rstart;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplode {
 public static  WebDriver driver;{
	
}
 public static void main(String[] args) throws InterruptedException, IOException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.findElement(By.id("pickfiles")).click(); 
	Thread.sleep(2000);
	Runtime.getRuntime().exec("C:\\Users\\shubh\\Documents\\Abc.exe");
	
}
}
