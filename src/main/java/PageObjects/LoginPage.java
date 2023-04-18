package PageObjects;

import BrowserFactory.SingletonDriver;
import FrameworkClasses.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    WebDriver driver;
    public LoginPage()
    {
        //super(driver);
        //this.driver=driver;
        driver= SingletonDriver.getInstanceOfWebDriver().getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="username")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="submit")
    WebElement submitBtn;

    @FindBy(css = ".has-text-align-center")
    WebElement confirmationMessage;

    @FindBy(xpath = "//a[text()='Log out']")
    WebElement logOutBtn;


    public void typeUsername()
    {
        typeOnElement(username, "student");
    }

    public void typePassword()
    {
        typeOnElement(password, "Password123");
    }

    public void clickSubmitBtn()
    {
        clickOnElement(submitBtn);
    }

    public String getConfirmationMessage()
    {
        return getElementText(confirmationMessage);
    }

    public boolean isLogoutBtnDisplayed()
    {
        return isElementDisplayed(logOutBtn);
    }


}
