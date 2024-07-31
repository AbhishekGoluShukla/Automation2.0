package Rstart;

import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;

public class LTD {
	public static WebDriver driver; {
		
	}
	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		int date=ldt.getDayOfMonth();
		System.out.println(date);
		ldt.getMonth().toString().toLowerCase(); 
		
	}

}
