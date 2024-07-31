package locaters;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.model.WindowID;

import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step;

public class TomorrowSBIAssement {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
        String parentWindowId=driver.getWindowHandle();
        driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
        driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
        Set<String>allwindowIds=driver.getWindowHandles();
        allwindowIds.remove(parentWindowId);
        for(String windowId:allwindowIds){
        	driver.switchTo().window(windowId);
        	
        }
        driver.findElement(By.id("nextStep")).click();
        driver.findElement(By.id("userName")).sendKeys("Abhishek");
        driver.findElement(By.id("accountNo")).sendKeys("1900000029305");
        driver.findElement(By.id("mobileNo")).sendKeys("8770710709");
        driver.findElement(By.id("datepicker5")).sendKeys("23/08/2001");
        driver.findElement(By.id("go")).click();
        
        
        
        
        
        
    }
}