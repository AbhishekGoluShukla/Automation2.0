package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc002 {
	@Test(priority = -4)
	public void excuteScript1() {
		Reporter.log("BO$$1", true);
	}
	@Test(priority = -1)
	public void excuteScript2() {
		Reporter.log("BO$$2", true);
	}
	@Test(priority = -5)//less priority excute 1. 
	public void excuteScript3() {
		Reporter.log("BO$$3", true);
	}

}
