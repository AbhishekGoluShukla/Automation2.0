package com.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchTheBrowserAndMaxiumTheBrowser {
	static WebDriver driver;
	public static void main(String[] args) {
		while (true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("***enter a browser ***");
			String browser=sc.next();
			if (browser.equalsIgnoreCase("Chrome")) 
			{
				driver =new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) 
			{
				driver =new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("edgs")) 
			{
				driver =new EdgeDriver();
			}
			else {
				System.out.println("Anothe or worng browser");
			}
			driver.manage().window().maximize();
			driver.get("https://www.swiggy.com/");
			String actualTitleString=driver.getTitle();
			String excpectedTitileString="Order Food Online from India's Best Food Delivery Services|Swiggy";
			if (actualTitleString.equals(excpectedTitileString)) {
				System.out.println("Title is Correct");
				}
			else
			{
				System.out.println("Title is worng");
			}
			
			
		}
		
	}

}
