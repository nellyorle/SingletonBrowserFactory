package BrowserFactory;

import org.openqa.selenium.WebDriver;

public class SingletonDriver {

    private static SingletonDriver instanceOfSingletonClass= null;
    private static WebDriver driver= null;
    private BrowserFactory.DriverManager driverManager;

    private SingletonDriver()
    {
        driverManager= DriverFactory.getManager("firefox");
        driver= driverManager.getDriver();
    }

    public static SingletonDriver getInstanceOfWebDriver() //create instance of class
    {
        if (instanceOfSingletonClass==null)
        {
            instanceOfSingletonClass= new SingletonDriver();
        }return instanceOfSingletonClass;
    }

    public WebDriver getDriver()
    {
        if (driver==null)
        {
            driverManager=DriverFactory.getManager("firefox");
            driver= driverManager.getDriver();
        } return driver;
    }

}
