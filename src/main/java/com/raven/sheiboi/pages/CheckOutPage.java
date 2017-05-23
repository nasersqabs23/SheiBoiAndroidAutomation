package com.raven.sheiboi.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class CheckOutPage {

    public CheckOutPage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @FindBy(name = "Book Store")
    public WebElement assertBookStore;

    @FindBy(name = "RECENT")
    public WebElement assertRecentTab;

    @FindBy(name = "আপাই তাপাই")
    public WebElement assertBook1;

    @FindBy(name = "আপাই তাপাই")
    public WebElement Book1;

    @FindBy(name = "সুমিত্রা")
    public WebElement assertBook2;

    @FindBy(name = "সুমিত্রা")
    public WebElement Book2;

    @FindBy(name = "জল ঠোঁটে উড়ো মেঘ")
    public WebElement assertBook3;

    @FindBy(name = "জল ঠোঁটে উড়ো মেঘ")
    public WebElement Book3;

    @FindBy(name = "Add to cart")
    public WebElement addToCartButton;

    @FindBy(name = "Add to cart")
    public WebElement addToCartOption;

    @AndroidFindBy(xpath= "//android.widget.ImageView[@index= '1']")
    public WebElement cartButton;

    @FindBy(name = "Others")
    public WebElement checkOutOthersOption;

    @FindBy(name = "Book store")
    public WebElement bookStoreButton;

    @AndroidFindBy(xpath= "//android.widget.ImageButton[@index= '0']")
    public WebElement cartBackSign;

    @FindBy(name = "Checkout")
    public WebElement checkOutButton;

    @AndroidFindBy(xpath= "//android.widget.Button[@index= '0']")
    public WebElement payButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc= 'Cancel']")
    public WebElement cancelButton;

    @FindBy(name = "Cart is empty.")
    public WebElement cartIsEmpty;

    @FindBy(id = "raven.reader:id/tv_add_shopping_cart_counter")
    public WebElement assertCartQuantity;

    public String[] SheiBoiCheckOutFromDetails(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);
        assertRecentTab.click();

        sleep(5000);

        String[] resultArray = new String[9];
        resultArray [0] = assertBookStore.getText();
        resultArray [1] = assertRecentTab.getText();

        driver.tap(1,592,233,1);
        addToCartOption.click();
        resultArray [2] = assertCartQuantity.getText();
        cartButton.click();
        cartBackSign.click();

        resultArray [3] = assertBook1.getText();

        sleep(5000);

        driver.tap(1,592,443,1);
        addToCartOption.click();
        resultArray [4] = assertCartQuantity.getText();
        cartButton.click();
        cartBackSign.click();

        resultArray [5] = assertBook2.getText();

        sleep(5000);

        driver.tap(1,592,653,1);
        addToCartOption.click();
        resultArray [6] = assertCartQuantity.getText();
        cartButton.click();

        resultArray [7] = assertBook3.getText();

        checkOutOthersOption.isSelected();
        checkOutButton.click();

        sleep(10000);

        cancelButton.click();

        sleep(10000);

        resultArray [8] = cartIsEmpty.getText();

        return  resultArray;
    }

    public void SheiBoiCheckOutFromList(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);
        assertRecentTab.click();

        sleep(5000);
        String[] resultArray = new String[4];

        Book1.click();
        addToCartButton.click();
        cartButton.click();
        bookStoreButton.click();

        Book2.click();
        addToCartButton.click();
        cartButton.click();
        bookStoreButton.click();

        Book3.click();
        addToCartButton.click();
        cartButton.click();

        checkOutOthersOption.isSelected();
        checkOutButton.click();
        cancelButton.click();
    }
}
