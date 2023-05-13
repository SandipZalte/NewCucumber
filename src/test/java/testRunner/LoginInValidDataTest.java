package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/loginInvalidData.feature"}, 
													glue = {"stepdef" ,"CucumberHooks"},
													publish = true,
													//dryRun = false,			// means wich step missing in stepDefination Ord Scenrio step are missing that show in redish colour with "Null"
													//tags = "@smoke" ,
													//tags = "@regression" ,
													//tags = "@smoke and @regression" ,
													//tags = "@smoke" ,
													//tags = "not @regression" ,
													//tags = "not @smoke" ,
												plugin = { "pretty",
													//"html:target/MyReport/CucumberReport.html",
													"junit: target/MyReport/CucumberReport.junit",
												//	"json: target/MyReport/CucumberReport.json",
													//"junit: target/MyReport/CucumberReport.xml"
											}

)


public class LoginInValidDataTest {
	

}
