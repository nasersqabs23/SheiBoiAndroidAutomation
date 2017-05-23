package com.raven.sheiboi.tests.registereduser;

import com.raven.sheiboi.pages.BookReviewPage;
import com.raven.sheiboi.pages.LoginPage;
import com.raven.sheiboi.pages.MyLibraryPage;
import com.raven.sheiboi.pages.StartUpPage;
import com.raven.sheiboi.utilities.AppInitializer;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import  java.io.File;
import  java.net.URL;
import java.net.MalformedURLException;

import static org.junit.Assert.assertArrayEquals;

public class BookReviewTest {

    AppiumDriver     driver;
    StartUpPage      startUpPage;
    BookReviewPage   bookReviewPage;

    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app =new AppInitializer();
        driver = app.getDriver();

        startUpPage = new StartUpPage(driver);

        bookReviewPage = new BookReviewPage(driver);

        startUpPage.navigateToLoginPage();

    }

    @Test
    public void reviewWithoutPurchaseTest() throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"Recent Release", "Please purchase first to rate this book.", "No", "Yes"};

        assertArrayEquals(expectedArray, bookReviewPage.reviewWithoutPurchase(driver));


    }
}
