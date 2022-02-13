package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/report.html"},
        features = "src/test/resources/features",
        monochrome = true,
        glue = "steps"
)


public class runner {
    @AfterClass
    public static void closeDriver() {
        BasePage.closeBrowser();
    }


}
