package com.raven.sheiboi.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class BookStorePage {

    public  BookStorePage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @FindBy(name = "বুক স্টোর")
    public WebElement assertBookStore;

    @FindBy(name = "সকল বই")
    public WebElement assertAllButton;

    @FindBy(name = "ফ্রী বই")
    public WebElement assertFreeButton;

    @FindBy(name = "নতুন বই")
    public WebElement assertRecentButton;

    @FindBy(name = "টপ বই")
    public WebElement assertTopRatedButton;

    @FindBy(name = "লেখক")
    public WebElement assertAuthorButton;

    @FindBy(name = "বই ক্যাটাগরি")
    public WebElement assertCategoryButton;

    @FindBy(name = "প্রকাশক")
    public WebElement assertPublisherButton;

    @FindBy(name = "ভূত সমগ্র")
    public WebElement assertBook1;
    @FindBy(name = "কাদের সিদ্দিকীর")
    public WebElement assertBook13;

    @FindBy(name = "কৃষ্ণচরিত্র তৃতীয় খণ্ড")

    public WebElement assertBook14;

    @FindBy(name = "কৃষ্ণচরিত্র পঞ্চম খণ্ড")
    public WebElement assertBook15;

    @FindBy(name = "কৃষ্ণচরিত্র ষষ্ঠ খণ্ড")

    public WebElement assertBook16;

    @FindBy(name = "কৃষ্ণচরিত্র সপ্তম খণ্ড")

    public WebElement assertBook17;

    @FindBy(name = "যুগলাঙ্গুরীয়")
    public WebElement assertBook18;

    @FindBy(name = "newrone Onuronon ")

    public WebElement assertBook19;

    @FindBy(name = "newrone Onuronon ")
    public WebElement assertBook2;
    @FindBy(name = "ভূত সমগ্র")
    public WebElement assertBook10;


    @FindBy(name = "Download")
    public WebElement assertDownloadOption;

    @FindBy(name = "Download")
    public WebElement assertDownloadButton;

    @FindBy(name = "Open")
    public WebElement assertOpenButton;

    @FindBy(name = "Details")
    public WebElement assertDetailsOption;
    @FindBy(name = "Pay with bKash")
    public WebElement assertBkashOption;

    @FindBy(name = "Please login first to download this book.")
    public WebElement assertPopUpMsgDownload;

    @FindBy(name = "Cancel")
    public WebElement assertPopUpMsgDownloadNo;

    @FindBy(name = "login")
    public WebElement assertPopUpMsgDownloadYes;

    @FindBy(name = "Add to cart")
    public WebElement assertAddtoCartButton;

    @FindBy(name = "Please login first to add the book in cart.")
    public WebElement assertPopUpMsgAddtoCart;

    @FindBy(name = "Cancel")
    public WebElement assertPopUpMsgAddtoCartNo;

    @FindBy(name = "login")
    public WebElement assertPopUpMsgAddtoCartYes;

    @FindBy(name= "Buy ৳6.0")
    public WebElement assertPriceTagOption;

    @FindBy(name = "Please login first to purchase this book.")
    public WebElement assertPopUpMsgPurchaseBook;

    @FindBy(name = "Cancel")
    public WebElement assertPopUpMsgPurchaseBookNo;

    @FindBy(name = "Login")
    public WebElement assertPopUpMsgPurchaseBookYes;

    @FindBy(name= "Email")
    public WebElement assertEmailField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='2']")
    public WebElement  assertPasswordField;

    @FindBy(name= "Summary")
    public WebElement assertSummary;

    @FindBy(name= "Rate this Book")
    public WebElement assertRateThisBook;

    @FindBy(name= "View Reviews")
    public WebElement assertViewReviews;

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

    @FindBy(name = "Allow")
    public WebElement SheiBoiAccessLocationPopUpMsgAllow;

    @FindBy(name = "Deny")
    public WebElement SheiBoiAccessLocationPopUpMsgDeny;

    @FindBy(name = "Download")
    public WebElement SheiBoiBookStoreListOptionDownload;

    public String[] guestSheiBoiBookStore()throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[8];

        resultArray [0] = assertBookStore.getText();

        resultArray [1] = assertAllButton.getText();

        assertFreeButton.click();

        resultArray [2] = assertFreeButton.getText();

        assertRecentButton.click();

        resultArray [3] = assertRecentButton.getText();

        assertTopRatedButton.click();

        resultArray [4] = assertTopRatedButton.getText();

        assertAuthorButton.click();

        resultArray [5] = assertAuthorButton.getText();

        assertCategoryButton.click();

        resultArray [6] = assertCategoryButton.getText();

        assertPublisherButton.click();

        resultArray [7] = assertPublisherButton.getText();

        return resultArray;

    }

    public String[] guestSheiBoiBookStoreDownloadCheck()throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[4];

        resultArray [0] = assertBookStore.getText();

        resultArray [1] = assertBook1.getText();

        assertBook1.click();

        resultArray [2] = assertDownloadButton.getText();

        assertDownloadButton.click();

        sleep(5000);

        resultArray [3] = assertOpenButton.getText();

        return resultArray;

    }

    public String[] guestSheiBoiBookStoreAddtoCartCheck()throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[6];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook2.getText();

        assertBook2.click();

        resultArray [2] = assertAddtoCartButton.getText();

        assertAddtoCartButton.click();

        resultArray [3] = assertPopUpMsgAddtoCart.getText();

        resultArray [4] = assertPopUpMsgAddtoCartNo.getText();

        resultArray [5] = assertPopUpMsgAddtoCartYes.getText();



        return resultArray;

    }


    public String[] guestSheiBoiBookStoreListOptionFreeBook(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[4];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook13.getText();
        sleep(5000);

        driver.tap(1,604,499,1);

        sleep(10000);

        resultArray [2] = assertDownloadOption.getText();

        resultArray [3] = assertDetailsOption.getText();

        return resultArray;

    }

    public String[] guestSheiBoiBookStoreListOptionPurchaseBook(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[5];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook2.getText();
        sleep(5000);
        driver.tap(1,604,733,1);

        sleep(10000);

        resultArray [2] = assertPriceTagOption.getText();

        resultArray [3] = assertBkashOption.getText();
        resultArray [4] = assertDetailsOption.getText();

        return resultArray;

    }

    public String[] guestSheiBoiBookStoreListOptionFreeBookDownload(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[6];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook13.getText();

        driver.tap(1,604,499,1);

        resultArray [2] = assertDownloadOption.getText();

        resultArray [3] = assertDetailsOption.getText();

        assertDownloadButton.click();

        sleep(10000);

        driver.tap(1,604,499,1);

        sleep(5000);

        resultArray [4] = assertDetailsOption.getText();

        resultArray [5] = assertOpenButton.getText();

        return resultArray;

    }

    public String[] guestSheiBoiBookStoreListOptionBuyPurchaseBook(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[7];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook2.getText();

        driver.tap(1,604,733,1);

        resultArray [2] = assertPriceTagOption.getText();

        resultArray [3] = assertDetailsOption.getText();

        assertPriceTagOption.click();

        resultArray [4] = assertPopUpMsgPurchaseBook.getText();

        resultArray [5] = assertPopUpMsgPurchaseBookNo.getText();

        resultArray [6] = assertPopUpMsgPurchaseBookYes.getText();

        return resultArray;

    }

    public String[] guestSheiBoiBookStoreDownloadLoginStateCheck(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[11];

        resultArray [0] = assertBookStore.getText();

        assertTopRatedButton.click();

        sleep(5000);
        //-------//
        resultArray [1] = assertBook14.getText();

        driver.tap(1,604,255,1);

        resultArray [2] = assertDownloadOption.getText();

        resultArray [3] = assertDetailsOption.getText();

        assertDownloadButton.click();

        sleep(10000);
        //--------//
        //-------//
        resultArray [1] = assertBook15.getText();

        driver.tap(1,604,489,1);

        resultArray [2] = assertDownloadOption.getText();

        resultArray [3] = assertDetailsOption.getText();

        assertDownloadButton.click();

        sleep(10000);
        //--------//
        //-------//
        resultArray [1] = assertBook16.getText();

        driver.tap(1,604,723,1);

        resultArray [2] = assertDownloadOption.getText();

        resultArray [3] = assertDetailsOption.getText();

        assertDownloadButton.click();

        sleep(10000);
        //--------//
        //-------//
        resultArray [1] = assertBook17.getText();

        driver.tap(1,604,957,1);

        resultArray [2] = assertDownloadOption.getText();

        resultArray [3] = assertDetailsOption.getText();

        assertDownloadButton.click();

        sleep(10000);
        //---done-----//

        driver.swipe(24, 1179, 24, 243, 3000);
        sleep(5000);

        //resultArray [1] = assertBook18.getText();

        driver.tap(1,604,221,1);

        resultArray [2] = assertDownloadOption.getText();

        resultArray [3] = assertDetailsOption.getText();

        assertDownloadButton.click();

        sleep(10000);
        //--------//

        resultArray [1] = assertBook19.getText();

        assertBook13.click();

        resultArray [2] = assertDownloadButton.getText();

        assertDownloadButton.click();

        //---//

        resultArray [3] = assertPopUpMsgDownload.getText();

        resultArray [4] = assertPopUpMsgDownloadNo.getText();

        resultArray [5] = assertPopUpMsgDownloadYes.getText();

        assertPopUpMsgDownloadYes.click();
        assertEmailField.isDisplayed();
        assertPasswordField.isDisplayed();

        assertEmailField.sendKeys("naser.bd.edu@gmail.com");
        assertPasswordField.sendKeys("Abcd1234.");
        driver.hideKeyboard();
        loginButton.click();

        resultArray [6] = assertBook13.getText();
        resultArray [7] = assertDownloadButton.getText();
        resultArray [8] = assertSummary.getText();
        resultArray [9] = assertRateThisBook.getText();
        resultArray [10] = assertViewReviews.getText();

        return  resultArray;

    }

    public String[] guestSheiBoiBookStoreAddtoCartLoginStateCheck(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        String[] resultArray = new String[11];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook2.getText();

        assertBook2.click();

        resultArray [2] = assertAddtoCartButton.getText();

        assertAddtoCartButton.click();

        resultArray [3] = assertPopUpMsgAddtoCart.getText();

        resultArray [4] = assertPopUpMsgAddtoCartNo.getText();

        resultArray [5] = assertPopUpMsgAddtoCartYes.getText();

        assertPopUpMsgDownloadYes.click();

        SheiBoiAccessLocationPopUpMsgDeny.click();

        assertEmailField.isDisplayed();
        assertPasswordField.isDisplayed();

        assertEmailField.sendKeys("naser.bd.edu@gmail.com");
        driver.hideKeyboard();
        assertPasswordField.sendKeys("Abcd1234.");
        driver.hideKeyboard();
        loginButton.click();

        resultArray [6] = assertBook2.getText();
        resultArray [7] = assertAddtoCartButton.getText();
        resultArray [8] = assertSummary.getText();
        resultArray [9] = assertRateThisBook.getText();
        resultArray [10] = assertViewReviews.getText();

        return resultArray;

    }

    //--------------------------------------- Registered User ----------------------------------------------------------

    public String[] userSheiBoiBookStore(AppiumDriver driver)throws MalformedURLException, InterruptedException{


        String[] resultArray = new String[8];

        resultArray [0] = assertBookStore.getText();

        resultArray [1] = assertAllButton.getText();

        assertFreeButton.click();

        resultArray [2] = assertFreeButton.getText();

        assertRecentButton.click();

        resultArray [3] = assertRecentButton.getText();

        assertTopRatedButton.click();

        resultArray [4] = assertTopRatedButton.getText();

        assertAuthorButton.click();

        resultArray [5] = assertAuthorButton.getText();

        assertCategoryButton.click();

        resultArray [6] = assertCategoryButton.getText();

        resultArray [7] = assertPublisherButton.getText();

        return resultArray;

    }

    public String[] userSheiBoiBookStoreDownloadCheck(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("nadimsaker@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        drawerMenuButton.click();
        bookStoreMenuButton.click();

        String[] resultArray = new String[4];

        resultArray [0] = assertBookStore.getText();

        resultArray [1] = assertBook1.getText();

        assertBook1.click();

        resultArray [2] = assertDownloadButton.getText();

        assertDownloadButton.click();

        resultArray [3] = assertOpenButton.getText();

        return resultArray;

    }

    public String[] userSheiBoiBookStoreAddtoCartCheck(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("nadimsaker@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        drawerMenuButton.click();
        bookStoreMenuButton.click();

        String[] resultArray = new String[6];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook2.getText();

        assertBook2.click();

        resultArray [2] = assertAddtoCartButton.getText();

        assertAddtoCartButton.click();

        resultArray [3] = assertPopUpMsgAddtoCart.getText();

        resultArray [4] = assertPopUpMsgAddtoCartNo.getText();

        resultArray [5] = assertPopUpMsgAddtoCartYes.getText();

        return resultArray;

    }


    public String[] userSheiBoiBookStoreListOptionFreeBook(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("nadimsaker@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        drawerMenuButton.click();
        bookStoreMenuButton.click();

        String[] resultArray = new String[4];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook1.getText();

        driver.tap(1,592,233,1);

        resultArray [2] = assertDownloadOption.getText();

        resultArray [3] = assertDetailsOption.getText();

        return resultArray;

    }

    public String[] userSheiBoiBookStoreListOptionPurchaseBook(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("nadimsaker@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        drawerMenuButton.click();
        bookStoreMenuButton.click();

        String[] resultArray = new String[4];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook2.getText();

        driver.tap(1,592,443,1);

        resultArray [2] = assertPriceTagOption.getText();

        resultArray [3] = assertDetailsOption.getText();

        return resultArray;

    }

    public String[] userSheiBoiBookStoreListOptionFreeBookDownload(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("nadimsaker@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        drawerMenuButton.click();
        bookStoreMenuButton.click();

        String[] resultArray = new String[6];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook1.getText();

        driver.tap(1,592,233,1);

        resultArray [2] = assertDownloadOption.getText();

        resultArray [3] = assertDetailsOption.getText();

        assertDownloadButton.click();

        driver.tap(1,592,233,1);

        resultArray [4] = assertDetailsOption.getText();

        resultArray [5] = assertOpenButton.getText();

        return resultArray;

    }

    public String[] userSheiBoiBookStoreListOptionBuyPurchaseBook(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("nadimsaker@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        drawerMenuButton.click();
        bookStoreMenuButton.click();

        String[] resultArray = new String[7];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook2.getText();

        driver.tap(1,592,443,1);

        resultArray [2] = assertPriceTagOption.getText();

        resultArray [3] = assertDetailsOption.getText();

        assertPriceTagOption.click();

        resultArray [4] = assertPopUpMsgPurchaseBook.getText();

        resultArray [5] = assertPopUpMsgPurchaseBookNo.getText();

        resultArray [6] = assertPopUpMsgPurchaseBookYes.getText();

        return resultArray;

    }

    public String[] userSheiBoiBookStoreDownloadLoginStateCheck(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("nadimsaker@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        drawerMenuButton.click();
        bookStoreMenuButton.click();

        String[] resultArray = new String[11];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook1.getText();

        assertBook1.click();

        resultArray [2] = assertDownloadButton.getText();

        assertDownloadButton.click();

        resultArray [3] = assertPopUpMsgDownload.getText();

        resultArray [4] = assertPopUpMsgDownloadNo.getText();

        resultArray [5] = assertPopUpMsgDownloadYes.getText();

        assertPopUpMsgDownloadYes.click();
        assertEmailField.isDisplayed();
        assertPasswordField.isDisplayed();

        assertEmailField.sendKeys("naser.bd.edu@gmail.com");
        assertPasswordField.sendKeys("Abcd1234.");
        driver.hideKeyboard();
        loginButton.click();

        resultArray [6] = assertBook1.getText();
        resultArray [7] = assertDownloadButton.getText();
        resultArray [8] = assertSummary.getText();
        resultArray [9] = assertRateThisBook.getText();
        resultArray [10] = assertViewReviews.getText();

        return  resultArray;

    }

    public String[] userSheiBoiBookStoreAddtoCartLoginStateCheck(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("nadimsaker@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        drawerMenuButton.click();
        bookStoreMenuButton.click();

        String[] resultArray = new String[11];

        resultArray [0] = assertBookStore.getText();

        assertRecentButton.click();

        sleep(5000);

        resultArray [1] = assertBook2.getText();

        assertBook2.click();

        resultArray [2] = assertAddtoCartButton.getText();

        assertAddtoCartButton.click();

        resultArray [3] = assertPopUpMsgAddtoCart.getText();

        resultArray [4] = assertPopUpMsgAddtoCartNo.getText();

        resultArray [5] = assertPopUpMsgAddtoCartYes.getText();

        assertPopUpMsgDownloadYes.click();
        assertEmailField.isDisplayed();
        assertPasswordField.isDisplayed();

        assertEmailField.sendKeys("naser.bd.edu@gmail.com");
        assertPasswordField.sendKeys("Abcd1234.");
        driver.hideKeyboard();
        loginButton.click();

        resultArray [6] = assertBook2.getText();
        resultArray [7] = assertAddtoCartButton.getText();
        resultArray [8] = assertSummary.getText();
        resultArray [9] = assertRateThisBook.getText();
        resultArray [10] = assertViewReviews.getText();

        return resultArray;

    }





    public void SheiBoiOpenAnotherBookWhileDownloadCheck(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("nadimsaker@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        sleep(5000);

        drawerMenuButton.click();
        bookStoreMenuButton.click();

        sleep(10000);

        driver.tap(1,604,245,1);

        sleep(10000);

        SheiBoiBookStoreListOptionDownload.click();

       // sleep(2000);
        assertBook10.click();
//-----
        //String[] resultArray = new String[4];

       // resultArray [0] = assertBookStore.getText();

        //resultArray [1] = assertBook1.getText();



        //resultArray [2] = assertDownloadButton.getText();

       // assertDownloadButton.click();

        //resultArray [3] = assertOpenButton.getText();



    }

}
