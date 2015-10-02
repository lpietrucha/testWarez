package pl.testwarez.scenarios;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.testwarez.base.DriverFactory;
import pl.testwarez.objects.LoginPage;
import pl.testwarez.utils.SystemHelper;

public class LoginFunctionalTests {

    public static String browserName = SystemHelper.getSystemPropertyOrDefault("Browser", "FIREFOX");
    public static WebDriver driver = DriverFactory.valueOf(browserName).getDriver();

	LoginPage loginPage = new LoginPage(driver);

    @Test
    public void firstFunctionalTest() {
    	loginPage.go();
        loginPage.enterLogin("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();
    }
}