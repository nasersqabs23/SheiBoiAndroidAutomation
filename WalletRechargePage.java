package com.raven.sheiboi.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class WalletRechargePage {

    public WalletRechargePage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @FindBy(name= "Wallet Recharge")
    public WebElement assertWalletRecharge;

    @FindBy(name= "New Recharge")
    public WebElement assertNewRecharge;

    @FindBy(name= "Card No")
    public WebElement assertCardNo;

    @FindBy(name= "PIN")
    public WebElement assertPin;

    @FindBy(name= "Ok")
    public WebElement okButton;

    @FindBy(name= "Submit")
    public WebElement  SubmitButton;

    @FindBy(name= "Please enter Card No.")
    public WebElement popUpMsgForBlankCard;

    @FindBy(name= "Please enter PIN.")
    public WebElement popUpMsgForBlankPin;

    @FindBy(name= "Ok")
    public WebElement popUpMsgForBlankCardOk;

    @FindBy(name= "Ok")
    public WebElement popUpMsgForBlankPinOk;

    @FindBy(name= "Current balance is 50.0৳")
    public WebElement assertCurrentBalance;


    public String[] walletRechargePage()throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[3];

        //resultArray [0] = assertWalletRecharge.getText();

        resultArray [0] = assertNewRecharge.getText();

        resultArray [1] = assertCardNo.getText();

        resultArray [2] = assertPin.getText();

        return resultArray;

    }

    public String[] walletRechargePageBlankCard()throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[4];

        //resultArray [0] = assertWalletRecharge.getText();

        resultArray [0] = assertNewRecharge.getText();

        resultArray [1] = assertCardNo.getText();

        resultArray [2] = assertPin.getText();

        SubmitButton.click();

        resultArray [3] = popUpMsgForBlankCard.getText();

        popUpMsgForBlankCardOk.click();

        return resultArray;

    }

    public String[] walletRechargePageBlankPin(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[5];

        resultArray [0] = assertWalletRecharge.getText();

        resultArray [1] = assertNewRecharge.getText();

        resultArray [2] = assertCardNo.getText();

        resultArray [3] = assertPin.getText();

        assertCardNo.sendKeys("15151515");

        driver.hideKeyboard();

        okButton.click();

        resultArray [4] = popUpMsgForBlankPin.getText();

        popUpMsgForBlankPinOk.click();

        return resultArray;

    }

    public String[] walletRechargeSuccess(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[5];

        resultArray [0] = assertWalletRecharge.getText();

        resultArray [1] = assertNewRecharge.getText();

        resultArray [2] = assertCardNo.getText();

        resultArray [3] = assertPin.getText();

        assertCardNo.sendKeys("12121212");
        driver.hideKeyboard();
        assertPin.sendKeys("1212");
        driver.hideKeyboard();

        okButton.click();

        resultArray [4] = assertCurrentBalance.getText();


        return resultArray;

    }
}
