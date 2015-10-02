package pl.testwarez.objects;


import org.openqa.selenium.WebDriver;
import pl.testwarez.utils.SystemHelper;

public abstract class BasePage {

    protected WebDriver driver;
    protected String baseAddress = SystemHelper.getSystemPropertyOrDefault("Address", "http://192.168.0.108");
    protected String url;

    public BasePage(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
    }

    public void go() {
        driver.get(baseAddress + url);
    }
}
