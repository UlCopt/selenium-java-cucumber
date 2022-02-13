package pages;

public class CheckoutCompletePage extends BasePage{

    public String tittleHeader = "//h2[@class='complete-header']";

    public CheckoutCompletePage() {
        super(driver);
    }

    public String getTittleHeaderFinishOrder() {
        return getTextElement(tittleHeader);
    }
}
