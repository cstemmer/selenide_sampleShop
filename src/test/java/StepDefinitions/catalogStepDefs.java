package StepDefinitions;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class catalogStepDefs {
    private static final SelenideElement categoriesHeading = $(By.cssSelector(".left-sidebar > :first-child"));
    private static final SelenideElement categoryWomenHeading = $(By.cssSelector(".left-sidebar > :nth-child(2) > :nth-child(1) h4"));
    private static final SelenideElement categoryWomenSubcategories = $(By.cssSelector(".left-sidebar > :nth-child(2) > :nth-child(1) li a"));
    private static final SelenideElement categoryMenHeading = $(By.cssSelector(".left-sidebar > :nth-child(2) > :nth-child(2) h4"));
    private static final SelenideElement categoryMenSubcategories = $(By.cssSelector(".left-sidebar > :nth-child(2) > :nth-child(2) li a"));
    private static final SelenideElement categoryKidsHeading = $(By.cssSelector(".left-sidebar > :nth-child(2) > :nth-child(3) h4"));
    private static final SelenideElement categoryKidsSubcategories = $(By.cssSelector(".left-sidebar > :nth-child(2) > :nth-child(3) li a"));
    private static final SelenideElement brandsHeading = $(By.cssSelector(".left-sidebar .brands_products h2"));
    private static final SelenideElement poloBrand = $(By.cssSelector(".brands-name ul > :nth-child(1) a"));
    private static final SelenideElement HMBrand = $(By.cssSelector(".brands-name ul > :nth-child(2) a"));
    private static final SelenideElement madameBrand = $(By.cssSelector(".brands-name ul > :nth-child(3) a"));
    private static final SelenideElement mastHarbourBrand = $(By.cssSelector(".brands-name ul > :nth-child(4) a"));
    private static final SelenideElement babyhugBrand = $(By.cssSelector(".brands-name ul > :nth-child(5) a"));
    private static final SelenideElement allenBrand = $(By.cssSelector(".brands-name ul > :nth-child(6) a"));
    private static final SelenideElement kookieBrand = $(By.cssSelector(".brands-name ul > :nth-child(7) a"));
    private static final SelenideElement bibaBrand = $(By.cssSelector(".brands-name ul > :nth-child(8) a"));
    private static final SelenideElement productsHeading = $(By.cssSelector(".features_items .title"));
    private static final SelenideElement productTile = $(By.cssSelector(".features_items .product-image-wrapper"));
    private static final SelenideElement overlay = $(By.cssSelector(".product-overlay"));


    @Then("user can observe categories heading")
    public void userCanObserveCategoriesHeading() {
        categoriesHeading.shouldBe(visible).shouldHave(text("Category"));
    }

    @And("three categories are displayed")
    public void threeCategoriesAreDisplayed() {
        $$(".left-sidebar > :nth-child(2) .panel").shouldHave(size(3));
    }

    @And("category Women heading is displayed")
    public void categoryWomenHeadingIsDisplayed() {
        categoryWomenHeading.shouldBe(visible).shouldHave(text("Women"));
    }

    @And("category Men heading is displayed")
    public void categoryMenHeadingIsDisplayed() {
        categoryMenHeading.shouldBe(visible).shouldHave(text("Men"));
    }

    @And("category Kids heading is displayed")
    public void categoryKidsHeadingIsDisplayed() {
        categoryKidsHeading.shouldBe(visible).shouldHave(text("Kids"));
    }
    
    @And("Women subcategories are not displayed")
    public void womenSubcategoriesAreNotDisplayed() {
        categoryWomenSubcategories.shouldNotBe(visible);
    }

    @And("Men subcategories are not displayed")
    public void menSubcategoriesAreNotDisplayed() {
        categoryMenSubcategories.shouldNotBe(visible);
    }

    @And("Kids subcategories are not displayed")
    public void kidsSubcategoriesAreNotDisplayed() {
        categoryKidsSubcategories.shouldNotBe(visible);
    }

    @Then("user clicks category Women heading")
    public void userClicksCategoryWomenHeading() {
        categoryWomenHeading.scrollIntoView(true).shouldBe(visible).click();
    }

    @And("category Women has three subcategories with correct links")
    public void categoryWomenHasThreeSubcategoriesWithCorrectLinks() {
        $$(".left-sidebar > :nth-child(2) > :nth-child(1) li a")
                .shouldHave(texts("Dress ", " Tops", " Saree"))
                .shouldHave(attributes("href", "/category_products/1", "/category_products/2", "/category_products/7"));
    }

    @Then("user clicks category Men heading")
    public void userClicksCategoryMenHeading() {
        categoryMenHeading.scrollIntoView(true).shouldBe(visible).click();
    }

    @Then("user clicks category Kids heading")
    public void userClicksCategoryKidsHeading() {
        categoryKidsHeading.scrollIntoView(true).shouldBe(visible).click();
    }

    @And("category Men has two subcategories with correct links")
    public void categoryMenHasTwoSubcategoriesWithCorrectLinks() {
        $$(".left-sidebar > :nth-child(2) > :nth-child(2) li a")
                .shouldHave(texts( "Tshirts ", "Jeans "))
                .shouldHave(attributes("href", "/category_products/3", "/category_products/6"));
    }

    @And("category Kids has two subcategories with correct links")
    public void categoryKidsHasTwoSubcategoriesWithCorrectLinks() {
        $$(".left-sidebar > :nth-child(2) > :nth-child(3) li a")
                .shouldHave(texts("Dress ", "Tops & Shirts "))
                .shouldHave(attributes("href", "/category_products/4", "/category_products/5"));
    }

    @Then("user can observe brands heading")
    public void userCanObserveBrandsHeading() {
        brandsHeading.shouldBe(visible).shouldHave(text("Brands"));
    }

    @And("user can observe brand Polo with number of articles")
    public void userCanObserveBrandPoloWithNumberOfArticles() {
        poloBrand.shouldBe(visible).should(matchText("\\(\\d\\)\nPOLO"))
                .shouldHave(attribute("href", "https://automationexercise.com/brand_products/Polo"));
    }

    @And("user can observe brand H&M with number of articles")
    public void userCanObserveBrandHMWithNumberOfArticles() {
        HMBrand.shouldBe(visible).should(matchText("\\(\\d\\)\nH&M"))
                .shouldHave(attribute("href", "https://automationexercise.com/brand_products/H&M"));
    }

    @And("user can observe brand Madame with number of articles")
    public void userCanObserveBrandMadameWithNumberOfArticles() {
        madameBrand.shouldBe(visible).should(matchText("\\(\\d\\)\nMADAME"))
                .shouldHave(attribute("href", "https://automationexercise.com/brand_products/Madame"));
    }

    @And("user can observe brand Mast&Harbour with number of articles")
    public void userCanObserveBrandMastHarbourWithNumberOfArticles() {
        mastHarbourBrand.shouldBe(visible).should(matchText("\\(\\d\\)\nMAST & HARBOUR"))
                .shouldHave(attribute("href", "https://automationexercise.com/brand_products/Mast%20&%20Harbour"));
    }

    @And("user can observe brand Babyhug with number of articles")
    public void userCanObserveBrandBabyhugWithNumberOfArticles() {
        babyhugBrand.shouldBe(visible).should(matchText("\\(\\d\\)\nBABYHUG"))
                .shouldHave(attribute("href", "https://automationexercise.com/brand_products/Babyhug"));
    }

    @And("user can observe brand Allen Solly with number of articles")
    public void userCanObserveBrandAllenSollyWithNumberOfArticles() {
        allenBrand.shouldBe(visible).should(matchText("\\(\\d\\)\nALLEN SOLLY JUNIOR"))
                .shouldHave(attribute("href", "https://automationexercise.com/brand_products/Allen%20Solly%20Junior"));
    }

    @And("user can observe brand Kookie kids with number of articles")
    public void userCanObserveBrandKookieKidsWithNumberOfArticles() {
        kookieBrand.shouldBe(visible).should(matchText("\\(\\d\\)\nKOOKIE KIDS"))
                .shouldHave(attribute("href", "https://automationexercise.com/brand_products/Kookie%20Kids"));
    }

    @And("user can observe brand Biba with number of articles")
    public void userCanObserveBrandBibaWithNumberOfArticles() {
        bibaBrand.shouldBe(visible).should(matchText("\\(\\d\\)\nBIBA"))
                .shouldHave(attribute("href", "https://automationexercise.com/brand_products/Biba"));
    }

    @Then("user can observe All Products heading")
    public void userCanObserveAllProductsHeading() {
        productsHeading.shouldBe(visible).shouldHave(text("All Products"));
    }

    @And("user can observe {int} product tiles")
    public void userCanObserveProductTiles(int count) {
        $$(".features_items .product-image-wrapper").shouldHave(size(count));
    }

    @And("within first product tile product image, price and name are visible")
    public void withinFirstProductTileProductImagePriceAndNameAreVisible() {
        productTile.find(By.cssSelector(".productinfo img")).shouldBe(visible)
                .shouldHave(attributeMatching("src", ".*picture.*"));
        productTile.find(By.cssSelector(".productinfo h2")).shouldBe(visible)
                .should(matchText("Rs. [0-9]{1,3}"));
        productTile.find(By.cssSelector(".productinfo p")).shouldBe(visible)
                .should(matchText("[A-Za-z]+"));
    }

    @And("within first product tile add to cart button is visible")
    public void withinFirstProductTileAddToCartButtonIsVisible() {
        productTile.find(By.cssSelector(".productinfo .add-to-cart")).shouldBe(visible)
                .shouldHave(text("Add to cart")).shouldBe(enabled);
    }

    @And("under the first product tile link to product page is visible and has right href")
    public void underTheFirstProductTileLinkToProductPageIsVisibleAndHasRightHref() {
        productTile.find(By.cssSelector(".choose a")).shouldBe(visible)
                .shouldHave(text("View Product"))
                .shouldHave(attributeMatching("href", ".*/product_details/.*"));
    }

    @And("within the hover overlay product price and name are visible")
    public void withinTheHoverOverlayProductPriceAndNameAreVisible() {
        productTile.scrollIntoView(true).hover();
        overlay.find(By.cssSelector("h2")).shouldBe(visible)
                .should(matchText("Rs. [0-9]{1,3}"));
        overlay.find(By.cssSelector("p")).shouldBe(visible)
                .should(matchText("[A-Za-z]+"));
    }

    @And("overlay contains add to cart button")
    public void overlayContainsAddToCartButton() {
        overlay.find(By.cssSelector(".add-to-cart")).shouldBe(visible)
                .shouldHave(text("Add to cart")).shouldBe(enabled);
    }
}
