package com.raven.sheiboi.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;


public class RegistrationPage {

    public  RegistrationPage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    //TC/FreeRegistration/001	Verify that error message is displayed for mandatory field after tapping "Register New Account" without entering any value


    @FindBy(name= "Please enter your name. Name should be at least 3 characters.")
    public WebElement assertMsgForMandatoryFieldName;

    public String[] mandatoryFieldTest( AppiumDriver driver){

        freeRegistrationButton.click();

        registerNewAccountButton.click();

        String [] resultArray = new  String[1];

        resultArray [0] = assertMsgForMandatoryFieldName.getText();

        clkOkButtonFromPopUp.click();

        return resultArray;

    }

    //TC/FreeRegistration/002	Verify that error message is displayed when entering less than 3digits in the "Name" field

    @FindBy(name= "Name")
    public WebElement nameField;

    public String[] nameFieldLength(String name, AppiumDriver driver)throws MalformedURLException, InterruptedException{

        freeRegistrationButton.click();

        nameField.sendKeys(name);

        driver.hideKeyboard();

        registerNewAccountButton.click();

        String [] resultArray = new  String[1];

        resultArray [0] = assertMsgForMandatoryFieldName.getText();

        clkOkButtonFromPopUp.click();

        return resultArray;

    }


    //TC/FreeRegistration/004	"Verify that error message is displayed when entering wrong/invalid email format in the ""Email"" field"


    //Click on Registration link from login page (for registered user for a new user)

    @AndroidFindBy(xpath= "//android.widget.Button[@text='ফ্রি রেজিস্ট্রেশান']")
    public WebElement freeRegistrationButton;

    //Enter Email field
    @FindBy(name= "Email")
    public WebElement emailField;

    //Tap "Register New Account" button
    @AndroidFindBy(xpath= "//android.widget.Button[@text='Register New Account']")
    public WebElement registerNewAccountButton;

    //Tap "Ok" from popup message
    @AndroidFindBy(xpath= "//android.widget.Button[@text='Ok']")
    public WebElement clkOkButtonFromPopUp;

    @FindBy(name = "Please enter valid email address.")
    public WebElement assertPopUpMsgForInvalidEmail;

    public String[] emailValidationCheck(String name, String email, AppiumDriver driver){

        freeRegistrationButton.click();
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        driver.hideKeyboard();
        registerNewAccountButton.click();

        String [] resultArray = new  String[1];

        resultArray [0] = assertPopUpMsgForInvalidEmail.getText();

        clkOkButtonFromPopUp.click();

        return resultArray;

    }
    //TC/FreeRegistration/005	Verify that only number is allowed in the "Phoen" field


    //Enter Phone No field
    @FindBy(name= "Phone")
    public WebElement phoneField;

    //Tap "Ok" from popup message
    @AndroidFindBy(xpath= "//android.widget.Button[@text='Ok']")
    public WebElement clkPhoneOkButtonFromPopUp;

    @FindBy(name = "Please enter at least 6 characters in password field.")
    public WebElement assertPopUpMsgForPhone;


    public String[] phoneNoValidation( String name, String email, String phone, AppiumDriver driver){

        freeRegistrationButton.click();
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        phoneField.sendKeys(phone);
        driver.hideKeyboard();
        iAgreeCheckBox.click();
        registerNewAccountButton.click();

        String [] resultArray = new  String[1];

        resultArray [0] = assertPopUpMsgForPhone.getText();

        clkOkButtonFromPopUp.click();

        return resultArray;

    }
    //TC/FreeRegistration/006	"Verify that error message is displayed when entering less than 6 digits in the ""Password"" field


    //Click Password Field
    @AndroidFindBy(xpath= "//android.widget.EditText[@index = '3']")
    public WebElement passwordField;

    //Tap "Ok" from popup message for Password field
    @FindBy(xpath= "//android.widget.Button[@text='Ok']")
    public WebElement clkOkButtonFromPopUpWhenPasswordLessThanSix;

    //Assert with PopUp message
    @FindBy(name = "Please enter at least 6 characters in password field.")
    public WebElement assertPopUpMsgForPasswordLessThanSix;


    public String[] passwordLessLength( String name, String email, String phone, String password, AppiumDriver driver){

        freeRegistrationButton.click();
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        phoneField.sendKeys(phone);
        passwordField.sendKeys(password);
        driver.hideKeyboard();
        iAgreeCheckBox.click();
        registerNewAccountButton.click();

        String [] resultArray = new  String[1];

        resultArray [0] = assertPopUpMsgForPasswordLessThanSix.getText();

        clkOkButtonFromPopUp.click();

        return resultArray;

    }

    //TC/FreeRegistration/007	Verify that password field can be taken all keyboard input


    //Assert with PopUp message with Re-type password
    @FindBy(name = "Please enter password")
    public WebElement assertPopUpMsgForReTypePassword;

    public String[] passwordCombination( String name, String email, String phone, String password, AppiumDriver driver){

        freeRegistrationButton.click();
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        phoneField.sendKeys(phone);
        passwordField.sendKeys(password);
        driver.hideKeyboard();
        iAgreeCheckBox.click();
        registerNewAccountButton.click();

        String [] resultArray = new  String[1];

        resultArray [0] = assertPopUpMsgForReTypePassword.getText();

        clkOkButtonFromPopUp.click();

        return resultArray;

    }
    //TC/FreeRegistration/008	"Verify that error message is displayed when ""Password and Repeat Password"" field is not matched"

    //Click Password Field
    @AndroidFindBy(xpath = "//android.widget.EditText[@index = '4']")
    public WebElement reTypePasswordField;

    //Tap "Ok" from popup message for Re-type Password field
    //@AndroidFindBy(xpath= "//android.widget.Button[@text='Ok']")
   // public WebElement clkOkButtonFromPopUpWhenPasswordReTypePasswordMismatch;

    //Assert with PopUp message with Re-type password
    @FindBy(name = "Password does not match")
    public WebElement assertPopUpMsgForPasswordReTypePasswordMismatch;

    public String[] passwordRetypePasswordMismatch( String name, String email, String phone, String password, String repassword, AppiumDriver driver){
        freeRegistrationButton.click();
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        phoneField.sendKeys(phone);
        passwordField.sendKeys(password);
        driver.hideKeyboard();
        reTypePasswordField.sendKeys(repassword);
        driver.hideKeyboard();
        iAgreeCheckBox.click();
        registerNewAccountButton.click();

        String [] resultArray = new  String[1];

        resultArray [0] = assertPopUpMsgForPasswordReTypePasswordMismatch.getText();

        clkOkButtonFromPopUp.click();

        return resultArray;

    }
    //TC/FreeRegistration/009	"Verify that entered all required info and tapping ""Register New Account"" is displayed ""sheiboi"" homepage as a logged in"


    //Assert with PopUp message with Re-type password
    @FindBy(name = "আমার লাইব্রেরী")
    public WebElement assertMyLibraryText;

    @AndroidFindBy(xpath= "//android.widget.CheckBox[@index ='0']")
    public WebElement iAgreeCheckBox;

    public String[] loginSheiboiThrougRegistration(String name, String email, String phone, String password, String repassword, AppiumDriver driver)throws MalformedURLException, InterruptedException{

        freeRegistrationButton.click();
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        phoneField.sendKeys(phone);
        passwordField.sendKeys(password);
        driver.hideKeyboard();
        reTypePasswordField.sendKeys(repassword);
        driver.hideKeyboard();
        iAgreeCheckBox.click();
        registerNewAccountButton.click();

        sleep(10000);

        String [] resultArray = new  String[1];

        resultArray [0] = assertMyLibraryText.getText();

        return resultArray;

    }
    //TC/FreeRegistration/010	Verify that error message "Email already exist" is displayed after registering existing email in sheiboi.


    //Assert with duplicate Email message
    @FindBy(name = "Email/User already exists")
    public WebElement assertDuplicateEmailTextMsg;

    public String[] duplicateEmail( String name, String email, String phone, String password, String repassword, AppiumDriver driver){

        freeRegistrationButton.click();
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        phoneField.sendKeys(phone);
        passwordField.sendKeys(password);
        driver.hideKeyboard();
        reTypePasswordField.sendKeys(repassword);
        driver.hideKeyboard();
        iAgreeCheckBox.click();
        registerNewAccountButton.click();

        String [] resultArray = new  String[1];
        resultArray [0] = assertDuplicateEmailTextMsg.getText();
        clkOkButtonFromPopUp.click();
        return resultArray;

    }
    //TC/FreeRegistration/011	Verify that tapping on "Already has an account...." is displayed Registration page

    //Assert with duplicate Email message
    @FindBy(name = "Already has account! Login here")
    public WebElement assertAlreadyHasAccount;

    public String[] alreadyHasAccountCheck( AppiumDriver driver){


        freeRegistrationButton.click();

        String [] resultArray = new  String[1];
        resultArray [0] = assertAlreadyHasAccount.getText();
        return resultArray;

    }

    //TC/FreeRegistration/013	Verify that clicking on "Terms of Use" will go to the  "Terms of Use" page.

    //Assert with terms of Use Link Test
    @FindBy(name = "I agree to the Terms of Use and Privacy Policy.")
    public WebElement termsOfUseClick;

    @FindBy(name = "SheiBoi")
    public WebElement assertSheiboiTermsOfUse;


    public String[] termsOfUseLink( AppiumDriver driver)throws MalformedURLException, InterruptedException{

        freeRegistrationButton.click();
        termsOfUseClick.click();

        sleep(10000);

        String [] resultArray = new  String[1];
        resultArray [0] = assertSheiboiTermsOfUse.getText();
        return resultArray;

    }

    //TC/FreeRegistration/015	"Verify that if the ""location"" is on then after registereduser apps will automatically obtain the actual location and according to the location will display the currency(Dollar/Taka)"


    //Assert with PopUp message with Re-type password
    //Tap "Drawer" from My Library
    @AndroidFindBy(xpath= "//android.widget.ImageButton[@index='0']")
    public WebElement clkDrawerButton;
    @FindBy(name = "নতুন রিলিজ")
    public WebElement clkRecentRelease;
    @FindBy(name = "৳50.0")
    public WebElement assertCurrencyTk;

    public String[] currencyTakaDisplayedWhenLocationOn( String name, String email, String phone, String password, String repassword, AppiumDriver driver)throws MalformedURLException, InterruptedException{

        freeRegistrationButton.click();
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        phoneField.sendKeys(phone);
        passwordField.sendKeys(password);
        driver.hideKeyboard();
        reTypePasswordField.sendKeys(repassword);
        driver.hideKeyboard();
        iAgreeCheckBox.click();
        registerNewAccountButton.click();

        sleep(10000);

        String [] resultArray = new  String[2];

        resultArray [0] = assertMyLibraryText.getText();

        sleep(5000);

        clkDrawerButton.click();

        sleep(5000);

        clkRecentRelease.click();

        sleep(10000);

        resultArray [1] = assertCurrencyTk.getText();

        return resultArray;

    }

    //TC/FreeRegistration/016	"Verify that if the ""location"" is off then after registereduser a pop up message ""This apps wants to change your device settings"" will be displayed."

    @FindBy(name= "No")
    public WebElement clkNoButton;
    @FindBy(name= "Use location?")
    public WebElement assertUseLocation;
    @FindBy(name= "")
    public WebElement assertCurrencyDollar;


    public String[] currencyDollarDisplayedWhenLocationOff( AppiumDriver driver)throws MalformedURLException, InterruptedException{

        freeRegistrationButton.click();

        sleep(5000);

        String [] resultArray = new  String[3];

        resultArray [0] = assertUseLocation.getText();
        clkNoButton.click();
        nameField.sendKeys("mahid");
        emailField.sendKeys("mahid.abn@gmail.com");
        phoneField.sendKeys("01777815236");
        passwordField.sendKeys("$1a@2b#3C%");
        driver.hideKeyboard();
        reTypePasswordField.sendKeys("$1a@2b#3C%");
        driver.hideKeyboard();
        registerNewAccountButton.click();

        resultArray [1] = assertMyLibraryText.getText();

        clkDrawerButton.click();

        clkRecentRelease.click();
        sleep(10000);

        resultArray [2] = assertCurrencyDollar.getText();

        return resultArray;

    }



}


