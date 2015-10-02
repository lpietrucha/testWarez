package pl.testwarez.base;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum DriverFactory {
    FIREFOX, CHROME, OPERA, IE;

    public WebDriver getDriver() {
        WebDriver driver;

        switch (this) {
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case CHROME:
                System.setProperty("webdriver.chrome.driver", SystemUtils.IS_OS_LINUX ? "chromedriver" : "chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case OPERA:
                driver = new OperaDriver();
                break;
            case IE:
                System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
                DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
                driver = new InternetExplorerDriver(ieCapabilities);
                break;
            default:
                throw new IllegalStateException("No matching browser type found");
        }

        return driver;
    }
}
