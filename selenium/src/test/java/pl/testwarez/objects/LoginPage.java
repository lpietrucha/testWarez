package pl.testwarez.objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private static final String url = "/users/sign_in";

    public LoginPage(WebDriver driver) {
        super(driver, url);
    }

    public void enterLogin(String login) {
        driver.findElement(By.id("user_login")).sendKeys(login);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("user_password")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.name("commit")).click();
    }
}
