package pl.testwarez.steps;


import org.jbehave.core.annotations.*;
import pl.testwarez.objects.LoginPage;
import pl.testwarez.scenarios.LoginScenarios;

public class LoginSteps extends LoginScenarios {

    LoginPage loginPage;

    public LoginSteps() {
        loginPage = new LoginPage(driver);
    }

    @Given("enter login $login")
    public void enterLogin(@Named("login") String value) {
        loginPage.go();
        loginPage.enterLogin(value);
    }

    @Given("enter password $password")
    public void enterPassword(@Named("password") String value) {
        loginPage.enterPassword(value);

    }

    @When("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user is logged")
    public void isLogged() {

    }
}
