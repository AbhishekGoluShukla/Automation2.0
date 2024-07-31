package CaptureScreenShot.com;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshotOfWebElemenr {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) throws IOException {
		LocalDateTime ldt=LocalDateTime.now();
		String time=ldt.toString().replace(":", "-");
		System.out.println(time);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone+15+pro+max&crid=3G96VL45UJIQE&sprefix=ip%2Caps%2C472&ref=nb_sb_ss_ts-doa-p_1_2");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenShot\\imag"+time+".png");//[\\img.png]->is important//no need to give full path simplya .\\and folder nameand \\img.png
		FileHandler.copy(screenshot, dest);
		 
	}

}
