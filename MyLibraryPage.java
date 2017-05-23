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

public class MyLibraryPage {

    public  MyLibraryPage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @FindBy(name = "আমার লাইব্রেরী")
    public WebElement assertMyLibrary;

    @FindBy(name = "দীপাবলী সংখ্যা")
    public WebElement assertBook1;

    @FindBy(name = "দুই বোন")
    public WebElement assertBook5;

    @FindBy(name = "দুর্গেশনন্দিনী")
    public WebElement assertBook6;

    @FindBy(name = "ঈদ ম্যাগাজিন")
    public WebElement assertBook2;

    @FindBy(name = "ঈমানদীপ্ত দাস্তান প্রথম খণ্ড")
    public WebElement assertBook3;

    @FindBy(name = "ঝালাপালা")
    public WebElement assertBook7;

    @FindBy(name = "পদ্মা নদীর মাঝি")
    public WebElement assertBook9;

    @FindBy(name = "রূপসী বাংলা")
    public WebElement assertBook8;

    @FindBy(name = "শ্রীকান্ত প্রথম পর্ব")
    public WebElement assertBook4;

    @FindBy(name = "বিজ্ঞানী সফদর আলীর মহা মহা আবিষ্কার")
    public WebElement assertBook10;

    @FindBy(name = "ভূত সমগ্র")
    public WebElement assertBook11;

    @FindBy(name = "আমার লাইব্রেরী")
    public WebElement MyLibraryMenuButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index= '1']")
    public WebElement archievedSymbol;

    @FindBy(name = "আপনি কি বইটি ডাউনলোড করতে চান?")
    public WebElement assertPopUpMsgBookDownload;

    @FindBy(name = "No")
    public WebElement assertPopUpMsgBookDownloadNo;

    @FindBy(name = "Yes")
    public WebElement assertPopUpMsgBookDownloadYes;

    @AndroidFindBy(xpath= "//android.widget.TextView[@index='0']")
    public WebElement searchButton;

    @FindBy(name= "   Search books")
    public WebElement searchField;

    @FindBy(name = "দুই বোন")
    public WebElement assertBook;

    @AndroidFindBy(xpath= "//android.widget.ImageButton[@index='0']")
    public WebElement drawerMenuButton;

    @FindBy(name = "নতুন রিলিজ")
    public WebElement assertRecent;

    @FindBy(name = "বুক স্টোর")
    public WebElement assertBookStore;

    @FindBy(name = "হেল্প")
    public WebElement assertHelp;

    @FindBy(name = "তথ্য")
    public WebElement assertInfo;

    @FindBy(name = "ওয়ালেট রিচার্জ")
    public WebElement assertWalletRecharge;

    @FindBy(name = "প্রতিক্রিয়া")
    public WebElement assertFeedback;

    @FindBy(name = "লগ ইন")
    public WebElement assertLogin;

    @AndroidFindBy(xpath= "//android.widget.TextView[@index= '1']")
    public WebElement syncButton;

    @AndroidFindBy(xpath= "//android.widget.ImageView[@index= '1']")
    public WebElement cartButton;

    @AndroidFindBy(xpath= "//android.widget.ImageViews[@index='3']")
    public WebElement moreOption;

    @FindBy(name= "Grid")
    public WebElement gridOption;

    @FindBy(name= "List")
    public WebElement listOption;

    @FindBy(name= "Filter by")
    public WebElement filterOption;

    @FindBy(name= "Downloaded")
    public WebElement downloadedFilter;

    @FindBy(name= "Archived")
    public WebElement archivedFilter;

    @FindBy(name= "All")
    public WebElement allFilter;

    @FindBy(name= "Sort by")
    public WebElement sortOption;

    @FindBy(name= "By name")
    public WebElement byNameSort;

    @FindBy(name= "By author")
    public WebElement byAuthorSort;

    @FindBy(name= "By recent")
    public WebElement byRecentSort;

    @FindBy(name = "Email")
    public WebElement userName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")
    public WebElement passWord;

    @FindBy(name = "Login")
    public WebElement loginButton;

    @FindBy(name = "আমার লাইব্রেরী")
    public WebElement myLibrary;

    @FindBy(name = "আপনি কি বইটি ডাউনলোড করতে চান?")
    public WebElement myLibraryBookDownloadPopUp;

    @FindBy(name = "Yes")
    public WebElement myLibraryBookDownloadPopUpYes;

    @FindBy(name = "বিজ্ঞানী সফদর আলীর মহা মহা আবিষ্কার")
    public WebElement assertBook12;

    public void guestSheiBoiHeaderOption()throws MalformedURLException, InterruptedException{

        sleep(5000);

        drawerMenuButton.click();

        MyLibraryMenuButton.click();

        searchButton.isDisplayed();

        syncButton.isDisplayed();

        cartButton.isDisplayed();

        moreOption.click();

        gridOption.click();

        moreOption.click();

        listOption.click();

        moreOption.click();

        filterOption.click();

        downloadedFilter.click();

        moreOption.click();

        filterOption.click();

        archivedFilter.click();

        moreOption.click();

        filterOption.click();

        allFilter.click();

        moreOption.click();

        sortOption.click();

        byNameSort.click();

        moreOption.click();

        sortOption.click();

        byAuthorSort.click();

        moreOption.click();

        sortOption.click();

        byRecentSort.click();

    }

    public String[] guestSheiBoiListSysmbol() throws MalformedURLException, InterruptedException{

        sleep(5000);

        drawerMenuButton.click();

        MyLibraryMenuButton.click();

        moreOption.click();

        String[] resultArray = new String[3];

        resultArray [0] = gridOption.getText();

        resultArray [1] = filterOption.getText();

        resultArray [2] = sortOption.getText();

        return  resultArray;

    }

    public String[] guestSheiBoiListSymbolFilter() throws MalformedURLException, InterruptedException{

        sleep(5000);

        drawerMenuButton.click();

        MyLibraryMenuButton.click();

        moreOption.click();

        filterOption.click();

        String[] resultArray = new String[3];

        resultArray [0] = allFilter.getText();

        resultArray [1] = downloadedFilter.getText();

        resultArray [2] = archivedFilter.getText();

        return  resultArray;

    }

    public String[] guestSheiBoiListSymbolSort() throws MalformedURLException, InterruptedException{

        sleep(5000);

        drawerMenuButton.click();

        MyLibraryMenuButton.click();

        moreOption.click();

        sortOption.click();

        String[] resultArray = new String[3];

        resultArray [0] = byRecentSort.getText();

        resultArray [1] = byNameSort.getText();

        resultArray [2] = byAuthorSort.getText();

        return  resultArray;

    }

    public String[] guestSheiBoiFeatures()throws MalformedURLException, InterruptedException{

        sleep(5000);

        drawerMenuButton.click();

        String[] resultArray = new String[7];

        resultArray [0] = assertRecent.getText();

        resultArray [1] = assertMyLibrary.getText();

        resultArray [2] = assertBookStore.getText();

        resultArray [3] = assertHelp.getText();

        resultArray [4] = assertInfo.getText();

        resultArray [5] = assertWalletRecharge.getText();

        resultArray [6] = assertFeedback.getText();

        return resultArray;

    }

    public String[] myLibrarySearchCheck()throws MalformedURLException, InterruptedException{

        sleep(5000);

        drawerMenuButton.click();

        MyLibraryMenuButton.click();

        sleep(5000);

        searchButton.click();
        searchField.sendKeys("dui");

        String[] resultArray = new String[1];

        resultArray [0] = assertBook.getText();

        return resultArray;

    }

    public String[] browsMyLibraryBooks(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        drawerMenuButton.click();

        MyLibraryMenuButton.click();

        String[] resultArray = new String[9];

        resultArray [0] = assertMyLibrary.getText();

        resultArray [1] = assertBook1.getText();

        resultArray [2] = assertBook2.getText();

        resultArray [3] = assertBook3.getText();

        resultArray [4] = assertBook4.getText();

        resultArray [5] = assertBook5.getText();

        driver.swipe(18, 794, 18, 102, 3000);

        resultArray [6] = assertBook6.getText();

        resultArray [7] = assertBook7.getText();

        resultArray [8] = assertBook8.getText();

        return resultArray;

    }

    public void guestSheiBoiArchievedSymbol()throws MalformedURLException, InterruptedException{

        sleep(5000);

        drawerMenuButton.click();

        MyLibraryMenuButton.click();

        assertMyLibrary.getText();

        archievedSymbol.isDisplayed();

    }

    public  String [] guestSheiBoiArchievedBookDownloadPopUp()throws MalformedURLException, InterruptedException{

        sleep(5000);

        drawerMenuButton.click();

        MyLibraryMenuButton.click();

        assertMyLibrary.getText();

        assertBook1.click();

        String [] resultArray = new  String[3];

        resultArray [0] = assertPopUpMsgBookDownload.getText();
        resultArray [1] = assertPopUpMsgBookDownloadNo.getText();
        resultArray [2] = assertPopUpMsgBookDownloadYes.getText();

        return  resultArray;

    }

   // -----------------------------------  Registered User Methods     ------------------------------------------------

    public void userSheiBoiHeaderOption(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("shajib2017@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        sleep(10000);

        searchButton.isDisplayed();

        syncButton.isDisplayed();

        cartButton.isDisplayed();

        //moreOption.click();

        driver.tap(1,640,8,1);
        sleep(5000);

        gridOption.click();

        sleep(5000);

        //moreOption.click();
        driver.tap(1,640,8,1);
        sleep(5000);

        listOption.click();

        sleep(5000);

       // moreOption.click();
        driver.tap(1,640,8,1);
        sleep(5000);

        filterOption.click();
        sleep(5000);

        downloadedFilter.click();
        sleep(5000);

        //moreOption.click();
        driver.tap(1,640,8,1);
        sleep(5000);

        filterOption.click();
        sleep(5000);

        archivedFilter.click();
        sleep(5000);

        //moreOption.click();
        driver.tap(1,640,8,1);
        sleep(5000);

        filterOption.click();
        sleep(5000);

        allFilter.click();
        sleep(5000);

        //moreOption.click();
        driver.tap(1,640,8,1);
        sleep(5000);

        sortOption.click();
        sleep(5000);

        byNameSort.click();
        sleep(5000);

        //moreOption.click();
        driver.tap(1,640,8,1);
        sleep(10000);

        sortOption.click();
        sleep(5000);
        byAuthorSort.click();
        sleep(5000);
        //moreOption.click();
        driver.tap(1,640,8,1);
        sleep(5000);

        sortOption.click();
        sleep(5000);

        byRecentSort.click();
        sleep(5000);

    }

    public String[] userSheiBoiListSysmbol(AppiumDriver driver) throws MalformedURLException, InterruptedException{

        sleep(5000);
        userName.sendKeys("shajib2017@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        sleep(5000);

       // moreOption.click();
        driver.tap(1,680,8,1);
        sleep(5000);

        String[] resultArray = new String[3];

        resultArray [0] = gridOption.getText();

        resultArray [1] = filterOption.getText();

        resultArray [2] = sortOption.getText();

        return  resultArray;

    }

    public String[] userSheiBoiListSymbolFilter(AppiumDriver driver) throws MalformedURLException, InterruptedException{

        sleep(5000);
        userName.sendKeys("shajib2017@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        sleep(5000);

        //moreOption.click();
        driver.tap(1,680,8,1);
        sleep(5000);

        filterOption.click();

        String[] resultArray = new String[3];

        resultArray [0] = allFilter.getText();

        resultArray [1] = downloadedFilter.getText();

        resultArray [2] = archivedFilter.getText();

        return  resultArray;

    }

    public String[] userSheiBoiListSymbolSort(AppiumDriver driver) throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("shajib2017@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        sleep(10000);

        //moreOption.click();
        driver.tap(1,680,8,1);
        sleep(5000);

        sortOption.click();

        sleep(5000);

        String[] resultArray = new String[3];

        resultArray [0] = byRecentSort.getText();

        resultArray [1] = byNameSort.getText();

        resultArray [2] = byAuthorSort.getText();

        return  resultArray;

    }


    public String[] userSheiBoiFeatures(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("shajib2017@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        sleep(5000);

        drawerMenuButton.click();

        String[] resultArray = new String[7];

        resultArray [0] = assertRecent.getText();

        resultArray [1] = assertMyLibrary.getText();

        resultArray [2] = assertBookStore.getText();

        resultArray [3] = assertHelp.getText();

        resultArray [4] = assertInfo.getText();

        resultArray [5] = assertWalletRecharge.getText();

        resultArray [6] = assertFeedback.getText();

        return resultArray;

    }

    public String[] usermyLibrarySearchCheck(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("shajib2017@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        sleep(5000);

        searchButton.click();

        searchField.sendKeys("dui");

        String[] resultArray = new String[1];

        resultArray [0] = assertBook.getText();

        return resultArray;

    }

    public String[] userbrowsMyLibraryBooks(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("shajib2017@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        sleep(5000);

        String[] resultArray = new String[9];

        resultArray [0] = assertMyLibrary.getText();

        resultArray [1] = assertBook10.getText();

        resultArray [2] = assertBook11.getText();

        resultArray [3] = assertBook1.getText();

        resultArray [4] = assertBook2.getText();

        resultArray [5] = assertBook3.getText();

        driver.swipe(18, 794, 18, 102, 3000);

        resultArray [6] = assertBook7.getText();

        resultArray [7] = assertBook8.getText();

        resultArray [8] = assertBook4.getText();


        return resultArray;

    }

    public void userSheiBoiArchievedSymbol(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("shajib2017@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        sleep(5000);

        assertMyLibrary.getText();

        archievedSymbol.isDisplayed();

    }

    public  String [] userSheiBoiArchievedBookDownloadPopUp(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("shajib2017@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        sleep(5000);

        assertMyLibrary.getText();

        assertBook1.click();

        String [] resultArray = new  String[3];

        resultArray [0] = assertPopUpMsgBookDownload.getText();
        resultArray [1] = assertPopUpMsgBookDownloadNo.getText();
        resultArray [2] = assertPopUpMsgBookDownloadYes.getText();

        return  resultArray;

    }
//11
    public String[] mylibrarybookdownloadCheck(AppiumDriver driver) throws MalformedURLException, InterruptedException{

        sleep(5000);

        userName.sendKeys("shajib2017@gmail.com");

        driver.hideKeyboard();

        passWord.sendKeys("123456");

        driver.hideKeyboard();

        loginButton.click();

        sleep(10000);


       assertMyLibrary.getText();

       sleep(5000);

        assertBook12.click();

        sleep(10000);

        String[] resultArray = new String[3];

        sleep(10000);

        //resultArray [0] = myLibrary.getText();

        resultArray [0] = assertBook12.getText();

        resultArray [1] = myLibraryBookDownloadPopUp.getText();

        resultArray [2] = myLibraryBookDownloadPopUpYes.getText();

        myLibraryBookDownloadPopUpYes.click();

        sleep(20000);


        return  resultArray;

    }
}


