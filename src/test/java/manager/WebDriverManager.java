package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    private WebDriver driver;
    String browser = System.getProperty("browser","local-chrome");

    private static final String LOCAL_CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

    public WebDriver getDriver() {
        switch (browser.toLowerCase().trim()) {
            case "local-chrome-macos-m1":
                if (driver == null) driver = createChromeDriverLocalMacosM1();
                return driver;

            case "local-chrome-macos-x64":
                if (driver == null) driver = createChromeDriverLocalMacosX64();
                return driver;

            default:
                throw new Error("Error: Browser selected not found");
        }
    }

    private WebDriver createChromeDriverLocalMacosM1() {
        System.setProperty(LOCAL_CHROME_DRIVER_PROPERTY, "src/test/resources/webdriver/macos/chromedriverM1");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    private WebDriver createChromeDriverLocalMacosX64() {
        System.setProperty(LOCAL_CHROME_DRIVER_PROPERTY, "src/test/resources/webdriver/macos/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }


}
