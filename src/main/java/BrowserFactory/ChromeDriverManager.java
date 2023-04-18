package BrowserFactory;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{
    @Override
    protected void createDriver() {
        driver= new ChromeDriver();
    }
}
