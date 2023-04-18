package BrowserFactory;



public class DriverFactory {

    public static DriverManager getManager(String browserType)
    {
        DriverManager driverManager= null;
        if (browserType.equalsIgnoreCase("chrome"))
        {
            driverManager= new ChromeDriverManager();
        }else if (browserType.equalsIgnoreCase("firefox"))
        {
            driverManager= new FirefoxDriverManager();
        }return driverManager;
    }


}
