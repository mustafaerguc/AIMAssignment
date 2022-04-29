package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//running scenarios with Junit
// we have features and glue to define which features and step definitions we want to run
// we can add tags,plugin etc.
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "step_definitions"

)
public class Runner {
}
