package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
	@CucumberOptions (features= {"src/test/resources/MXP/MX.feature"},glue={"definition"},plugin={"html:report/myreport.html"})
	public class test_runner{
    	
		
		
	}