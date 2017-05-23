package com.raven.sheiboi.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class RecentReleasePage {

    public  RecentReleasePage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @FindBy(name= "নতুন রিলিজ")
    public WebElement assertRecentPage;

    @FindBy(name= "জলমানব ")
    public WebElement assertRecentBook1;

    @FindBy(name= "লীলাবতী ")
    public WebElement assertRecentBook2;

    @FindBy(name= "লীলাবতী")
    public WebElement assertLilabotiBook;

    @FindBy(name= "কাদের সিদ্দিকীর টুপি ও অন্যান্য কবিতা ")
    public WebElement assertRecentBook3;

    @FindBy(name= "এবং আরো ইত্যাদি ")
    public WebElement assertRecentBook4;

    @FindBy(name= "এসো বিজ্ঞানের রাজ্যে ")
    public WebElement assertRecentBook5;

    @FindBy(name= "Add to cart")
    public WebElement assertAddToCartButton;

    @FindBy(name= "Summary")
    public WebElement assertSummary;

    @FindBy(name= "Rate this Book")
    public WebElement assertRateThisBook;

    @FindBy(name = "Allow")
    public WebElement SheiBoiAccessLocationPopUpMsgAllow;

    @FindBy(name = "Deny")
    public WebElement SheiBoiAccessLocationPopUpMsgDeny;

    @FindBy(name= "View Reviews")
    public WebElement assertViewReviews;

    @FindBy(name= "Please login first to add the book in cart.")
    public WebElement addToCartPopUpMsg;

    @FindBy(name= "Cancel")
    public WebElement addToCartPopUpMsgNo;

    @FindBy(name= "login")
    public WebElement addToCartPopUpMsgYes;

    @FindBy(name= "Email")
    public WebElement assertEmailField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")
    public WebElement  assertPasswordField;

    @FindBy(name = "Login")
    public WebElement loginButton;

    @AndroidFindBy(xpath = "//android.widget.RatingBar[@index='1']")
    public WebElement  rateThisBookStarSign;

    @FindBy(name= "Please login first to rate this book.")
    public WebElement rateThisBookPopUpMsg;

    @FindBy(name= "Cancel")
    public WebElement rateThisBookPopUpMsgNo;

    @FindBy(name= "Login")
    public WebElement rateThisBookPopUpMsgYes;

    @FindBy(name= "Buy ৳ 50.0")
    public WebElement assertPriceTagOption;

    @FindBy(name= "Details")
    public WebElement assertDetailsOption;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
    public WebElement  listOption;

    @FindBy(name= "Please login first to purchase this book.")
    public WebElement listSymbolPriceTagLoginMsg;

    @FindBy(name= "Cancel")
    public WebElement listSymbolPriceTagLoginMsgNo;

    @FindBy(name= "Login")
    public WebElement listSymbolPriceTagLoginMsgYes;

    @FindBy(name= "Later")
    public WebElement NewVersionAvailableLater;


    public String [] recentReleaseCheck() throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [6];

        resultArray [0] = assertRecentPage.getText();

        resultArray [1] = assertRecentBook1.getText();

        resultArray [2] = assertRecentBook2.getText();

        resultArray [3] = assertRecentBook3.getText();

        resultArray [4] = assertRecentBook4.getText();

        resultArray [5] = assertRecentBook5.getText();

        return resultArray;

    }

    public String [] recentBookDetailsCheck()throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [5];

        resultArray [0] = assertRecentPage.getText();

        assertRecentBook2.click();

        resultArray [1] = assertAddToCartButton.getText();

        resultArray [2] = assertSummary.getText();

        resultArray [3] = assertRateThisBook.getText();

        resultArray [4] = assertViewReviews.getText();

        return  resultArray;

    }

    public String [] guestRecentAddToCartPopUpMsg()throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [4];

        resultArray [0] = assertRecentPage.getText();

        assertRecentBook2.click();

        assertAddToCartButton.click();

        resultArray [1] = addToCartPopUpMsg.getText();
        resultArray [2] = addToCartPopUpMsgNo.getText();
        resultArray [3] = addToCartPopUpMsgYes.getText();

        return  resultArray;

    }

    public String [] guestRecentAddToCartPopUpMsglogin()throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [4];

        resultArray [0] = assertRecentPage.getText();

        assertRecentBook2.click();
        assertAddToCartButton.click();

        resultArray [1] = addToCartPopUpMsg.getText();
        resultArray [2] = addToCartPopUpMsgNo.getText();
        resultArray [3] = addToCartPopUpMsgYes.getText();

        addToCartPopUpMsgYes.click();

        SheiBoiAccessLocationPopUpMsgDeny.click();

        assertEmailField.isDisplayed();

        assertPasswordField.isDisplayed();

        return  resultArray;

    }

    public String [] guestRecentAddToCartLoginState(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [9];

        resultArray [0] = assertRecentPage.getText();

        assertRecentBook2.click();
        assertAddToCartButton.click();

        resultArray [1] = addToCartPopUpMsg.getText();
        resultArray [2] = addToCartPopUpMsgNo.getText();
        resultArray [3] = addToCartPopUpMsgYes.getText();

        addToCartPopUpMsgYes.click();

        SheiBoiAccessLocationPopUpMsgDeny.click();

        assertEmailField.isDisplayed();

        assertPasswordField.isDisplayed();

        assertEmailField.sendKeys("naser.bd.edu@gmail.com");
        driver.hideKeyboard();
        assertPasswordField.sendKeys("Abcd1234.");
        driver.hideKeyboard();

        loginButton.click();

        sleep(5000);

        //NewVersionAvailableLater.click();

        resultArray [4] = assertLilabotiBook.getText();
        resultArray [5] = assertAddToCartButton.getText();
        resultArray [6] = assertSummary.getText();
        resultArray [7] = assertRateThisBook.getText();
        resultArray [8] = assertViewReviews.getText();

        return  resultArray;

    }

    public String [] guestRecentRateThisBookPopUpMsg()throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [4];

        resultArray [0] = assertRecentPage.getText();

        assertRecentBook2.click();

        rateThisBookStarSign.click();

        resultArray [1] = rateThisBookPopUpMsg.getText();
        resultArray [2] = rateThisBookPopUpMsgNo.getText();
        resultArray [3] = rateThisBookPopUpMsgYes.getText();

        return  resultArray;

    }

    public String [] guestRecentRateThisBookPopUpMsgLogin()throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [4];

        resultArray [0] = assertRecentPage.getText();

        assertRecentBook2.click();

        rateThisBookStarSign.click();

        resultArray [1] = rateThisBookPopUpMsg.getText();
        resultArray [2] = rateThisBookPopUpMsgNo.getText();
        resultArray [3] = rateThisBookPopUpMsgYes.getText();

        rateThisBookPopUpMsgYes.click();
        SheiBoiAccessLocationPopUpMsgDeny.click();
        assertEmailField.isDisplayed();
        assertPasswordField.isDisplayed();

        return  resultArray;

    }

    public String [] guestRecentRateThisBookLoginState(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [9];

        resultArray [0] = assertRecentPage.getText();

        assertRecentBook2.click();

        rateThisBookStarSign.click();

        resultArray [1] = rateThisBookPopUpMsg.getText();
        resultArray [2] = rateThisBookPopUpMsgNo.getText();
        resultArray [3] = rateThisBookPopUpMsgYes.getText();

        rateThisBookPopUpMsgYes.click();

        SheiBoiAccessLocationPopUpMsgDeny.click();
        assertEmailField.isDisplayed();
        assertPasswordField.isDisplayed();

        assertEmailField.sendKeys("naser.bd.edu@gmail.com");
        driver.hideKeyboard();
        assertPasswordField.sendKeys("Abcd1234.");
        driver.hideKeyboard();
        loginButton.click();

        sleep (5000);

       //NewVersionAvailableLater.click();

        resultArray [4] = assertLilabotiBook.getText();
        resultArray [5] = assertAddToCartButton.getText();
        resultArray [6] = assertSummary.getText();
        resultArray [7] = assertRateThisBook.getText();
        resultArray [8] = assertViewReviews.getText();

        return  resultArray;

    }

    public String [] guestRecentBookDetailsSummaryExpand()throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [5];

        resultArray [0] = assertRecentPage.getText();

        assertRecentBook2.click();

        resultArray [1] = assertAddToCartButton.getText();

        resultArray [2] = assertSummary.getText();

        resultArray [3] = assertRateThisBook.getText();

        resultArray [4] = assertViewReviews.getText();

        assertSummary.click();

        sleep (10000);

        assertSummary.click();

        return  resultArray;

    }

    public String [] guestRecentBookDetailsSummaryCollapse()throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [5];

        resultArray [0] = assertRecentPage.getText();

        assertRecentBook2.click();

        resultArray [1] = assertAddToCartButton.getText();

        resultArray [2] = assertSummary.getText();

        resultArray [3] = assertRateThisBook.getText();

        resultArray [4] = assertViewReviews.getText();

        assertSummary.click();

        sleep (10000);

        assertSummary.click();

        return  resultArray;

    }

    public String [] guestRecentBookDetailsViewReviewsExpand()throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [5];

        resultArray [0] = assertRecentPage.getText();

        assertRecentBook2.click();

        resultArray [1] = assertAddToCartButton.getText();

        resultArray [2] = assertSummary.getText();

        resultArray [3] = assertRateThisBook.getText();

        resultArray [4] = assertViewReviews.getText();

        assertViewReviews.click();

        sleep (10000);

        assertViewReviews.click();

        return  resultArray;

    }

    public String [] guestRecentBookDetailsViewReviewsCollapse()throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [5];

        resultArray [0] = assertRecentPage.getText();

        assertRecentBook2.click();

        resultArray [1] = assertAddToCartButton.getText();

        resultArray [2] = assertSummary.getText();

        resultArray [3] = assertRateThisBook.getText();

        resultArray [4] = assertViewReviews.getText();

        assertViewReviews.click();

        sleep (10000);

        assertViewReviews.click();

        return  resultArray;

    }

    public String [] guestRecentReleaseListSymbol(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [3];

        resultArray [0] = assertRecentPage.getText();

        driver.tap(1,604,392,1);

        resultArray [1] = assertPriceTagOption.getText();

        resultArray [2] = assertDetailsOption.getText();

        return  resultArray;

    }

    public String [] GuestRecentListSymbolPriceTagPopUpMsg(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [6];

        resultArray [0] = assertRecentPage.getText();

        driver.tap(1,604,392,1);

        resultArray [1] = assertPriceTagOption.getText();

        resultArray [2] = assertDetailsOption.getText();

        assertPriceTagOption.click();

        resultArray [3] = listSymbolPriceTagLoginMsg.getText();
        resultArray [4] = listSymbolPriceTagLoginMsgNo.getText();
        resultArray [5] = listSymbolPriceTagLoginMsgYes.getText();

        return  resultArray;

    }

    public String [] guestRecentListSymbolPriceTagPopUpMsgLogin(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [6];

        resultArray [0] = assertRecentPage.getText();

        driver.tap(1,604,392,1);

        resultArray [1] = assertPriceTagOption.getText();

        resultArray [2] = assertDetailsOption.getText();

        assertPriceTagOption.click();

        resultArray [3] = listSymbolPriceTagLoginMsg.getText();
        resultArray [4] = listSymbolPriceTagLoginMsgNo.getText();
        resultArray [5] = listSymbolPriceTagLoginMsgYes.getText();

        listSymbolPriceTagLoginMsgYes.click();

        SheiBoiAccessLocationPopUpMsgDeny.click();

        assertEmailField.isDisplayed();
        assertPasswordField.isDisplayed();

        return  resultArray;

    }

    public String [] guestRecentListSymbolPriceTagLoginState(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep (10000);

        String [] resultArray = new String [6];

        resultArray [0] = assertRecentPage.getText();

        driver.tap(1,604,392,1);

        resultArray [1] = assertPriceTagOption.getText();

        resultArray [2] = assertDetailsOption.getText();

        assertPriceTagOption.click();

        resultArray [3] = listSymbolPriceTagLoginMsg.getText();
        resultArray [4] = listSymbolPriceTagLoginMsgNo.getText();
        resultArray [5] = listSymbolPriceTagLoginMsgYes.getText();

        listSymbolPriceTagLoginMsgYes.click();

        SheiBoiAccessLocationPopUpMsgDeny.click();

        assertEmailField.isDisplayed();
        assertPasswordField.isDisplayed();

        assertEmailField.sendKeys("naser.bd.edu@gmail.com");
        driver.hideKeyboard();
        assertPasswordField.sendKeys("Abcd1234.");
        driver.hideKeyboard();
        loginButton.click();

        NewVersionAvailableLater.click();

        return  resultArray;

    }

}
