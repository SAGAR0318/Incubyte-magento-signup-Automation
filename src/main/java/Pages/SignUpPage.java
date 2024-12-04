package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By email = By.id("email_address");
    private By password = By.id("password");
    private By confirmPassword = By.id("password-confirmation");
    private By submitButton = By.xpath("//button[@title='Create an Account']");

    public void enterSignUpDetails() {
        driver.findElement(firstName).sendKeys("Sagar");
        driver.findElement(lastName).sendKeys("Waje");
        driver.findElement(email).sendKeys("sagar.waje33@gmail.com");
        driver.findElement(password).sendKeys("Sagar@03");
        driver.findElement(confirmPassword).sendKeys("Sagar@03");
        driver.findElement(submitButton).click();
    }

}
