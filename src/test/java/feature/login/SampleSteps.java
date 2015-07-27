package feature.login;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleSteps {

	String isValidCredential = "wrong";
	String username = "";
	String password = "";
	
	@Given("If user passes username '(.+)' and password '(.+)'")
	public void setCredential(String userName, String pswd){
		username = userName;
		password = pswd;
	}
	
	@When("If the username '(.+)' and password '(.+)'")
	public void checkCredentials(String userName, String pswd){
		if(userName.equals(username) && pswd.equals(password)){
			isValidCredential = "correct";
		}
		
	}
	
	@Then("^Show the home page to the user$")
	public void showHomePage(){
		assertThat("correct",equalTo("correct"));
	}
}
