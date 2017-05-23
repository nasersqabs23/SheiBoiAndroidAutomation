package com.raven.sheiboi.tests.guestuser;

import com.raven.sheiboi.pages.LoginPage;
import com.raven.sheiboi.pages.BookStorePage;
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

public class BookStoreTest {

    AppiumDriver   driver;
    StartUpPage    startUpPage;
    BookStorePage  bookStorePage;

    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app =new AppInitializer();
        driver = app.getDriver();

        startUpPage = new StartUpPage(driver);

        bookStorePage = new BookStorePage(driver);

        startUpPage.navigateToGuestLogin();

    }

    //Verify that tapping on "Book Store" is displayed four tabs (All, Free, Recent, Top Rated, Author and Category)

    @Test
    public void guestSheiBoiBookStoreTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"বুক স্টোর", "সকল বই", "ফ্রী বই", "নতুন বই", "টপ বই", "লেখক", "বই ক্যাটাগরি", "প্রকাশক"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStore());

    }

    //Verify that tapping on "DOWNLOAD" is displayed a message "Please login first to download this book." No/Yes"

    @Test
    public void guestSheiBoiBookStoreDownloadCheckTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"বুক স্টোর", "ভূত সমগ্র", "Download", "Open"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreDownloadCheck());

    }

    //Verify that tapping on "ADD TO CART" is displayed a message "Please login first to add the book in cart." No/Yes"

    @Test
    public void guestSheiBoiBookStoreAddtoCartCheckTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"বুক স্টোর", "newrone Onuronon ", "Add to cart", "Please login first to add the book in cart.", "Cancel", "login"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreAddtoCartCheck());

    }

    //

    @Test
    public void guestSheiBoiBookStoreListOptionFreeBookTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"বুক স্টোর", "কাদের সিদ্দিকীর", "Download", "Details"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreListOptionFreeBook(driver));

    }

    //

    @Test
    public void guestSheiBoiBookStoreListOptionPurchaseBookTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"বুক স্টোর", "newrone Onuronon ", "Buy ৳6.0",  "Pay with bKash","Details"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreListOptionPurchaseBook(driver));

    }

    //

    @Test
    public void guestSheiBoiBookStoreListOptionFreeBookDownloadTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"বুক স্টোর", "কাদের সিদ্দিকীর", "Download", "Details","Details", "Open"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreListOptionFreeBookDownload(driver));

    }

    //

    @Test
    public void guestSheiBoiBookStoreListOptionBuyPurchaseBookTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"বুক স্টোর", "newrone Onuronon ", "Buy ৳6.0", "Details", "Please login first to purchase this book.", "Cancel", "Login"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreListOptionBuyPurchaseBook(driver));

    }

    //

    @Test
    public void guestSheiBoiBookStoreDownloadLoginStateCheckTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"বুক স্টোর", "কাদের সিদ্দিকীর", "Download", "Please login first to download this book.", "Cancel", "Login", "কাদের সিদ্দিকীর", "Download", "Summary", "Rate this Book", "View Reviews"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreDownloadLoginStateCheck(driver));

    }

    //

    @Test
    public void guestSheiBoiBookStoreAddtoCartLoginStateCheckTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"বুক স্টোর", "লীলাবতী ", "Add to cart", "Please login first to add the book in cart.", "Cancel", "login", "লীলাবতী ", "Add to cart", "Summary", "Rate this Book", "View Reviews"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreAddtoCartLoginStateCheck(driver));

    }

    @After
    public void tearDown(){

        driver.quit();

    }
}
