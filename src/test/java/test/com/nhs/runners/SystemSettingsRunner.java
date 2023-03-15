package test.com.nhs.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/SystemSetting.feature",//content
        glue = "test/com/nhs/stepDefinition",
        dryRun = false,
        tags = "@Smoke3",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)

public class SystemSettingsRunner {
}
