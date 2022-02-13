package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.*;

public class CartSteps {

    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();
    CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage();
    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();


    @Then("^I select a product by the (.+) to checkout and process put the information (.+) (.+) (.+)$")
    public void processCheckout(String indexProduct, String firstName, String lastName, String postalCode ){
        homePage.addProductToTheCartByIndex(indexProduct);
        homePage.goToCart();
        cartPage.clickCheckoutButton();
        checkoutInformationPage.putFirstName(firstName);
        checkoutInformationPage.putLastName(lastName);
        checkoutInformationPage.putPostalCode(postalCode);
        checkoutInformationPage.clickContinue();
        Assert.assertEquals("Fail: Expected one product in the cart",1,checkoutOverviewPage.getItemsInCart());
        checkoutOverviewPage.clickFinish();
    }

    @And("^The checkout is successful$")
    public void checkoutSuccessful() {
        Assert.assertEquals("Fail: Expected one product in the cart","THANK YOU FOR YOUR ORDER",checkoutCompletePage.getTittleHeaderFinishOrder());
    }
}
