package pages;

public class CheckoutOverviewPage extends BasePage{

    public String cartItems= "//div[@class='cart_item']";
    public String finishButton="//button[@id='finish']";


    public CheckoutOverviewPage() {
        super(driver);
    }

    public int getItemsInCart() {
        return getQtyElementsOnListElements(cartItems);
    }

    public void clickFinish() {
        clickElement(finishButton);
    }
}
