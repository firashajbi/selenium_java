package cucumber_selenium;

//import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
// import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ById;
// import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;
import methods.BaseTest;
import methods.TestCaseFailed;

public class Stepdefs implements BaseTest {
    public static WebDriver driver;

    public Stepdefs() {
      driver=RunCucumberTest.driver;
    }

    @Then("I press enter in {string} {string}")
    public void press_Enter(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        navigationObj.press_Enter(string, string2);
    }

    // close browser and driver
    @Then("I close browser and driver")
    public void finish() {
        driver.close();
        driver.quit();
    }

    // Step to navigate to specified URL
    @Then("I navigate to {string}")
    public void navigate_to(String string) {
        navigationObj.navigateTo(string);
    }

    // steps to refresh page
    @Then("I refresh page")
    public void refresh_page() {
        driver.navigate().refresh();
    }

    // Step to navigate forward or backward
    @Then("I navigate {string}")
    public void navigate(String string) {
        navigationObj.navigate(string);
    }

    // Switch between windows:

    // Switch to new window
    @Then("I switch to new window")
    public void switch_to_new_window() {
        navigationObj.switchToNewWindow();
    }

    // Switch to old window
    @Then("I switch to previous window")
    public void switch_to_old_window() {
        navigationObj.switchToOldWindow();
    }

    // Switch to new window by window title
    @Then("I switch to window having title {string}")
    public void switch_to_window_by_title(String string) throws Exception {
        navigationObj.switchToWindowByTitle(string);
    }

    // Close new window
    @Then("I close new window")
    public void close_new_window() {
        navigationObj.closeNewWindow();
    }

    // Switch between frame

    // Step to switch to frame by web element
    @Then("I switch to frame having {string} {string}")
    public void switch_frame_by_element(String string, String string2) {
        navigationObj.switchFrame(string2, string2);
    }

    // step to switch to main content
    @Then("I switch to main content")
    public void switch_to_default_content() {
        navigationObj.switchToDefaultContent();
    }

    // To interact with browser

    // step to resize browser
    @Then("I resize browser window size to width {int} and height {int}")
    public void resize_browser(int integer, int integer2) {
        navigationObj.resizeBrowser(integer, integer2);
    }

    // step to maximize browser
    @Then("I maximize browser window")
    public void maximize_browser() {
        navigationObj.maximizeBrowser();
    }

    // Step to close the browser
    @Then("I close browser")
    public void close_browser() {
        navigationObj.closeDriver();
    }

    // zoom in/out page

    // steps to zoom in page
    @Then("I zoom in page")
    public void zoom_in() {
        navigationObj.zoomInOut("ADD");
    }

    // steps to zoom out page
    @Then("I zoom out page")
    public void zoom_out() {
        navigationObj.zoomInOut("SUBTRACT");
    }

    // zoom out webpage till necessary element displays

    // steps to zoom out till element displays
    @Then("I zoom out page till I see element having {string} {string}")
    public void zoom_till_element_display(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        navigationObj.zoomInOutTillElementDisplay(string, "substract", string2);
    }

    // reset webpage view use

    @Then("I reset page view")
    public void reset_page_zoom() {
        navigationObj.zoomInOut("reset");
    }

    // scroll webpage top/end

    @Then("I scroll to {string} of page")
    public void scroll_page(String string) throws Exception {
        navigationObj.scrollPage(string);
    }

    // scroll webpage to specific element

    @Then("I scroll to element having {string} {string}")
    public void scroll_to_element(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        navigationObj.scrollToElement(string, string2);
    }

    // hover over element

    // Note: Doesn't work on Windows firefox
    @Then("I hover over element having {string} {string}")
    public void hover_over_element(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        navigationObj.hoverOverElement(string, string2);
    }

    // Assertion steps

    /**
     * page title checking
     * 
     * @param present :
     * @param title   :
     */
    @Then("I should {string} see page title as {string}")
    public void check_title(String string, String string2) throws TestCaseFailed {
        // System.out.println("Present :" + present.isEmpty());
        assertionObj.checkTitle(string2, string.isEmpty());
    }

    // step to check element partial text
    @Then("I should {string} see page title having partial text as {string}")
    public void check_partial_text(String string, String string2) throws TestCaseFailed {
        // System.out.println("Present :" + present.isEmpty());
        assertionObj.checkPartialTitle(string2, string.isEmpty());
    }

    // step to check element text
    @Then("element having {string} {string} should {string} have text as {string}")
    public void check_element_text(String string, String string2, String string3, String string4) throws Exception {
        miscmethodObj.validateLocator(string);
        assertionObj.checkElementText(string, string4, string2, string3.isEmpty());
    }

    // step to check element partial text
    @Then("element having {string} {string} should {string} have partial text as {string}")
    public void check_element_partial_text(String string, String string2, String string3, String string4)
            throws Exception {
        miscmethodObj.validateLocator(string);
        assertionObj.checkElementPartialText(string, string4, string2, string3.isEmpty());
    }

    // step to check attribute value
    @Then("element having {string} {string} should {string} have attribute {string} with value {string}")
    public void check_element_attribute(String string, String string2, String string3, String string4, String string5)
            throws Exception {
        miscmethodObj.validateLocator(string);
        assertionObj.checkElementAttribute(string, string4, string5, string2, string3.isEmpty());
    }

    // step to check element enabled or not
    @Then("element having {string} {string} should be {string}")
    public void check_element_enable(String string, String string2, String string3) throws Exception {
        miscmethodObj.validateLocator(string);
        boolean flag = string3.equals("enabled");

        assertionObj.checkElementEnable(string, string2, flag);
    }

    // step to check element present or not
    @Then("element having {string} {string} should {string} be present")
    public void check_element_presence(String string, String string2, String string3) throws Exception {
        miscmethodObj.validateLocator(string);
        assertionObj.checkElementPresence(string, string2, string3.isEmpty());
    }

    // step to assert checkbox is checked or unchecked
    @Then("checkbox having {string} {string} should be {string}")
    public void is_checkbox_checked(String string, String string2, String string3) throws Exception {
        miscmethodObj.validateLocator(string);
        boolean flag = string3.equals("checked");
        assertionObj.isCheckboxChecked(string, string2, flag);
    }

    // steps to assert radio button checked or unchecked
    @Then("radio button having {string} {string} should be {string}")
    public void is_radio_button_selected(String string, String string2, String string3) throws Exception {
        miscmethodObj.validateLocator(string);
        boolean flag = string3.equals("selected");
        assertionObj.isRadioButtonSelected(string, string2, flag);
    }

    // steps to assert option by text from radio button group selected/unselected
    @Then("option {string} by {string} from radio button group having {string} {string} should be {string}")
    public void is_option_from_radio_button_group_selected(String string, String string2, String string3,
            String string4, String string5) throws Exception {
        miscmethodObj.validateLocator(string3);
        boolean flag = string5.equals("selected");
        assertionObj.isOptionFromRadioButtonGroupSelected(string3, string, string2, string4, flag);
    }

    // steps to check link presence
    @Then("link having text {string} should {string} be present")
    public void check_element_presence(String string, String string2) throws TestCaseFailed, Exception {
        assertionObj.checkElementPresence("linkText", string, string2.isEmpty());
    }

    // steps to check partail link presence
    @Then("link having partial text {string} should {string} be present")
    public void check_partial_element_presence(String string, String string2) throws TestCaseFailed, Exception {
        assertionObj.checkElementPresence("partialLinkText", string, string2.isEmpty());
    }

    // step to assert javascript pop-up alert text
    @Then("I should see alert text as {string}")
    public void check_alert_text(String string) throws TestCaseFailed {
        assertionObj.checkAlertText(string);
    }

    // step to select dropdown list
    @Then("option {string} by {string} from dropdown having {string} {string} should be {string}")
    public void is_option_from_dropdown_selected(String string, String string2, String string3, String string4,
            String string5) throws Exception {
        miscmethodObj.validateLocator(string3);
        boolean flag = string5.equals("selected");
        assertionObj.isOptionFromDropdownSelected(string3, string2, string, string4, flag);
    }

    // Input steps

    // enter text into input field steps
    @Then("I enter {string} into input field having {string} {string}")
    public void enter_text(String string, String string2, String string3) throws Exception {
        miscmethodObj.validateLocator(string2);
        inputObj.enterText(string2, string, string3);
    }

    // clear input field steps
    @Then("I clear input field having {string} {string}")
    public void clear_text(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        inputObj.clearText(string, string2);
    }

    // select option by text/value/index from dropdown
    @Then("I select {string} option by {string} from dropdown having {string} {string}")
    public void select_option_from_dropdown(String string, String string2, String string3, String string4)
            throws Exception {
        miscmethodObj.validateLocator(string3);
        miscmethodObj.validateOptionBy(string2);
        inputObj.selectOptionFromDropdown(string3, string2, string, string4);
    }

    // select option by text/value/index from multiselect
    @Then("I select {string} option by {string} from multiselect dropdown having {string} {string}")
    public void select_option_from_multiselect_dropdown(String string, String string2, String string3, String string4)
            throws Exception {
        miscmethodObj.validateLocator(string3);
        miscmethodObj.validateOptionBy(string2);
        inputObj.selectOptionFromDropdown(string3, string2, string, string4);
    }

    // deselect option by text/value/index from multiselect
    @Then("I deselect {string} option by {string} from multiselect dropdown having {string} {string}")
    public void deselect_option_from_multiselect_dropdown(String string, String string2, String string3, String string4)
            throws Exception {
        miscmethodObj.validateLocator(string3);
        miscmethodObj.validateOptionBy(string2);
        inputObj.deselectOptionFromDropdown(string3, string2, string, string4);
    }

    // step to select option from mutliselect dropdown list
    /*
     * @Then("^I select all options from multiselect dropdown having (.+) \"(.*?)\"$"
     * ) public void select_all_option_from_multiselect_dropdown(String type,String
     * accessName) throws Exception { miscmethodObj.validateLocator(type);
     * inputObj.select_all_option_from_multiselect_dropdown(type, accessName) ;}
     * 
     */
    // step to unselect option from mutliselect dropdown list
    @Then("I deselect all options from multiselect dropdown having {string} {string}")
    public void unselect_all_option_from_multiselect_dropdown(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        inputObj.unselectAllOptionFromMultiselectDropdown(string, string2);
    }

    // check checkbox steps
    @Then("I check the checkbox having {string} {string}")
    public void check_checkbox(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        inputObj.checkCheckbox(string, string2);
    }

    // uncheck checkbox steps
    @Then("I uncheck the checkbox having {string} {string}")
    public void uncheck_checkbox(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        inputObj.uncheckCheckbox(string, string2);
    }

    // steps to toggle checkbox
    @Then("I toggle checkbox having {string} {string}")
    public void toggle_checkbox(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        inputObj.toggleCheckbox(string, string2);
    }

    // step to select radio button
    @Then("I select radio button having {string} {string}")
    public void select_radio_button(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        inputObj.selectRadioButton(string, string2);
    }

    // steps to select option by text/value from radio button group
    @Then("I select {string} option by {string} from radio button group having {string} {string}")
    public void select_option_from_radio_btn_group(String string, String string2, String string3, String string4)
            throws Exception {
        miscmethodObj.validateLocator(string3);
        inputObj.selectOptionFromRadioButtonGroup(string3, string, string2, string4);
    }

    // Click element Steps

    // click on web element
    @Then("I click on element having {string} {string}")
    public void click(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        clickObj.click(string, string2);
    }

    // Forcefully click on element
    @Then("I forcefully click on element having {string} {string}")
    public void click_forcefully(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        clickObj.clickForcefully(string, string2);
    }

    // double click on web element
    @Then("I double click on element having {string} {string}")
    public void double_click(String string, String string2) throws Exception {
        miscmethodObj.validateLocator(string);
        clickObj.doubleClick(string, string2);
    }

    // steps to click on link
    @Then("I click on link having text {string}")
    public void click_link(String string) {
        clickObj.click("linkText", string);
    }

    // Step to click on partial link
    @Then("I click on link having partial text {string}")
    public void click_partial_link(String string) {
        clickObj.click("partialLinkText", string);
    }

    // Progress methods

    // wait for specific period of time
    @Then("I wait for {string} sec")
    public void wait(String string) throws NumberFormatException, InterruptedException {
        progressObj.wait(string);
    }

    // wait for specific element to display for specific period of time
    @Then("I wait {string} seconds for element having {string} {string} to display")
    public void i_wait_seconds_for_element_having_to_display(String string, String string2, String string3)
            throws Exception {
        miscmethodObj.validateLocator(string2);
        progressObj.waitForElementToDisplay(string2, string3, string);
    }

    // wait for specific element to enable for specific period of time
    @Then("I wait {string} seconds for element having {string} {string} to be enabled")
    public void i_wait_seconds_for_element_having_to_enabled(String string, String string2, String string3)
            throws Exception {
        miscmethodObj.validateLocator(string2);
        progressObj.waitForElementToClick(string2, string3, string);
    }

    // JavaScript handling steps

    // Step to handle java script
    @Then("I accept alert")
    public void handle_alert() {
        javascriptObj.handleAlert("accept");
    }

    // Steps to dismiss java script
    @Then("I dismiss alert")
    public void dismiss_alert() {
        javascriptObj.handleAlert("dismiss");
    }

    // Screen shot methods

    @Then("I take screenshot {string}")
    public void take_screenshot(String string) throws IOException {
        screenshotObj.takeScreenShot(string);
    }

    // Configuration steps

    // step to print configuration
    @Then("I print configuration")
    public void print_config() {
        configObj.printDesktopConfiguration();
    }

}
