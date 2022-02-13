package pages;

public class CheckoutInformationPage extends BasePage{

    public String firstName= "//input[@id='first-name']";
    public String lastName="//input[@id='last-name']";
    public String postalCode="//input[@id='postal-code']";
    public String continueButton= "//input[@id='continue']";

    public CheckoutInformationPage() {
        super(driver);
    }


    public void putFirstName(String text) {
        writeElement(firstName,text);
    }

    public void putLastName(String text) {
        writeElement(lastName, text);
    }

    public void putPostalCode(String text){
        writeElement(postalCode, text);
    }

    public void clickContinue() {
        clickElement(continueButton);
    }
}
