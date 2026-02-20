package pages;

import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartPage extends BasePage {

    private final By cartItems = By.cssSelector(".cart_item .inventory_item_name");
    private final By checkoutBtn = By.cssSelector("[data-test='checkout']");

    public void assertProductInCart(String productName) {
        boolean found = driver().findElements(cartItems)
                .stream()
                .anyMatch(el -> el.getText().trim().equals(productName));

        assertTrue(found, "Product not found in cart: " + productName);
    }

    public void clickCheckout() {
        click(checkoutBtn);
    }

    // Optional: remove product (if you already added earlier)
    public void removeProduct(String productName) {
        By removeBtn = By.xpath(
                "//div[@class='cart_item' and .//div[@class='inventory_item_name' and normalize-space()='" + productName + "']]"
                        + "//button[normalize-space()='Remove']"
        );
        click(removeBtn);
    }
}