package com.raven.sheiboi.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class BookReviewPage {

    public  BookReviewPage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @FindBy(name = "Email")
    public WebElement userName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='2']")
    public WebElement passWord;

    @FindBy(name = "Login")
    public WebElement loginButton;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
    public WebElement  drawerButton;

    @FindBy(name= "Recent Release")
    public WebElement recentFeature;

    @FindBy(name= "Recent Release")
    public WebElement assertRecentPage;

    @FindBy(name= "পলাতক")
    public WebElement assertRecentBook1;

    @AndroidFindBy(xpath = "//android.widget.RatingBar[@index='1']")
    public WebElement  rateThisBookStarSign;

    @FindBy(name= "Please purchase first to rate this book.")
    public WebElement rateThisBookPopUpMsg;

    @FindBy(name= "No")
    public WebElement rateThisBookPopUpMsgNo;

    @FindBy(name= "Yes")
    public WebElement rateThisBookPopUpMsgAddToCart;

    @FindBy(name= "Add to cart")
    public WebElement rateThisBookAddToCart;


    public String [] reviewWithoutPurchase(AppiumDriver driver) throws MalformedURLException, InterruptedException{

        userName.sendKeys("nadimsaker@gmail.com");
        passWord.sendKeys("123456");
        driver.hideKeyboard();

        loginButton.click();

        sleep (5000);

        drawerButton.click();

        recentFeature.click();

        sleep (10000);

        String [] resultArray = new String [4];

        resultArray [0] = assertRecentPage.getText();

        assertRecentBook1.click();

        rateThisBookStarSign.click();

        resultArray [1] = rateThisBookPopUpMsg.getText();
        resultArray [2] = rateThisBookPopUpMsgNo.getText();
        resultArray [3] = rateThisBookPopUpMsgAddToCart.getText();

        return resultArray;

    }

}
