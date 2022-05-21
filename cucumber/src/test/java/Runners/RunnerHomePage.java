package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\mindsdet355\\Downloads\\cucumber\\src\\test\\resources\\Feature",glue= {"Stepdefinition"},
monochrome=true, dryRun = false, tags="@regression",
plugin= {"pretty","html:target/HtmlReports.html","json:target/cucumber.json"}
		)
public class RunnerHomePage{
	
}