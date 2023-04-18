package steps;

import BrowserFactory.SingletonDriver;
import PageObjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;


    @Before
    public void setUp()
    {
        driver= SingletonDriver.getInstanceOfWebDriver().getDriver();
        loginPage= new LoginPage();
    }

    @After
    public void tearDown()
    {
        driver.close();
    }

    @Given("I have navigated to the login page")
    public void i_have_navigated_to_the_login_page() {
        loginPage.navigateTo("https://practicetestautomation.com/practice-test-login/");
    }
    @When("I enter a valid username")
    public void i_enter_a_valid_username() {
        loginPage.typeUsername();

    }
    @And("I enter a valid password")
    public void i_enter_a_valid_password() {
        loginPage.typePassword();
    }
    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {

        loginPage.clickSubmitBtn();
    }
    @Then("I am directed to logged in page")
    public void i_am_directed_to_logged_in_page() {
       String currentURL= loginPage.getCurrentUrl();
       Assert.assertTrue(currentURL.contains("practicetestautomation.com/logged-in-successfully/"));
    }
    @And("The new page contains expected text")
    public void the_new_page_contains_expected_text() {
        String expectedText= "Congratulations";
        String actualText= loginPage.getConfirmationMessage();
        Assert.assertTrue(actualText.contains(expectedText));

    }
    @And("The new page has a Log out button")
    public void the_new_page_has_a_log_out_button() {
        Assert.assertTrue(loginPage.isLogoutBtnDisplayed());
    }

}
