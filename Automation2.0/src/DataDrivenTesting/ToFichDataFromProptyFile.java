package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ToFichDataFromProptyFile {
	public static WebDriver driver;{
		
	}

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\shubh\\Automation2.0\\Automation2.0\\Jars\\Test\\DemoWebShopPropertFile");
		FileInputStream fis=new FileInputStream(f);
		Properties por=new Properties();
		por.load(fis);
		String url=por.getProperty("url");
		System.out.println(url);
		System.out.println(por.getProperty("email"));
		System.out.println(por.getProperty("pass"));		
	}
}
