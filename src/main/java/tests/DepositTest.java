package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class DepositTest extends ProvideTest{
    @When("^I input deposit as (.*)$")
    public void setDeposit(String deposit) throws InterruptedException {
        Thread.sleep(2000);
        getDepositPage().setDeposit(deposit);
    }
//    @And("^I submit deposit$")
//    public void login(){
//        getDepositPage().();
//    }
}
