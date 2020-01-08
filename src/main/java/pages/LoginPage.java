package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class LoginPage {
    @FindBy(id = "userSelect")
    WebElement userSelect;
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/form/button")
    WebElement btnlogin;
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/strong/span")
    WebElement text;


    public void setUserName(String usenameInput) throws InterruptedException {
        Select userSelects = new Select(userSelect);
        Thread.sleep(2000);
        userSelects.selectByVisibleText(usenameInput);
    }

    public void submitlogin() {
        btnlogin.click();
    }
//    public void verify(String tx){
//        String txt = text.getText();
//        Assert.assertEquals(txt,tx);
//    }
}
