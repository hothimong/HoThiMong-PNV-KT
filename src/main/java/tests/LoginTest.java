package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends ProvideTest {
    @When("^I input user name as (.*)$")
    public void selectUserName(String username) throws InterruptedException {
        Thread.sleep(2000);
        getLoginPage().setUserName(username);
    }
    @And("^I submit login$")
    public void login(){
        getLoginPage().submitlogin();
    }
//    @Then("^I verify login success$")
//    public void verifyLogin(){
//      getLoginPage().verify("Harry Potter");
//    }

}
