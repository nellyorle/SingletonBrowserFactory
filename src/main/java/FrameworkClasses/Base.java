package FrameworkClasses;

import BrowserFactory.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
    public WebDriver driver;

    public Base()
    {
        driver= SingletonDriver.getInstanceOfWebDriver().getDriver();
       // this.driver=driver;
    }

    public void clickOnElement(WebElement element)
    {
        element.click();
    }

    public void typeOnElement(WebElement element, String text)
    {
        element.sendKeys(text);
    }

    public void navigateTo(String url)
    {
        driver.get(url);
    }

    public String getCurrentUrl()
    {
        return driver.getCurrentUrl();
    }

    public String getElementText(WebElement element)
    {
        return element.getText();
    }

    public boolean isElementDisplayed(WebElement element)
    {
        return element.isDisplayed();
    }
}
