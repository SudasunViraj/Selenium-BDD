package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import pages.CartPage;
import pages.CheckoutCompletePage;
import pages.CheckoutInfoPage;
import pages.CheckoutOverviewPage;

import java.util.Map;

public class CheckoutSteps {

    private final CartPage cartPage = new CartPage();
    private final CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage();
    private final CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
    private final CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    @And("user proceeds to checkout")
    public void user_proceeds_to_checkout() {
        cartPage.clickCheckout();
    }

    @And("user enters checkout details")
    public void user_enters_checkout_details(DataTable table) {
        Map<String, String> data = table.asMap(String.class, String.class);

        checkoutInfoPage.enterFirstName(data.get("firstName"));
        checkoutInfoPage.enterLastName(data.get("lastName"));
        checkoutInfoPage.enterPostalCode(data.get("postalCode"));
        checkoutInfoPage.clickContinue();
    }

    @And("user completes the checkout")
    public void user_completes_the_checkout() {
        checkoutOverviewPage.clickFinish();
    }

    @Then("order confirmation message should be displayed")
    public void order_confirmation_message_should_be_displayed() {
        checkoutCompletePage.assertOrderConfirmationDisplayed();
    }
}