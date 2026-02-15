package pages;

import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartPage extends BasePage {

    private final By cartItems = By.cssSelector(".cart_item .inventory_item_name");

    public void assertProductInCart(String productName) {
        boolean found = driver().findElements(cartItems)
                .stream()
                .anyMatch(el -> el.getText().trim().equals(productName));

        assertTrue(found, "Product not found in cart: " + productName);
    }
}
