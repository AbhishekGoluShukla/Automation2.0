package selfstudy.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VreifiTheTitle {
	public static WebDriver dr; {
		
	}
	public static void main(String[] args) {
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		System.out.println("The title of this page is:"+dr.getTitle());
		String Exceptedtitle="Facebook – log in or sign up";
		String ActualTitle=dr.getTitle();
		if(ActualTitle.equals(Exceptedtitle)) {
			System.out.println("The test case is pass");
		}
		else {
			System.out.println("The test case is Fail");
			
		}
				
	}

}
