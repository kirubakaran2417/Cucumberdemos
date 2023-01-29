package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/mycontactform.feature"},
        glue = {"stepdefs"}
)
public class Testrunner {

}
