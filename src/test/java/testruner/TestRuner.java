package testruner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)

@CucumberOptions(features = "E:\\PROJECT WORK\\MAI_myproject.ai\\src\\test\\resources\\MAI\\MAI POST PROJECT.feature",monochrome = true,
dryRun = !true,glue = "stepruner",plugin = "pretty",snippets = SnippetType.CAMELCASE)

public class TestRuner {
	
	
	
	
	

}
