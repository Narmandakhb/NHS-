package test.com.nhs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/nhs.feature",
        glue = "test/com/nhs/stepDefinition/LoginPageStepDef.java",
        dryRun = false,
        tags = "login",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}


)
public class Runner {
}
