package selfstudy.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic {
	public static WebDriver dr; {
		
	}
	public static void main(String[] args) {
		String browser="Edge";
		if (browser.equals("chrome")) {
			dr=new ChromeDriver();
			dr.manage().window().maximize();
			dr.get("https://www.apple.com/in/store?afid=p238%7Csfo291LJq-dc_mtid_187079nc38483_pcrid_694334137404_pgrid_109516736059_pntwk_g_pchan__pexid__ptid_kwd-12522920_&cid=aos-IN-kwgo-brand--slid---product-");
		}
		else if (browser.equals("FireFox")) {
			dr=new FirefoxDriver();
			dr.manage().window().maximize();
			dr.get("https://x.com/");
		}
		else if (browser.equals("Edge")) {
			dr=new EdgeDriver();
			dr.manage().window().maximize();
			dr.get("https://www.facebook.com/");
		}
		else {
			System.out.println("Invalide inpute");
		}
			
	}

}
