package StepDefinitions;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class headerStepDefs {
    private static final SelenideElement siteLogo = $(By.cssSelector("#header .logo img"));
    private static final SelenideElement siteLogoLink = $(By.cssSelector("#header .logo a"));
    private static final SelenideElement homeButton = $(By.xpath("//a[text()=' Home']"));
    private static final SelenideElement productsButton =  $(By.xpath("//a[text()=' Products']"));
    private static final SelenideElement cartButton = $(By.xpath("//a[text()=' Cart']"));
    public static final SelenideElement authButton = $(By.cssSelector("#header .shop-menu > .nav > :nth-child(4) > a"));
    private static final SelenideElement testCasesButton = $(By.xpath("//a[text()=' Test Cases']"));
    private static final SelenideElement apiTestingButton = $(By.xpath("//a[text()=' API Testing']"));
    private static final SelenideElement videoTutorialsButton = $(By.xpath("//a[text()=' Video Tutorials']"));
    private static final SelenideElement contactButton = $(By.xpath("//a[text()=' Contact us']"));
    private static final SelenideElement deleteAccountButton = $(By.xpath("//a[text()=' Delete Account']"));
    public static final SelenideElement userNotification = $(By.cssSelector("#header .shop-menu > .nav > :nth-child(10) > a"));

    @Then("user observes site logo with the right link")
    public void userObservesSiteLogoWithTheRightLink() {
        siteLogo.shouldBe(visible);
        siteLogoLink.shouldHave(attribute("href", "https://automationexercise.com/"));
    }

    @And("user observes products button with the right link")
    public void userObservesProductsButtonWithTheRightLink() {
        productsButton.shouldBe(visible).shouldHave(attribute("href","https://automationexercise.com/products"))
                .shouldHave(text("\uE8F8 Products"));
    }

    @And("user observes cart button with the right link")
    public void userObservesCartButtonWithTheRightLink() {
        cartButton.shouldBe(visible).shouldHave(attribute("href","https://automationexercise.com/view_cart"))
                .shouldHave(text(" Cart"));
    }

    @And("user observes home button with the right link")
    public void userObservesHomeButtonWithTheRightLink() {
        homeButton.shouldBe(visible).shouldHave(attribute("href","https://automationexercise.com/"))
                .shouldHave(text(" Home"));
    }

    @And("user observes login button with the right link")
    public void userObservesLoginButtonWithTheRightLink() {
        authButton.shouldBe(visible).shouldHave(attribute("href","https://automationexercise.com/login"))
                .shouldHave(text(" Signup / Login"));
    }

    @And("user observes test cases button with the right link")
    public void userObservesTestCasesButtonWithTheRightLink() {
        testCasesButton.shouldBe(visible).shouldHave(attribute("href","https://automationexercise.com/test_cases"))
                .shouldHave(text(" Test Cases"));
    }

    @And("user observes api testing button with the right link")
    public void userObservesApiTestingButtonWithTheRightLink() {
        apiTestingButton.shouldBe(visible).shouldHave(attribute("href","https://automationexercise.com/api_list"))
                .shouldHave(text(" API Testing"));
    }

    @And("user observes video tutorials button with the right link")
    public void userObservesVideoTutorialsButtonWithTheRightLink() {
        videoTutorialsButton.shouldBe(visible).shouldHave(attribute("href","https://www.youtube.com/c/AutomationExercise"))
                .shouldHave(text(" Video Tutorials"));
    }

    @And("user observes contact us button with the right link")
    public void userObservesContactUsButtonWithTheRightLink() {
        contactButton.shouldBe(visible).shouldHave(attribute("href","https://automationexercise.com/contact_us"))
                .shouldHave(text(" Contact us"));
    }

    @And("user observes {int} navigation links")
    public void userObservesNavigationLinks(int linkNum) {
        $$("#header .shop-menu .nav a").shouldHave(size(linkNum));
    }

    @And("user observes logout button with the right link")
    public void userObservesLogoutButtonWithTheRightLink() {
        authButton.shouldBe(visible).shouldHave(attribute("href","https://automationexercise.com/logout"))
                .shouldHave(text(" Logout"));
    }

    @And("user observes delete account button with the right link")
    public void userObservesDeleteAccountButtonWithTheRightLink() {
        deleteAccountButton.shouldBe(visible).shouldHave(attribute("href","https://automationexercise.com/delete_account"))
                .shouldHave(text(" Delete Account"));
    }

    @And("user observes user notification")
    public void userObservesUserNotification() {
        userNotification.shouldBe(visible)
                .shouldHave(text(" Logged in as YUQGAUJZUser"));
    }
}
