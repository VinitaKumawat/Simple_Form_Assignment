package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = {"C:\\Users\\hp5cd\\OneDrive\\Desktop\\selenium Eclipse IDE\\AssignmentwithCucumber\\src\\test\\resources\\Feature_File"},
	    glue = {"StepDefinition"}    
	)
public class SimpleformTestRunner extends AbstractTestNGCucumberTests  {

	
}
