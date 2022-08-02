package RunnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = "StepDefination", tags = "@smoke", plugin = { "pretty",
		"html:target/cucumber-reports/cucumber.html", 
		"json:target/cucumber-reports/cucumber.json"
		}

//        monochrome=false
//		dryRun=true

)

public class Runner {

}
