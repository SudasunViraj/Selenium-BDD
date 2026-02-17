package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductsPage extends BasePage {

    private final By title = By.cssSelector(".title");
    private final By cartIcon = By.cssSelector(".shopping_cart_link");
    private final By cartBadge = By.cssSelector(".shopping_cart_badge");

    public void assertOnDashboard() {
        assertTrue(isDisplayed(title), "Not redirected to Products page!");
    }

    public void addProductToCart(String productName) {
        // SauceDemo uses stable data-test attributes for automation
        String slug = productName.toLowerCase()
                .replaceAll("[^a-z0-9]+", "-")
                .replaceAll("(^-|-$)", "");

        By addBtn = By.cssSelector("[data-test='add-to-cart-" + slug + "']");
        click(addBtn);
    }

    public void openCart() {
        click(cartIcon);
    }

    public void assertCartBadgeCount(String expected) {
        String actual = driver().findElement(cartBadge).getText().trim();
        assertEquals(expected, actual, "Cart badge count mismatch!");
    }

        public void assertCartBadgeNotDisplayed() {
    try {
        driver().findElement(cartBadge).isDisplayed();
        throw new AssertionError("Cart badge is displayed but expected NOT to be displayed!");
    } catch (NoSuchElementException e) {
        // Expected: badge not present
    }
}
}
