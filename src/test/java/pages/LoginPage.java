package pages;

import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends BasePage {

    private final String url = "https://www.saucedemo.com/";

    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginBtn = By.id("login-button");

    public void open() {
        driver().get(url);
    }

    public void assertOnLoginPage() {
        assertTrue(isDisplayed(loginBtn), "Login page not loaded!");
    }

    public void enterUsername(String user) { 
        type(username, user); }
    public void enterPassword(String pass) { 
        type(password, pass); }
    public void clickLogin() { 
        click(loginBtn); }
}
