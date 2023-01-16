package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pojo.QaUser;
import services.QaUserServices;

public class SimpleCRUDSteps {

    private QaUser qaUser;
    private QaUserServices qaUserServices;

    @Given("the user wants to create a new user")
    public void theUserWantsToCreateANewUser() {
         qaUser = new QaUser();
         qaUserServices = new QaUserServices();
    }

    @And("the user fills field {string} with value equal {string}")
    public void theUserFillsFieldWithValueEqual(String field, String value) {
            qaUserServices.fillFields(qaUser,field, value);
    }

    @When("the user saves see {string} message")
    public void theUserSaveNewUser() {
        qaUserServices.post(qaUser);

    }

    @Then("the user should see {string} message")
    public void theUserShouldSeeMessage(String message) {
        Assert.assertEquals(qaUserServices.getFromMessageToStatus(message),
                qaUserServices.getResponse().getStatusCode());
    }
}
