package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;

import static StepDefinitions.headerStepDefs.authButton;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class loginStepdefs {
    private static final SelenideElement loginInput = $(By.cssSelector("[data-qa=login-email]"));
    private static final SelenideElement passwordInput = $(By.cssSelector("[data-qa=login-password]"));
    private static final SelenideElement submitButton = $(By.cssSelector("[data-qa=login-button]"));
    private static final SelenideElement errorMessage = $(By.cssSelector(".login-form form p"));

    @When("^user inputs (valid|invalid) email$")
    public void userInputsValidEmail(String isValid) {
        String email  = isValid.equals("valid") ? "jjvwpyqcbp@test.com" : "invalidemail@test.com";
        loginInput.shouldBe(visible).setValue(email);
    }

    @And("user inputs valid password")
    public void userInputsValidPassword() {
        passwordInput.shouldBe(visible)
                .setValue("Testtest1!");
    }

    @And("user clicks submit button")
    public void userClicksSubmitButton() {
       submitButton.shouldBe(visible)
                .click();
    }

    @Then("user is logged in")
    public void userIsLoggedIn() {
        authButton.shouldBe(visible)
                .shouldHave(attribute("href",
                        "https://automationexercise.com/logout"))
                .shouldHave(text(" Logout"));

    }

    @And("^user inputs (valid|invalid) password")
    public void userInputsValidPassword(String isValid) {
        String password  = isValid.equals("valid") ? "Testtest1!" : "invalidpwd1";
        passwordInput.shouldBe(visible).setValue(password);
    }

    @Then("user is not logged in")
    public void userIsNotLoggedIn() {
        authButton.shouldBe(visible)
                .shouldHave(attribute("href",
                        "https://automationexercise.com/login"))
                .shouldHave(text(" Signup / Login"));
    }

    @And("user sees error message")
    public void userSeesErrorMessage() {
        errorMessage.shouldBe(visible)
                .shouldHave(text("Your email or password is incorrect!"))
                .shouldHave(attribute("style", "color: red;"));
    }

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        open("https://automationexercise.com/login");
        loginInput.shouldBe(visible).setValue("jjvwpyqcbp@test.com");
        passwordInput.shouldBe(visible).setValue("Testtest1!");
        submitButton.shouldBe(visible).click();
    }

    @Then("user clicks logout button")
    public void userClicksLogoutButton() {
        authButton.shouldBe(visible)
                .shouldHave(attribute("href",
                        "https://automationexercise.com/logout"))
                .shouldHave(text(" Logout")).click();
    }
}
