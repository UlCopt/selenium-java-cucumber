package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("^I navigate to the Sauce Demo$")
    public void navigateToSauceLabs() {
        loginPage.navigateToSauceDemo();
    }

    @When("^I login with valid credentials (.+) and (.+)$")
    public void loginValidUser(String username, String password) {
        loginPage.putUserName(username);
        loginPage.putPassword(password);
        loginPage.clickLogin();
    }

    @Then("^I enter to the homepage$")
    public void iAmOnHomePage() {
        Assert.assertEquals("Error: I am not in the homepage","PRODUCTS", homePage.getTitlePage());
    }


}
