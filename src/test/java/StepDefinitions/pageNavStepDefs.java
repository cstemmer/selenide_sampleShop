package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class pageNavStepDefs {
    @Given("^the user is on login page$")
    public void theUserIsOnLoginPage() {
        open("https://automationexercise.com/login");
    }

    @Given("the user is on home page")
    public void theUserIsOnHomePage() {
        open("https://automationexercise.com");
    }

    @When("user is on product catalog page")
    public void userIsOnProductCatalogPage() {
        open("https://automationexercise.com/products");
    }
}
