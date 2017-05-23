package com.raven.sheiboi.tests.registereduser;

import com.raven.sheiboi.pages.FeedbackPage;
import com.raven.sheiboi.pages.LoginPage;
import com.raven.sheiboi.pages.InfoPage;
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

public class InfoTest {

    AppiumDriver   driver;
    StartUpPage    startUpPage;
    InfoPage       infoPage;
    LoginPage      loginPage;

    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app =new AppInitializer();
        driver = app.getDriver();

        startUpPage = new StartUpPage(driver);
        loginPage = new LoginPage(driver);
        infoPage = new InfoPage(driver);

        startUpPage.navigateToLoginPage();
        loginPage.loginWithUserNameAndPassword("naser.bd.edu@gmail.com","Abcd1234.",driver);
        startUpPage.navigateToInfoPage();

    }
}
