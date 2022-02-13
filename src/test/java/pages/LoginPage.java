package pages;

public class LoginPage extends BasePage {

    public String username = "//input[@id='user-name']";
    public String password = "//input[@id='password']";
    public String loginButton = "//input[@id='login-button']";
    public String loginMessage = "//form//h3";

    public LoginPage() {
        super(driver);
    }

    public void navigateToSauceDemo() {
        navigateTo("https://www.saucedemo.com/");
    }

    public void clickLogin(){
        clickElement(loginButton);
    }

    public void putUserName(String text) {
        writeElement(username,text);
    }

    public void putPassword(String text) {
        writeElement(password, text);
    }

    public String getInfoMessage() {
        return getTextElement(loginMessage);
    }

    public void validLoginToHomePage(String user, String pass) {
        writeElement(username,user);
        writeElement(password, pass);
    }



}
