package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class LaunchBrowser
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Browser Name");
        String s = sc.nextLine();
         if (s.equalsIgnoreCase("chrome"))
         {
            System.out.println("Launching the Chrome browser");
            WebDriver driver = new ChromeDriver();
        }
         else if (s.equalsIgnoreCase("firefox"))
        {
            System.out.println("Launching the Firefox browser");
            WebDriver driver = new FirefoxDriver();
        }
        else if (s.equalsIgnoreCase("edge"))
        {
            System.out.println("Launching the Edge browser");
            WebDriver driver = new EdgeDriver();
        }
        else 
        {
            System.out.println("Don't recognize the browser name");
        }
        sc.close();
    }
}
