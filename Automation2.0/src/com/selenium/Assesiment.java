package com.selenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WindowType;

public class Assesiment {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN885G0&p=zomato");
        String parentWindow = driver.getWindowHandle();
        driver.manage().window().maximize();

        // Opening a new tab
        driver.switchTo().newWindow(WindowType.TAB);
        // Navigate into swiggy
        driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN885G0&p=swiggy");

        // Opening a new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        // Navigate to flipkart
        driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN885G0&p=flipkart");

        // Capture all windows using getWindowHandles
        Set<String> allWindowsId = driver.getWindowHandles();
        // Using remove() to remove parent windowId from set
        allWindowsId.remove(parentWindow);
        System.out.println(allWindowsId);
        
        // Closing all other windows
        for (String windowId : allWindowsId) {
            driver.switchTo().window(windowId);
            Thread.sleep(5000); // Just for demonstration, you might want to remove this in real code
            driver.close();
        }

        // Close the parent window
        driver.switchTo().window(parentWindow);
        driver.close();
    }
}
