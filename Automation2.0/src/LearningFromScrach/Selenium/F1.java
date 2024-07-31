package LearningFromScrach.Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class F1 {
	public static WebDriver driver; {

	}
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a browser name ->");
			String browser=scanner.next();
			if (browser.equalsIgnoreCase("chrom")) {
				driver=new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			}
			else {
				System.out.println("Invalid Browser");
			}
		}
	}

}
