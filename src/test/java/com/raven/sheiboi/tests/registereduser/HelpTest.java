package com.raven.sheiboi.tests.registereduser;

import com.raven.sheiboi.pages.FeedbackPage;
import com.raven.sheiboi.pages.LoginPage;
import com.raven.sheiboi.pages.HelpPage;
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

public class HelpTest {

    AppiumDriver   driver;
    StartUpPage    startUpPage;
    HelpPage       helpPage;
    LoginPage      loginPage;

    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app =new AppInitializer();
        driver = app.getDriver();

        startUpPage = new StartUpPage(driver);
        loginPage = new LoginPage(driver);
        helpPage = new HelpPage(driver);

        startUpPage.navigateToLoginPage();
        loginPage.loginWithUserNameAndPassword("naser.bd.edu@gmail.com","Abcd1234.",driver);
        startUpPage.navigateToHelpPage();

    }

    @Test
    public void ShuruKorunTest() throws MalformedURLException, InterruptedException{

        helpPage.ShuruKorun(driver);
        driver.quit();

    }

    @Test
    public void BoiPoraShuruKorunTest() throws MalformedURLException, InterruptedException{

        helpPage.BoiPoraShuruKorun(driver);
        driver.quit();

    }

    @Test
    public void AktiMatroDhapeFreeRegistrationKorunTest() throws MalformedURLException, InterruptedException{

        helpPage.AktiMatroDhapeFreeRegistrationKorun(driver);
        driver.quit();

    }

    @Test
    public void NotunBoiSongrohoKorunTest() throws MalformedURLException, InterruptedException{

        helpPage.NotunBoiSongrohoKorun(driver);
        driver.quit();

    }

    @Test
    public void ReadingFeatureTest() throws MalformedURLException, InterruptedException{

        helpPage.ReadingFeature(driver);
        driver.quit();

    }

    @Test
    public void SelectionFeatureTest() throws MalformedURLException, InterruptedException{

        helpPage.SelectionFeature(driver);
        driver.quit();

    }

    @Test
    public void SyncSubidhaTest() throws MalformedURLException, InterruptedException{

        helpPage.SyncSubidha(driver);
        driver.quit();

    }

    @Test
    public void WalletRechargeKorunTest() throws MalformedURLException, InterruptedException{

        helpPage.WalletRechargeKorun(driver);
        driver.quit();

    }

    @Test
    public void ApnarProtikriyaPathanTest() throws MalformedURLException, InterruptedException{

        helpPage.ApnarProtikriyaPathan(driver);
        driver.quit();

    }

    @Test
    public void HelpLineTest() throws MalformedURLException, InterruptedException{

        helpPage.HelpLine(driver);
        driver.quit();

    }
}
