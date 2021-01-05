package methods;

import java.io.File;
import java.io.IOException;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import cucumber_selenium.Stepdefs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ScreenShotMethods implements BaseTest {
	WebDriver driver = Stepdefs.driver;

	/** Method to take screen shot and save the file */
	public void takeScreenShot(String string) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		try {
			String newfile = "./screenshots/" + string + ".png";
			FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(newfile));
		} catch (WebDriverException e) {

		} catch (IOException e) {

		}

	}

}
