import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(ExtendedCucumber.class)

@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
//        retryCount = 0, // Number of times retry should happen in case of failure
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        jsonUsageReport = "target/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
        excludeCoverageTags = {""},//Tags which need to excluded from coverage Report
        includeCoverageTags = {"@passed"},//Tags which need to included into coverage Report
        outputFolder = "target")

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report",
                "json:target/cucumber.json", "html:target/site/cucumber-pretty", "json:target/cucumber/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:", "junit:target/cucumber.xml", "rerun:target/rerun.txt"},
        features = {"src/test/features"},
        glue = {"com/qa/newsteps"},
        monochrome = true, dryRun = false, strict = true,
        tags = {"@DoLoginNewCompany"}
)
public class TestRunner {
}


