package com.raven.sheiboi.tests.registereduser;

import com.raven.sheiboi.pages.BookStorePage;
import com.raven.sheiboi.pages.RegistrationPage;
import com.raven.sheiboi.pages.StartUpPage;
import com.raven.sheiboi.utilities.AppInitializer;
import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BookStoreTest {

    AppiumDriver driver;
    StartUpPage startUpPage;
    RegistrationPage registrationPage;
    BookStorePage bookStorePage;

    @Before

    public void setup ()throws MalformedURLException, InterruptedException{

        AppInitializer app =new AppInitializer();
        driver = app.getDriver();

        startUpPage = new StartUpPage(driver);

        //registrationPage=new RegistrationPage(driver);

        bookStorePage=new BookStorePage(driver);

        startUpPage.navigateToBookStorePageUser(driver);


    }

    //TC/RegisteredUser/BookStore/001	Verify that tapping on "Book Store" is displayed six tabs (All, Free, Recent, Top Rated, Author and Category)

    @Test
    public void userSheiBoiBookStoreTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"বুক স্টোর", "সকল বই", "ফ্রী বই", "নতুন বই", "টপ বই", "লেখক", "বই ক্যাটাগরি", "প্রকাশক"};

        assertArrayEquals(expectedArray, bookStorePage.userSheiBoiBookStore(driver));

    }

//Verify that tapping on "ADD TO CART" is displayed a message "Please login first to add the book in cart." No/Yes"

    @Test
    public void guestSheiBoiBookStoreAddtoCartCheckTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"Book Store", "পলাতক", "Add to cart", "Please login first to add the book in cart.", "No", "login"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreAddtoCartCheck());

    }

    //

    @Test
    public void guestSheiBoiBookStoreListOptionFreeBookTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"Book Store", "নির্বাচিত কবিতা", "Download", "Details"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreListOptionFreeBook(driver));

    }

    //

    @Test
    public void guestSheiBoiBookStoreListOptionPurchaseBookTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"Book Store", "পলাতক", "Buy ৳ 40.0", "Details"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreListOptionPurchaseBook(driver));

    }

    //

    @Test
    public void guestSheiBoiBookStoreListOptionFreeBookDownloadTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"Book Store", "নির্বাচিত কবিতা", "Download", "Details","Details", "Open"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreListOptionFreeBookDownload(driver));

    }

    //

    @Test
    public void guestSheiBoiBookStoreListOptionBuyPurchaseBookTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"Book Store", "পলাতক", "Buy ৳ 40.0", "Details", "Please login first to Purchase this book.", "No", "login"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreListOptionBuyPurchaseBook(driver));

    }

    //

    @Test
    public void guestSheiBoiBookStoreDownloadLoginStateCheckTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"Book Store", "নির্বাচিত কবিতা", "Download", "Please login first to download this book.", "No", "login", "প্রিয়মুখ ঈদ ম্যাগাজিন-২০১৬", "Download", "Summary", "Rate this Book", "View Reviews"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreDownloadLoginStateCheck(driver));

    }

    //

    @Test
    public void guestSheiBoiBookStoreAddtoCartLoginStateCheckTest()throws MalformedURLException, InterruptedException{

        //String[] expectedArray = {"Book Store", "পলাতক", "Add to cart", "Please login first to add the book in cart.", "No", "login", "পলাতক", "Add to cart", "Summary", "Rate this Book", "View Reviews"};
        String[] expectedArray = {"বুক স্টোর", "সকল বই", "ফ্রী বই", "নতুন বই", "টপ বই", "লেখক", "বই ক্যাটাগরি", "প্রকাশক"};

        assertArrayEquals(expectedArray, bookStorePage.guestSheiBoiBookStoreAddtoCartLoginStateCheck(driver));

    }

    //Verify that user can open another book from "book details" while download in progress.

    @Test
    public void SheiBoiOpenAnotherBookWhileDownload()throws MalformedURLException, InterruptedException{

       // String[] expectedArray = {"Book Store", "পলাতক", "Add to cart", "Please login first to add the book in cart.", "No", "login", "পলাতক", "Add to cart", "Summary", "Rate this Book", "View Reviews"};

       // assertArrayEquals(expectedArray, bookStorePage.SheiBoiOpenAnotherBookWhileDownloadCheck(driver));

        bookStorePage.SheiBoiOpenAnotherBookWhileDownloadCheck(driver);
    }
    @After
    public void tearDown(){

        driver.quit();

    }
}