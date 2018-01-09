package StepsFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Steps {

	
	
	@Given("^User is  on Home page$")
	public void user_is_on_Home_page() throws Throwable {
		  System.out.println("User is on Home Page ");
	}

	@When("^user navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
		  System.out.println("User Navigate to Login Page ");
	    
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		  System.out.println("User Enters name & password ");
	  
	}

	@Then("^Message displayed login Succseefully$")
	public void message_displayed_login_Succseefully() throws Throwable {
		  System.out.println("Successfully Login ");
	   
	}
	
}
