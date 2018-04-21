package cucumbersteps;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/features/MergeLeads.feature",glue={"cucumbersteps","pages"}, tags= "@Smoke", monochrome=true)
public class Runner {

}
