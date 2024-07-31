package selfstudy.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsDiaplay {
public static WebDriver driver; {
	}
public static void main(String[] args) throws InterruptedException {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
//is Display
boolean FaceBookLogo=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div/img")).isDisplayed();
if (FaceBookLogo==true) {
System.out.println("The Facebook Logo Is Present:");		}
else {
System.out.println("The Facebook Logo Is Not Present:");
		}
boolean forgetlink= driver.findElement(By.className("_6ltj")).isEnabled();
if (forgetlink==true) {
	System.out.println("The Link is Display");
}
else {
	System.out.println("The Link is  not Display");
}
Thread.sleep(2000);
driver.findElement(By.className("_6ltj")).click();	
	}


}
