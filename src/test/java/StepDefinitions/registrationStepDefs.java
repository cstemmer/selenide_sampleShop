package StepDefinitions;

import static StepDefinitions.headerStepDefs.userNotification;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.*;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;


public class registrationStepDefs {
    private static final SelenideElement signupHeader = $(By.cssSelector("#form .signup-form :first-child"));
    private static final SelenideElement inputName = $(By.cssSelector("[data-qa=signup-name]"));
    private static final SelenideElement inputEmail = $(By.cssSelector("[data-qa=signup-email]"));
    private static final SelenideElement signupButton = $(By.cssSelector("[data-qa=signup-button]"));
    private static final SelenideElement formHeader = $(By.cssSelector(".login-form :nth-child(1) > b"));
    private static final SelenideElement genderTitle = $(By.cssSelector(".login-form .clearfix > :first-child"));
    private static final SelenideElement genderMaleTitle = $(By.cssSelector(".login-form [for=id_gender1]"));
    private static final SelenideElement genderFemaleTitle = $(By.cssSelector(".login-form [for=id_gender2]"));
    private static final SelenideElement maleRadio = $(By.cssSelector(".login-form .clearfix #id_gender1"));
    private static final SelenideElement femaleRadio = $(By.cssSelector(".login-form .clearfix #id_gender2"));
    private static final SelenideElement nameLabel = $(By.cssSelector(".login-form .required [for=name]"));
    private static final SelenideElement nameInput = $(By.cssSelector(".login-form [data-qa=name]"));
    private static final SelenideElement emailLabel = $(By.cssSelector(".login-form .required [for=email]"));
    private static final SelenideElement emailInput = $(By.cssSelector(".login-form [data-qa=email]"));
    private static final SelenideElement passwordLabel = $(By.cssSelector(".login-form .required [for=password]"));
    private static final SelenideElement passwordInput = $(By.cssSelector(".login-form [data-qa=password]"));
    private static final SelenideElement birthDateLabel = $(By.cssSelector(".login-form :nth-child(6) label"));
    private static final SelenideElement daySelector = $(By.cssSelector(".login-form #uniform-days select"));
    private static final SelenideElement monthSelector = $(By.cssSelector(".login-form #uniform-months select"));
    private static final SelenideElement yearSelector = $(By.cssSelector(".login-form #uniform-years select"));
    private static final SelenideElement newsletterCheckbox = $(By.cssSelector(".login-form #uniform-newsletter input"));
    private static final SelenideElement newsletterCheckboxLabel = $(By.cssSelector(".login-form [for=newsletter]"));
    private static final SelenideElement partnersCheckbox = $(By.cssSelector(".login-form #uniform-optin input"));
    private static final SelenideElement partnersCheckboxLabel = $(By.cssSelector(".login-form [for=optin]"));
    private static final SelenideElement addressHeader = $(By.cssSelector(".login-form > form > .title > b"));
    private static final SelenideElement firstNameLabel = $(By.cssSelector(".login-form [for=first_name]"));
    private static final SelenideElement firstNameField = $(By.cssSelector(".login-form [data-qa=first_name]"));
    private static final SelenideElement lastNameLabel = $(By.cssSelector(".login-form [for=last_name]"));
    private static final SelenideElement lastNameField = $(By.cssSelector(".login-form [data-qa=last_name]"));
    private static final SelenideElement companyLabel = $(By.cssSelector(".login-form [for=company]"));
    private static final SelenideElement companyField = $(By.cssSelector(".login-form [data-qa=company]"));
    private static final SelenideElement addressLine1Label = $(By.cssSelector(".login-form [for=address1]"));
    private static final SelenideElement addressLine1Info = $(By.cssSelector(".login-form [for=address1] .inline-infos"));
    private static final SelenideElement addressLine1Field = $(By.cssSelector(".login-form [data-qa=address]"));
    private static final SelenideElement addressLine2Label = $(By.cssSelector(".login-form [for=address2]"));
    private static final SelenideElement addressLine2Field = $(By.cssSelector(".login-form [data-qa=address2]"));
    private static final SelenideElement countryLabel = $(By.cssSelector(".login-form :nth-child(16) > label"));
    private static final SelenideElement countrySelector = $(By.cssSelector(".login-form [data-qa=country]"));
    private static final SelenideElement stateLabel = $(By.cssSelector(".login-form [for=state]"));
    private static final SelenideElement stateField = $(By.cssSelector(".login-form [data-qa=state]"));
    private static final SelenideElement cityLabel = $(By.cssSelector(".login-form form > :nth-child(18) label"));
    private static final SelenideElement cityField = $(By.cssSelector(".login-form form [data-qa=city]"));
    private static final SelenideElement zipcodeLabel = $(By.cssSelector(".login-form form > :nth-child(19) label"));
    private static final SelenideElement zipcodeField = $(By.cssSelector(".login-form [data-qa=zipcode]"));
    private static final SelenideElement phoneLabel = $(By.cssSelector(".login-form [for=mobile_number]"));
    private static final SelenideElement phoneField = $(By.cssSelector(".login-form [data-qa=mobile_number]"));
    private static final SelenideElement createAccountButton = $(By.cssSelector(".login-form [data-qa=create-account]"));
    private static final SelenideElement accountCreatedHeader = $(By.cssSelector("#form h2"));
    private static final SelenideElement continueButton = $(By.cssSelector("[data-qa=continue-button]"));
    static Faker faker = new Faker(new Locale("en-NZ"));
    public static final String newFirstName = faker.name().firstName();
    public static final String newLastName = faker.name().lastName();
    public static final String newAddress1 = faker.address().streetAddress();
    public static final String newAddress2 = faker.address().streetAddress();
    public static final String newEmail = faker.internet().emailAddress();
    public static final String newZipCode = faker.address().zipCode();
    public static final PhoneNumber newPhone = faker.phoneNumber();
    public static final int day = ThreadLocalRandom.current().nextInt(1, 31 + 1);
    public static final int month = ThreadLocalRandom.current().nextInt(1, 12 + 1);
    public static final int year = ThreadLocalRandom.current().nextInt(1, 100 + 1);

    @And("signup heading is visible")
    public void signupHeadingIsVisible() {
        signupHeader.shouldBe(visible).shouldHave(text("New User Signup!"));
    }

    @And("user inputs new unique name")
    public void userInputsNewUniqueName() {
        inputName.shouldBe(visible).shouldHave(attribute("placeholder", "Name"))
                .setValue(newFirstName);
    }


    @And("user inputs new unique email")
    public void userInputsNewUniqueEmail() {
        inputEmail.shouldBe(visible).shouldHave(attribute("placeholder", "Email Address"))
                .setValue(newEmail);
    }

    @And("user clicks signup button")
    public void userClicksSignupButton() {
        signupButton.shouldBe(visible).click();
    }

    @Then("user is redirected to signup url")
    public void userIsRedirectedToSignupUrl() {
        webdriver().shouldHave(url("https://automationexercise.com/signup"));
    }

    @And("page heading is visible")
    public void pageHeadingIsVisible() {
        formHeader.shouldBe(visible).shouldHave(text("Enter Account Information"));
    }

    @And("title heading is visible with two gender choices")
    public void titleHeadingIsVisibleWithTwoGenderChoices() {
        genderTitle.shouldBe(visible).shouldHave(text("Title"));
        genderMaleTitle.shouldBe(visible).shouldHave(text("Mr."));
        genderFemaleTitle.shouldBe(visible).shouldHave(text("Mrs."));
        maleRadio.shouldBe(visible);
        femaleRadio.shouldBe(visible);
    }

    @And("user selects female gender")
    public void userSelectsFemaleGender() {
        femaleRadio.shouldBe(visible).click();
    }

    @And("name input field contains previously inserted name")
    public void nameInputFieldContainsPreviouslyInsertedName() {
        nameLabel.shouldBe(visible).shouldHave(text("Name *"));
        nameInput.shouldBe(visible).shouldHave(attribute("value", newFirstName));
    }

    @And("email input field contains previously inserted email")
    public void emailInputFieldContainsPreviouslyInsertedEmail() {
        emailLabel.shouldBe(visible).shouldHave(text("Email *"));
        emailInput.shouldBe(visible).shouldHave(attribute("value", newEmail));
    }

    @And("user can input password")
    public void userCanInputPassword() {
        passwordLabel.scrollIntoView(true).shouldBe(visible).shouldHave(text("Password *"));
        passwordInput.shouldBe(visible).shouldHave(attribute("value", ""));
        passwordInput.setValue("Testtest1!");
    }

    @And("user can input date of birth")
    public void userCanInputDateOfBirth() {
        birthDateLabel.shouldBe(visible).shouldHave(text("Date of Birth"));
        daySelector.shouldBe(visible).shouldHave(text("Day"))
                .selectOption(day);
        monthSelector.shouldBe(visible).shouldHave(text("Month"))
                .selectOption(month);
        yearSelector.shouldBe(visible).shouldHave(text("Year"))
                .selectOption(year);
    }

    @And("user can check both checkboxes")
    public void userCanCheckBothCheckboxes() {
        newsletterCheckbox.shouldBe(visible).click();
        newsletterCheckboxLabel.shouldBe(visible)
                .shouldHave(text("Sign up for our newsletter!"));
        partnersCheckbox.shouldBe(visible).click();
        partnersCheckboxLabel.shouldBe(visible)
                .shouldHave(text("Receive special offers from our partners!"));
    }

    @And("address header is visible")
    public void addressHeaderIsVisible() {
        addressHeader.shouldBe(visible).shouldHave(text("Address Information"));
    }

    @And("user can input address details")
    public void userCanInputAddressDetails() {
        firstNameLabel.scrollIntoView(true).shouldBe(visible).shouldHave(text("First name *"));
        firstNameField.shouldBe(visible).shouldHave(attribute("value", ""))
                .setValue(newFirstName);
        lastNameLabel.shouldBe(visible).shouldHave(text("Last name *"));
        lastNameField.shouldBe(visible).shouldHave(attribute("value", ""))
                .setValue(newLastName);
        companyLabel.shouldBe(visible).shouldHave(text("Company"));
        companyField.shouldBe(visible).shouldHave(attribute("value", ""))
                .setValue("Google");
        addressLine1Label.shouldBe(visible).shouldHave(text("Address * "));
        addressLine1Info.shouldBe(visible).shouldHave(text("(Street address, P.O. Box, Company name, etc.)"))
                .shouldHave(cssValue("color", "rgba(241, 51, 64, 1)"));
        addressLine1Field.shouldBe(visible).shouldHave(attribute("value", ""))
                .setValue(newAddress1);
        addressLine2Label.shouldBe(visible).shouldHave(text("Address 2"));
        addressLine2Field.shouldBe(visible).shouldHave(attribute("value", ""))
                .setValue(newAddress2);
        countryLabel.shouldBe(visible).shouldHave(text("Country * "));
        countrySelector.shouldBe(visible).shouldHave(text("India"))
                .selectOption("New Zealand");
        stateLabel.shouldBe(visible).shouldHave(text("State * "));
        stateField.shouldBe(visible).shouldHave(attribute("value", ""))
                .setValue("Shire");
        cityLabel.shouldBe(visible).shouldHave(text("City * "));
        cityField.shouldBe(visible).shouldHave(attribute("value", ""))
                .setValue("Hobbiton");
        zipcodeLabel.shouldBe(visible).shouldHave(text("Zipcode * "));
        zipcodeField.shouldBe(visible).shouldHave(attribute("value", ""))
                .setValue(newZipCode);
        phoneLabel.shouldBe(visible).shouldHave(text("Mobile Number * "));
        phoneField.shouldBe(visible).shouldHave(attribute("value", ""))
                .setValue(String.valueOf(newPhone));
    }

    @Then("user clicks create account button")
    public void userClicksCreateAccountButton() {
        createAccountButton.shouldBe(visible).shouldHave(text("Create Account"))
                .click();
    }

    @And("user is redirected to success screen")
    public void userIsRedirectedToSuccessScreen() {
        webdriver().shouldHave(url("https://automationexercise.com/account_created"));
        accountCreatedHeader.shouldBe(visible).shouldHave(text("Account Created!"));
        $$("#form p")
                .shouldHave(texts( "Congratulations! Your new account has been successfully created!",
                        "You can now take advantage of member privileges to enhance your online shopping experience with us."));
        continueButton.shouldBe(visible).shouldHave(text("Continue"))
                .shouldHave(attribute("href", "https://automationexercise.com/"))
                .click();
    }

    @And("user sees welcome message with their name")
    public void userSeesWelcomeMessageWithTheirName() {
        userNotification.shouldBe(visible)
                .shouldHave(text(" Logged in as "+ newFirstName));
    }
}
