package com.selenium;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchBrowser1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a browser name:");
		String s=sc.nextLine();
		if (s.equalsIgnoreCase("Chrome")) {
			System.out.println("Launch The chrome Browser:");
			WebDriver d=new ChromeDriver();
			
		} else if(s.equalsIgnoreCase("Firefox")) {
			System.out.println("Launch The Firefox Browser:");
			WebDriver d=new FirefoxDriver();
		}
		else if (s.equalsIgnoreCase("Edge")) {
			System.out.println("Launch The Edge Browser:");
			}
		else {
			System.out.println("Anothe browser name");
		}
		sc.close();
		
			
		
	}

}
