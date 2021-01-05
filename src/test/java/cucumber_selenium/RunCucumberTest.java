package cucumber_selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-report/cucumber.json"})
public class RunCucumberTest {
    static WebDriver driver;
    @BeforeClass
    public static void beforeClass(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","/home/firas/Documents/work/java/selenium/cucumber_selenium/chromedriver");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @AfterClass
    public static void teardown(){
        driver.close();
        driver.quit();
    }
}
