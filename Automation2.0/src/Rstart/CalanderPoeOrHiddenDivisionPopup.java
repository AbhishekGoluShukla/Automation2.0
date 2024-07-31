package Rstart;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderPoeOrHiddenDivisionPopup {
	public static WebDriver driver;{
		
	}
	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		int date=ldt.getDayOfMonth();
		String month=ldt.getMonth().toString().toLowerCase();
		month=month.replace(month.charAt(0), (char) ((char) month.charAt(0)-32));
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//button[text()='Okay']")).click();
		driver.findElement(By.id("date-box")).click();
		//driver.findElement(By.xpath("//div[text()='July']/../..//span[text()='5']")).click();
		String locater="//div[text()='"+month+"']/../..//span[text()='"+date+"']";
		//System.out.println(locater);
		driver.findElement(By.xpath(locater)).click();
	}

}
