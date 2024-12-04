package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("send2");

    public void enterLoginDetails() {
        driver.findElement(emailField).sendKeys("sagar.waje33@gmail.com");
        driver.findElement(passwordField).sendKeys("Sagar@03");
        driver.findElement(loginButton).click();
    }
}
