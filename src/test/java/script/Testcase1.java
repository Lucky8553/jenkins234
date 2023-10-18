package script;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase1 {

		public WebDriver driver;
		
		@Test
		public void tc1() {
			Reporter.log("hello selenium",true);
		}
}

