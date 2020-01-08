package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositPage {
    @FindBy(id = "/html/body/div[3]/div/div[2]/div/div[4]/div/form/div/input")
    WebElement deposit;

    public void setDeposit(String setDeposit){
        deposit.clear();
        deposit.sendKeys(setDeposit);
    }
//    public void submitdeposit() {
//        .click();
//    }

}
