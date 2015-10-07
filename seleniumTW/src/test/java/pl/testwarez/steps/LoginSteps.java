package pl.testwarez.steps;

import pl.testwarez.objects.LoginPage;
import pl.testwarez.scenarios.LoginScenarios;

public class LoginSteps extends LoginScenarios {

    LoginPage loginPage;

    public LoginSteps() {
        loginPage = new LoginPage(driver);
    }
}
