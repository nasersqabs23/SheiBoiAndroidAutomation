package com.raven.sheiboi.pages;

import com.raven.sheiboi.utilities.AppAuthentication;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class StartUpPage {

    public StartUpPage(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(name = "Login")
    public WebElement skipButton;

    @FindBy(name = "START")
    public WebElement guestButton;

    @FindBy(name = "Allow")
    public WebElement SheiBoiManagePhoneCallPopUpMsgAllow;

    @FindBy(name = "Deny")
    public WebElement SheiBoiManagePhoneCallPopUpMsgDeny;

    @FindBy(name = "Allow")
    public WebElement SheiBoiAccessLocationPopUpMsgAllow;

    @FindBy(name = "Deny")
    public WebElement SheiBoiAccessLocationPopUpMsgDeny;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
    public WebElement  drawerButton;

    @FindBy(name= "নতুন রিলিজ")
    public WebElement recentMenu;

    @FindBy(name= "বুক স্টোর")
    public WebElement bookStoreMenu;

    @FindBy(name= "প্রতিক্রিয়া")
    public WebElement feedBackMenu;

    @FindBy(name= "হেল্প")
    public WebElement helpMenu;

    @FindBy(name= "তথ্য")
    public WebElement infoMenu;

    @FindBy(name= "ওয়ালেট রিচার্জ")
    public WebElement walletRechargeMenu;

    @FindBy(name= "Later")
    public WebElement NewVersionAvailableLater;

    @FindBy(name = "Email")
    public WebElement userName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")
    public WebElement passWord;

    @FindBy(name = "Login")
    public WebElement loginButton;

    @AndroidFindBy(xpath= "//android.widget.ImageButton[@index='0']")
    public WebElement drawerMenuButton;

    @FindBy(name = "বুক স্টোর")
    public WebElement bookStoreMenuButton;



    public void navigateToLoginPage() throws MalformedURLException, InterruptedException {
        if (!AppAuthentication.isGuest()) {

            sleep(5000);
            SheiBoiManagePhoneCallPopUpMsgAllow.click();
            sleep(5000);
            SheiBoiAccessLocationPopUpMsgDeny.click();
            sleep(5000);
            skipButton.click();

        }
    }

    public void navigateToGuestLogin() throws MalformedURLException, InterruptedException {
        if (!AppAuthentication.isGuest()) {

            sleep(5000);
            SheiBoiManagePhoneCallPopUpMsgAllow.click();
            sleep(5000);
            SheiBoiAccessLocationPopUpMsgDeny.click();
            sleep(5000);
            guestButton.click();
            sleep(10000);

            //NewVersionAvailableLater.click();
            //sleep(5000);

        }
    }

    public void navigateToGuestRecentRelease() throws MalformedURLException, InterruptedException {
        if (!AppAuthentication.isGuest()) {

            sleep(5000);
            SheiBoiManagePhoneCallPopUpMsgAllow.click();
            sleep(5000);
            SheiBoiAccessLocationPopUpMsgDeny.click();
            sleep(5000);
            guestButton.click();
            sleep(5000);
            //NewVersionAvailableLater.click();
            //sleep(5000);
            drawerButton.click();
            recentMenu.click();
            sleep(5000);


        }
    }

    public void navigateToBookStorePage( ) throws MalformedURLException, InterruptedException {
        if (!AppAuthentication.isGuest()) {

           // sleep(5000);
            //NewVersionAvailableLater.click();
            sleep(5000);
            drawerButton.click();
            bookStoreMenu.click();

        }
    }
        public void navigateToBookStorePageUser(AppiumDriver driver) throws MalformedURLException, InterruptedException {
        if (!AppAuthentication.isGuest()){

            navigateToLoginPage();

            sleep(5000);

            userName.sendKeys("naser.bd.edu@gmail.com");

            driver.hideKeyboard();

            passWord.sendKeys("Abcd1234.");

            driver.hideKeyboard();

            loginButton.click();

            sleep(20000);

            drawerMenuButton.click();
            bookStoreMenuButton.click();

        }
    }

    public void navigateToFeedBackPage() throws MalformedURLException, InterruptedException {
        if (!AppAuthentication.isGuest()) {

            //sleep(5000);
            //NewVersionAvailableLater.click();
            sleep(5000);
            drawerButton.click();
            feedBackMenu.click();

        }
    }

    public void navigateToHelpPage() throws MalformedURLException, InterruptedException {
        if (!AppAuthentication.isGuest()) {

           // sleep(5000);
            //NewVersionAvailableLater.click();
            sleep(5000);
            drawerButton.click();
            helpMenu.click();

        }
    }

    public void navigateToInfoPage() throws MalformedURLException, InterruptedException {
        if (!AppAuthentication.isGuest()) {

            //sleep(5000);
          //  NewVersionAvailableLater.click();
            sleep(5000);
            drawerButton.click();
            infoMenu.click();

        }
    }

    public void navigateToWalletRechargePage() throws MalformedURLException, InterruptedException {
        if (!AppAuthentication.isGuest()) {

           // sleep(5000);
           // NewVersionAvailableLater.click();
            sleep(5000);
            drawerButton.click();
            sleep(5000);
            walletRechargeMenu.click();

        }
    }
}



