package com.raven.sheiboi.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class HelpPage {

    public HelpPage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @FindBy(name = "হেল্প")
    public WebElement assertHelpPage;

    @FindBy(name = "শুরু করুন")
    public WebElement assertShuruKorun;

    @FindBy(name = "বই পড়া শুরু করুন")
    public WebElement assertBoiPoraSuruKorun;

    @FindBy(name = "একটি মাত্র ধাপে ফ্রি রেজিস্ট্রেশন করুন")
    public WebElement assertAktiMatroDhapeFreeRegistrationKorun;

    @FindBy(name = "নতুন বই সংগ্রহ করুন")
    public WebElement assertNotunBoiSongrohoKorun;

    @FindBy(name = "রিডিং ফিচার")
    public WebElement assertReadingFeature;

    @FindBy(name = "সিলেকশন ফিচার")
    public WebElement assertSelectionFeature;

    @FindBy(name = "সিঙ্ক সুবিধা")
    public WebElement assertSyncSubidha;

    @FindBy(name = "ওয়ালেট রিচার্জ করুন")
    public WebElement assertWalletRechargeKorun;

    @FindBy(name = "আপনার প্রতিক্রিয়া (Feedback) পাঠান")
    public WebElement assertApnarProtikriyaPathan;

    @FindBy(name = "হেল্পলাইন")
    public WebElement assertHelpLine;


    public void ShuruKorun(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);
        assertShuruKorun.click();
        sleep(10000);
        assertShuruKorun.click();

    }

    public void BoiPoraShuruKorun(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);
        assertBoiPoraSuruKorun.click();
        sleep(10000);
        assertBoiPoraSuruKorun.click();

    }

    public void AktiMatroDhapeFreeRegistrationKorun(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);
        assertAktiMatroDhapeFreeRegistrationKorun.click();
        sleep(10000);
        assertAktiMatroDhapeFreeRegistrationKorun.click();

    }

    public void NotunBoiSongrohoKorun(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);
        assertNotunBoiSongrohoKorun.click();
        sleep(10000);
        assertNotunBoiSongrohoKorun.click();

    }

    public void ReadingFeature(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);
        assertReadingFeature.click();
        sleep(10000);
        assertReadingFeature.click();

    }

    public void SelectionFeature(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);
        assertSelectionFeature.click();
        sleep(10000);
        assertSelectionFeature.click();

    }

    public void SyncSubidha(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);
        assertSyncSubidha.click();
        sleep(10000);
        assertSyncSubidha.click();

    }

    public void WalletRechargeKorun(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);
        assertWalletRechargeKorun.click();
        sleep(10000);
        assertWalletRechargeKorun.click();

    }

    public void ApnarProtikriyaPathan(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);
        assertApnarProtikriyaPathan.click();
        sleep(10000);
        assertApnarProtikriyaPathan.click();

    }

    public void HelpLine(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(5000);
        assertHelpLine.click();
        sleep(10000);
        assertHelpLine.click();

    }
}
