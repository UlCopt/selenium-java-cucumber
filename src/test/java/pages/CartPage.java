package pages;

public class CartPage extends BasePage{

    public String cartCheckoutButton = "//button[@id='checkout']";

    public CartPage() {
        super(driver);
    }

    public void clickCheckoutButton() {
        clickElement(cartCheckoutButton);
    }

}
