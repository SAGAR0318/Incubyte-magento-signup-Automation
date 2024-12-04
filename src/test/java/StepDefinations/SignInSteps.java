package StepDefinations;

import Pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInSteps {

    WebDriver driver;
    SignInPage SignInPage;

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
//
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\TEst123\\chromedriver-win64(1)\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
        SignInPage = new SignInPage(driver);
    }

    @When("the user enters valid credentials")
    public void userEntersValidCredentials() {
        SignInPage.enterLoginDetails();
    }

    @Then("the user should be redirected to the dashboard")
    public void verifyLoginSuccess() {
        // Verification logic here (check for dashboard or welcome message).
        driver.quit();
    }
}
