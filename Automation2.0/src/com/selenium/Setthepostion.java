package com.selenium;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setthepostion {
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
        for (String windowId : allWindowsId) {
            Thread.sleep(4000);
            driver.switchTo().window(windowId);
            if (driver.getTitle().contains("Online Shopping")) {
                driver.manage().window().setSize(new Dimension(100, 500));
                driver.manage().window().setPosition(new Point(1000, 0));
            }
        }
    }
}
