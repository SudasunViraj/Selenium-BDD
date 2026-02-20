package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.ProductsPage;

public class CartSteps {

    private final ProductsPage productsPage = new ProductsPage();
    private final CartPage cartPage = new CartPage();

    @When("user adds product {string} to the cart")
    public void user_adds_product_to_the_cart(String productName) {
        productsPage.addProductToCart(productName);
    }

    @When("user opens the cart")
    public void user_opens_the_cart() {
        productsPage.openCart();
    }

    @Then("cart badge should show {string}")
    public void cart_badge_should_show(String count) {
        productsPage.assertCartBadgeCount(count);
    }

    @Then("cart should contain product {string}")
    public void cart_should_contain_product(String productName) {
        cartPage.assertProductInCart(productName);
    }
}