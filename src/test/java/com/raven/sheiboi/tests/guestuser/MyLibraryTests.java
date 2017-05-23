package com.raven.sheiboi.tests.guestuser;

import com.raven.sheiboi.pages.LoginPage;
import com.raven.sheiboi.pages.MyLibraryPage;
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

public class MyLibraryTests {

    AppiumDriver    driver;
    StartUpPage     startUpPage;
    MyLibraryPage   myLibraryPage;

    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app =new AppInitializer();
        driver = app.getDriver();

        startUpPage = new StartUpPage(driver);

        myLibraryPage = new MyLibraryPage(driver);

        startUpPage.navigateToGuestLogin();

    }

    //"Verify that after login ""GUEST USER"", ""My Library"" page is displayed with 9 books which is following:
    //1. Dipaboli Sonkha 2. Duibon 3. Durgesh Nondini 4. Eid Magazine 5. Emandipto Dastan (Part One) 6. Jhalapala 7. Padma Nodir Majhi 8. Ruposhi Bangla 9. Sreekanto (1st Part)"

    @Test
    public void myLibraryTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"আমার লাইব্রেরী", "দীপাবলী সংখ্যা", "ঈদ ম্যাগাজিন", "ঈমানদীপ্ত দাস্তান প্রথম খণ্ড", "শ্রীকান্ত প্রথম পর্ব","দুই বোন", "দুর্গেশনন্দিনী",  "ঝালাপালা","রূপসী বাংলা"};

        assertArrayEquals(expectedArray,  myLibraryPage.browsMyLibraryBooks(driver));

    }

    //Verify that an orange color image is displayed in the book cover page which is "archieved (symbol)".

    @Test
    public void guestSheiBoiArchievedSymbolTest()throws MalformedURLException, InterruptedException{

        myLibraryPage.guestSheiBoiArchievedSymbol();

    }

    //Verify that tapping on a archieved symbol book then a pop message "Do you want to Download this book? Yes/No".

    @Test
    public void guestSheiBoiArchievedBookDownloadPopUpTest()throws MalformedURLException, InterruptedException{

        String [] expectedArray = {"আপনি কি বইটি ডাউনলোড করতে চান?", "No", "Yes"};

        assertArrayEquals(expectedArray, myLibraryPage.guestSheiBoiArchievedBookDownloadPopUp());

    }

    //Verify that tapping on "Search" field a text field is displayed and enter "dui" then "Dui Bon" book is displayed.

    @Test
    public void myLibrarySearchTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"দুই বোন"};

        assertArrayEquals(expectedArray,  myLibraryPage.myLibrarySearchCheck());

    }

    //Verify that selecting on "GUEST USER" apps is displayed sheiboi features.
    @Test
    public void guestSheiBoiFeaturesTest() throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"নতুন রিলিজ", "আমার লাইব্রেরী", "বুক স্টোর", "হেল্প", "তথ্য", "ওয়ালেট রিচার্জ", "প্রতিক্রিয়া"};

        assertArrayEquals(expectedArray, myLibraryPage.guestSheiBoiFeatures());

    }

    //"Verify that selecting on ""GUEST USER"" apps is displayed some images of  SheiBoi apps in the header such as ""Search, Sync, Cart and some sorting option.
    //1. Grid or List
    //2. Filter by (All, Downloaded, Archieved)
    //3. Sort by (By recent, By name, By author)"

    @Test
    public void guestSheiBoiHeaderOptionTest() throws MalformedURLException, InterruptedException{

        myLibraryPage.guestSheiBoiHeaderOption();

    }

    //Verify that tapping on "List (Symbol)" is showing Grid, Filter by and Sort by.

    @Test
    public void guestSheiBoiListSysmbolTest()throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"Grid", "Filter by", "Sort by"};

        assertArrayEquals(expectedArray, myLibraryPage.guestSheiBoiListSysmbol());

    }

    //Verify that tapping on Filter by is displyed "All, Downloaded, Archieved" option.

    @Test
    public void guestSheiBoiListSymbolFilterTest()throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"All", "Downloaded", "Archived"};

        assertArrayEquals(expectedArray, myLibraryPage.guestSheiBoiListSymbolFilter());

    }

    //Verify that tapping on Sort by is displyed "By recent, By name, By author" option.

    @Test
    public void guestSheiBoiListSymbolSortTest() throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"By recent", "By name", "By author"};

        assertArrayEquals(expectedArray, myLibraryPage.guestSheiBoiListSymbolSort());

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
