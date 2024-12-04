package StepDefinations;

import Pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpSteps {
    WebDriver driver;
    SignUpPage SignUpPage;

    @Given("the user is on the sign-up page")
    public void userIsOnSignUpPage() {
//
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\TEst123\\chromedriver-win64(1)\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        SignUpPage = new SignUpPage(driver);
    }

    @When("the user provides valid sign-up details")
    public void userProvidesValidDetails() {
        SignUpPage.enterSignUpDetails();
    }

    @Then("the account should be created successfully")
    public void verifyAccountCreation() {
        // Verification logic here (check for account page title or success message).
        driver.quit();
    }
}
