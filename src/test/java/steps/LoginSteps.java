package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginSteps {

    private final LoginPage loginPage = new LoginPage();
    private final ProductsPage productsPage = new ProductsPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.open();
        loginPage.assertOnLoginPage();
    }

    @When("user enters username {string}")
    public void user_enters_username(String user) {
        loginPage.enterUsername(user);
    }

    @When("user enters password {string}")
    public void user_enters_password(String pass) {
        loginPage.enterPassword(pass);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should be redirected to dashboard")
    public void user_should_be_redirected_to_dashboard() {
        productsPage.assertOnDashboard();
    }

    @Given("user is logged in")
    public void user_is_logged_in() {
        loginPage.open();
        loginPage.assertOnLoginPage();
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        productsPage.assertOnDashboard();
    }

}
