package steps;

import com.devlab.core.UIHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User navigates to the application")
    public void user_navigates_to_the_application() {
        UIHandler.openApplication();

    }
    @When("User provides credentials {string}")
    public void user_provides_valid_credentials(String loginId) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(loginId);
    }
    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions

    }
}
