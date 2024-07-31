package TestScript;

import FramWorkPackeg.ExalUtlite;
import GenericUtility.BaseClass;
import elementRepository.BasePage;

public class TC001 extends BaseClass {
	public static void main(String[] args) {
		openBrowse();
		driver.get("https://demowebshop.tricentis.com/register");
		BasePage bp=new BasePage(driver);
		bp.getRegisterLink().click();
		bp.getBookLink().click();
		ExalUtlite.readDataFromExal(null, 0, 0);
	}

}
