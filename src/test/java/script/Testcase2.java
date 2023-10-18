package script;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase2 {

	public WebDriver driver;
	
	@Test
	public void tc2() {
		Reporter.log("hello python",true);
	}
}
