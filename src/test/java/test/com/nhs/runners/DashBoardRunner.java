package test.com.nhs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Dashboard.feature",//content root
        glue = "test/com/nhs/stepDefinition",
        dryRun = false,
        tags = "@Smoke",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}


)
public class DashBoardRunner {
}
