package pages;



public class HomePage extends BasePage {

    public String titleHomePage = "//span[@class='title']";
    public String cart = "//a[@class='shopping_cart_link']";
    public String productsOnPage = "//button[@class='btn btn_primary btn_small btn_inventory']";

    public HomePage() {

        super(driver);
    }

    public String getTitlePage() {
        return getTextElement(titleHomePage);
    }

    public void addProductToTheCartByIndex(String index) {
        int i=Integer.parseInt(index);
        selectItemByIndex(i-1, productsOnPage);
    }

    public void goToCart() {
        clickElement(cart);
    }







}
