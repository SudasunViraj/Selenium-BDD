package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.ProductsPage;

public class RemoveFromCartSteps {

    private final ProductsPage productsPage = new ProductsPage();
    private final CartPage cartPage = new CartPage();

    @When("user opens the cart")
    public void user_opens_the_cart() {
        productsPage.openCart();
    }

    @When("user removes product {string} from the cart")
    public void user_removes_product_from_the_cart(String productName) {
        cartPage.removeProduct(productName);
    }

    @Then("cart badge should not be displayed")
    public void cart_badge_should_not_be_displayed() {
        productsPage.assertCartBadgeNotDisplayed();
    }
}
