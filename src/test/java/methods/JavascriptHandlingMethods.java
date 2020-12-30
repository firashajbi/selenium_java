package methods;

import cucumber_selenium.Stepdefs;
import org.openqa.selenium.WebDriver;

public class JavascriptHandlingMethods implements BaseTest {
	protected WebDriver driver = Stepdefs.driver;

	/**
	 * Method to handle alert
	 * 
	 * @param decision : String : Accept or dismiss alert
	 */
	public void handleAlert(String decision) {
		if (decision.equals("accept"))
			driver.switchTo().alert().accept();
		else
			driver.switchTo().alert().dismiss();
	}
}
