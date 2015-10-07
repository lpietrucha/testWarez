package pl.testwarez.base;

import org.openqa.selenium.WebDriver;

public enum DriverFactory {
    FIREFOX, CHROME, OPERA, IE;

    public WebDriver getDriver() {
        WebDriver driver;
        driver = null;
        return driver;
    }
}
