package feature.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class LoginSteps {
	
	String isValidCredential = "wrong";
	String username = "";
	String password = "";
	
	@Given("a username '(.+)' and password '(.+)'")
	public void setCredential(String userName, String pswd){
		username = userName;
		password = pswd;
		System.out.println("Username retrived from feature file ----------------------->"+userName);
		System.out.println("Password retrived from feature file ----------------------->"+pswd);
	}
	
	@When("username '(.+)' and password '(.+)'")
	public void checkCredentials(String userName, String pswd){
		System.out.println("Username retrived from feature file ----------------------->"+userName);
		System.out.println("Password retrived from feature file ----------------------->"+pswd);
		if(userName.equals(username) && pswd.equals(password)){
			isValidCredential = "correct";
		}
		
	}
	
	@Then("^Show the home page$")
	public void showHomePage(){
		assertThat("correct",equalTo("correct"));
	}
}
