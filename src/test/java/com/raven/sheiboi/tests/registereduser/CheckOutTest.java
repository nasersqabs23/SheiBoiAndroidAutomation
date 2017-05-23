package com.raven.sheiboi.tests.registereduser;

import com.raven.sheiboi.pages.LoginPage;
import com.raven.sheiboi.pages.CheckOutPage;
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

public class CheckOutTest {

    AppiumDriver   driver;
    StartUpPage    startUpPage;
    CheckOutPage   checkOutPage;
    LoginPage      loginPage;

    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app =new AppInitializer();
        driver = app.getDriver();

        startUpPage = new StartUpPage(driver);
        loginPage = new LoginPage(driver);
        checkOutPage = new CheckOutPage(driver);

        startUpPage.navigateToLoginPage();
        loginPage.loginWithUserNameAndPassword("naser.bd.edu@gmail.com","Abcd1234.",driver);
        startUpPage.navigateToBookStorePage();

    }

    @Test
    public void SheiBoiCheckOutFromDetailsTest() throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"Book Store", "RECENT", "1","আপাই তাপাই", "2","সুমিত্রা", "3","জল ঠোঁটে উড়ো মেঘ","Cart is empty."};

        assertArrayEquals(expectedArray, checkOutPage.SheiBoiCheckOutFromDetails(driver));

        driver.quit();

    }

    @Test
    public void SheiBoiCheckOutFromListTest() throws MalformedURLException, InterruptedException{

        checkOutPage.SheiBoiCheckOutFromList(driver);
        driver.quit();

    }
}
