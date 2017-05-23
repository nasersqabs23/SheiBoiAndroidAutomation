package com.raven.sheiboi.tests.registereduser;

import com.raven.sheiboi.pages.FeedbackPage;
import com.raven.sheiboi.pages.LoginPage;
import com.raven.sheiboi.pages.WalletRechargePage;
import com.raven.sheiboi.pages.StartUpPage;
import com.raven.sheiboi.utilities.AppInitializer;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import  java.io.File;
import  java.net.URL;
import java.net.MalformedURLException;

import static org.junit.Assert.assertArrayEquals;

public class WalletRechargeTest {

    AppiumDriver   driver;
    StartUpPage    startUpPage;
    WalletRechargePage   walletRechargePage;
    LoginPage      loginPage;

    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app =new AppInitializer();
        driver = app.getDriver();

        startUpPage = new StartUpPage(driver);
        loginPage = new LoginPage(driver);
        walletRechargePage = new WalletRechargePage(driver);

        startUpPage.navigateToLoginPage();
        loginPage.loginWithUserNameAndPassword("shajib2018@gmail.com","123456",driver);
        startUpPage.navigateToWalletRechargePage();

    }

    @Test
    public void walletRechargePageTest()throws MalformedURLException, InterruptedException{

        //String[] expectedArray = {"Wallet Recharge", "New Recharge", "Card No", "PIN"};
        String[] expectedArray = {"New Recharge", "Card No", "PIN"};

        assertArrayEquals(expectedArray, walletRechargePage.walletRechargePage());

    }

    @Test
    public void walletRechargePageBlankCardTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"New Recharge", "Card No", "PIN", "Please enter Card No."};

        assertArrayEquals(expectedArray, walletRechargePage.walletRechargePageBlankCard());

    }

    @Test
    public void walletRechargePageBlankPinTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"Wallet Recharge", "New Recharge", "Card No", "PIN", "Please enter PIN."};

        assertArrayEquals(expectedArray, walletRechargePage.walletRechargePageBlankPin(driver));

    }

    @Test
    public void walletRechargeSuccessTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"Wallet Recharge", "New Recharge", "Card No", "PIN", "Current balance is 50.0৳"};

        assertArrayEquals(expectedArray, walletRechargePage.walletRechargeSuccess(driver));

    }

    @After
    public void tearDown(){

        driver.quit();

    }

}
