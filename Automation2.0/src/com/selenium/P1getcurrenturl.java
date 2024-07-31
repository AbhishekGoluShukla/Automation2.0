package com.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P1getcurrenturl {
    static WebDriver dr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Browser name:");
        String br=sc.next();
        if (br.equalsIgnoreCase("Chrom")) {
            dr =new ChromeDriver();
        }  else if(br.equalsIgnoreCase("FireFox")) {
            dr =new FirefoxDriver();
        }else if(br.equalsIgnoreCase("Edge")) {
            dr =new EdgeDriver();
        }else {
            System.out.println("Invalid browser name");
        }
        dr.manage().window().maximize();
        dr.get("https://www.instagram.com/?hl=en");
        String url=dr.getCurrentUrl();
        System.out.println("URL Is"+ url);
    }
}