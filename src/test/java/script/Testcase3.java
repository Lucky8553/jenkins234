package script;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase3 {

	public WebDriver driver;
	
	@Test
	public void tc1() {
		Reporter.log("hello java",true);
	}
}
