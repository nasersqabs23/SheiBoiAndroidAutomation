package com.raven.sheiboi.tests.guestuser;

import com.raven.sheiboi.pages.RecentReleasePage;
import com.raven.sheiboi.pages.StartUpPage;
import com.raven.sheiboi.utilities.AppInitializer;
import io.appium.java_client.AppiumDriver;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertArrayEquals;

public class RecentReleaseTest {

    AppiumDriver driver;
    StartUpPage startUpPage;
    RecentReleasePage recentReleasePage;

    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app =new AppInitializer();
        driver = app.getDriver();

        startUpPage = new StartUpPage(driver);

        recentReleasePage=new RecentReleasePage(driver);

        startUpPage.navigateToGuestRecentRelease();

    }

    //Verify that tapping on a "Recent" menu is displayed list of book which are recently released.

    @Test
    public void guestRecentReleaseTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "জলমানব ", "লীলাবতী ", "কাদের সিদ্দিকীর টুপি ও অন্যান্য কবিতা ", "এবং আরো ইত্যাদি ", "এসো বিজ্ঞানের রাজ্যে "};

        assertArrayEquals(expectedArray, recentReleasePage.recentReleaseCheck());

        driver.quit();
    }

    //Verify that tapping on a price added book is displayed book details page.

    @Test
    public void guestRecentBookDetailsTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Add to cart", "Summary", "Rate this Book", "View Reviews"};

        assertArrayEquals(expectedArray, recentReleasePage.recentBookDetailsCheck());

        driver.quit();
    }

    //Verify that tapping on "ADD TO CART" is displayed a message "Please login first to add the book in cart. No/Yes".

    @Test
    public void guestRecentAddToCartPopUpMsgTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Please login first to add the book in cart.", "Cancel", "login"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentAddToCartPopUpMsg());

        driver.quit();
    }

    //Verify that tapping on "Login" is displayed logging page with "Email and Password.".

    @Test
    public void guestRecentAddToCartPopUpMsgloginTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Please login first to add the book in cart.", "Cancel", "login"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentAddToCartPopUpMsglogin());

        driver.quit();
    }

    //Verify that entering "email and password" and tapping "Login" is displayed of that particular book details page (State testing).

    @Test
    public void guestRecentAddToCartLoginStateTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Please login first to add the book in cart.", "Cancel", "login", "লীলাবতী", "Add to cart", "Summary", "Rate this Book", "View Reviews"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentAddToCartLoginState(driver));

        driver.quit();
    }

    //Verify that tapping on rate (star symbol) is displayed "Please login first to rate this book. No/Login".

    @Test
    public void guestRecentRateThisBookPopUpMsgTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Please login first to rate this book.", "Cancel", "Login"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentRateThisBookPopUpMsg());

        driver.quit();
    }

    //Verify that tapping on "Login" is displayed loging page with "Email and Password.".

    @Test
    public void guestRecentRateThisBookPopUpMsgLoginTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Please login first to rate this book.", "Cancel", "Login"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentRateThisBookPopUpMsgLogin());

        driver.quit();
    }

    //Verify that entering "email and password" and tapping "Login" is displayed of that particular book details page (State testing).

    @Test
    public void guestRecentRateThisBookLoginStateTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Please login first to rate this book.", "Cancel", "Login", "লীলাবতী", "Add to cart", "Summary", "Rate this Book", "View Reviews"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentRateThisBookLoginState(driver));

        driver.quit();
    }

    //Verify that tapping on "Summary (v)" is displayed/expand "summary" of this book.

    @Test
    public void guestRecentBookDetailsSummaryExpandTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Add to cart", "Summary", "Rate this Book", "View Reviews"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentBookDetailsSummaryExpand());

        driver.quit();
    }

    //Verify that tapping on "Summary (^)" is displayed/collapsed "summary" of this book.

    @Test
    public void guestRecentBookDetailsSummaryCollapseTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Add to cart", "Summary", "Rate this Book", "View Reviews"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentBookDetailsSummaryCollapse());

        driver.quit();
    }

    //Verify that tapping on "View Reviews(v)" is displayed/expand "Reviews" of this book.

    @Test
    public void guestRecentBookDetailsViewReviewsExpandTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Add to cart", "Summary", "Rate this Book", "View Reviews"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentBookDetailsViewReviewsExpand());

        driver.quit();
    }

    //Verify that tapping on "View Reviews (^)" is displayed/collapsed "Reviews" of this book.

    @Test
    public void guestRecentBookDetailsViewReviewsCollapseTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Add to cart", "Summary", "Rate this Book", "View Reviews"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentBookDetailsViewReviewsCollapse());

        driver.quit();
    }

    //Verify that tapping on "List(: Symbol)" is displayed "Buy ৳ 2.0 and Details"

    @Test
    public void guestRecentReleaseListSymbolTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Buy ৳ 50.0", "Details"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentReleaseListSymbol(driver));

        driver.quit();
    }

    //Verify that tapping on "Buy ৳ 2.0" is displayed message "Please login first to Purchase this book. No/Login"

    @Test
    public void guestRecentListSymbolPriceTagPopUpMsgTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Buy ৳ 50.0", "Details", "Please login first to purchase this book.", "Cancel", "Login"};

        assertArrayEquals(expectedArray, recentReleasePage.GuestRecentListSymbolPriceTagPopUpMsg(driver));

        driver.quit();
    }

    //Verify that tapping on "Login" is displayed loging page with "Email and Password.".

    @Test
    public void guestRecentListSymbolPriceTagPopUpMsgLoginTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Buy ৳ 50.0", "Details", "Please login first to purchase this book.", "Cancel", "Login"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentListSymbolPriceTagPopUpMsgLogin(driver));

        driver.quit();
    }

    //Verify that entering "email and password" and tapping "Login" is displayed of that particular page (State testing).

    @Test
    public void guestRecentListSymbolPriceTagLoginStateTest() throws MalformedURLException, InterruptedException {

        String[] expectedArray = {"নতুন রিলিজ", "Buy ৳ 50.0", "Details", "Please login first to purchase this book.", "Cancel", "Login"};

        assertArrayEquals(expectedArray, recentReleasePage.guestRecentListSymbolPriceTagLoginState(driver));

        driver.quit();
    }

}
