package pages;

import manager.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        WebDriverManager webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        BasePage.wait = new WebDriverWait(driver, 10);
    }

    private WebElement findByXpath(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    private List<WebElement> getAllElements(String locator) {
        return driver.findElements(By.xpath(locator));
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }


    public void clickElement(String locator) {
        findByXpath(locator).click();
    }

    public void writeElement(String locator, String textToWrite) {
        findByXpath(locator).clear();
        findByXpath(locator).sendKeys(textToWrite);
    }

    public String getTextElement(String locator) {
        return findByXpath(locator).getText();
    }


    public void selectItemByIndex(int index, String locator)  {
        List<WebElement> elements = getAllElements(locator);
        for (int i = 0; i < elements.size(); i++) {
            if (i == index ) {
                System.out.println("aquir");
                elements.get(index).click();
            }
        }
    }

    public int getQtyElementsOnListElements(String locator) {
        List<WebElement> elements = getAllElements(locator);
        return elements.size();
    }


}
