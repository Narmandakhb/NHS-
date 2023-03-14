package test.com.nhs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/AddPatient.feature",
        glue="test/com/nhs/stepDefinition",
        dryRun = false,
        tags= "@Smoke2",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
        public class AddPatientRunner {
}
