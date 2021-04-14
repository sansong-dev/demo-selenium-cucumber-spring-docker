package demo.spring.selenium.docker.stepdefinitions;

import demo.spring.selenium.docker.pages.HomePage;
import io.cucumber.java.en.Given;

public class HomeSteps {

    private HomePage homePage = new HomePage(Hooks.driver);

    @Given("^I open Login Page$")
    public void iOpenLoginPage() {
        homePage.clickFormAuthentication();
    }
}
