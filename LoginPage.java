package com.raven.sheiboi.pages;

import com.raven.sheiboi.utilities.AppAuthentication;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class LoginPage {

    public  LoginPage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
//-----------/
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
    @FindBy(name = "Later")
    public WebElement laterpopup;

    @FindBy(name = "ভূত সমগ্র")
    public WebElement assertBook11;
    //--------/
    @FindBy(name = "Email")
    public WebElement userName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")
    public WebElement passWord;

    @FindBy(name = "Login")
    public WebElement loginButton;


    @FindBy(name= "Please enter valid email address or password.")
    public WebElement errorMessageForBlankLogin;

    @FindBy(name= "User name or password is incorrect.")
    public WebElement errorMessageForWrongPasswordLogin;

    @FindBy(name= "Please enter valid email address or password.")
    public WebElement errorMessageForInvalidEmailLogin;

    @FindBy(name= "Ok")
    public WebElement okButtonErrorMessageDialog;


    public void loginWithUserNameAndPassword(String email, String password,AppiumDriver driver) throws MalformedURLException, InterruptedException{

        if (email == "" && password == "") {

            userName.sendKeys(email);
            sleep(5000);
            //driver.hideKeyboard();
            passWord.sendKeys(password);
            //driver.hideKeyboard();
            loginButton.click();
            sleep(5000);
        }
        else {

            userName.sendKeys(email);
            sleep(5000);
            //driver.hideKeyboard();
            //sleep(5000);
            passWord.sendKeys(password);
            sleep(5000);
            //driver.hideKeyboard();
            loginButton.click();
            sleep(5000);
            laterpopup.click();
            sleep(5000);

        }

    }

    //For all case
    public void logIn(){
        if(!AppAuthentication.isGuest()){
            userName.sendKeys(AppAuthentication.appUserName);
            passWord.sendKeys(AppAuthentication.appPassword);
            loginButton.click();
        }
    }
//------------
public String[] userbrowsMyLibraryBooks(AppiumDriver driver)throws MalformedURLException, InterruptedException{


    sleep(5000);

    String[] resultArray = new String[1];

   resultArray [0] = assertMyLibrary.getText();

    /** resultArray [1] = assertBook10.getText();

    resultArray [2] = assertBook11.getText();

    resultArray [3] = assertBook1.getText();

    resultArray [4] = assertBook2.getText();

    resultArray [5] = assertBook3.getText();**/


    return resultArray;

}
   // ------------------

    public String getErrorMessageForBlankUsernamePassword()throws MalformedURLException, InterruptedException {

        return errorMessageForBlankLogin.getText();
    }


    public String getErrorMessageForInvalidEmail()throws MalformedURLException, InterruptedException {

        return errorMessageForInvalidEmailLogin.getText();
    }

    public String getErrorMessageForWrongPassword()throws MalformedURLException, InterruptedException {

        return errorMessageForWrongPasswordLogin.getText();
    }

    public void closeErrormessageDialog() throws MalformedURLException, InterruptedException {
        okButtonErrorMessageDialog.click();
        sleep(5000);

    }


    @FindBy(name = "আমার লাইব্রেরী")
    public WebElement assertMyLibraryText;

    public String  assertMyLibrary()throws MalformedURLException, InterruptedException{

        sleep(5000);

        return assertMyLibraryText.getText();
    }



   @FindBy(name= "Email")
   public WebElement assertEmailField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")
    public WebElement  assertPasswordField;

    @FindBy(name = "Cancel")
    public WebElement cancelButton;

    public void cancelButtonCloseAppTest() {
        //assert with Email field is displayed return true value
        assertEmailField.isDisplayed();
        //assert with Password field is displayed return true value
        assertPasswordField.isDisplayed();

        cancelButton.click();

    }



    @FindBy(name = "Forgot password? Click here")
    public WebElement clkForgotPassword;
    @FindBy(name = "Reset password")
    public WebElement assertResetPassword;
    @FindBy(name = "email")
    public WebElement assertEmailPasswordResetPopup;



    public String [] forgotPasswordLink(AppiumDriver driver)throws MalformedURLException, InterruptedException{
        //Clk forgot password link
        sleep(10000);
        clkForgotPassword.click();
        String [] resultArray = new  String[2];

        resultArray [0] = assertResetPassword.getText();
        resultArray [1] = assertEmailPasswordResetPopup.getText();

        return resultArray;

    }

    public void invalidEmailForResetPassword(String email, AppiumDriver driver)throws MalformedURLException, InterruptedException{

        assertEmailPasswordResetPopup.sendKeys(email);

    }


    @FindBy(name = "Success! Please check your email to reset password")
    public WebElement  assertEmailConfirmationFromResetPassword;

    @FindBy(name = "Forgot password? Click here")
    public WebElement  assertForgotPassword;

    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'Login']")
    public WebElement  assertLoginButtonInLoginPage;
    @FindBy(name = "Ok")
    public WebElement  clkOkFromResetPw;

    public String [] loginPageIsDisplayedAfterOkClk(AppiumDriver driver)throws MalformedURLException, InterruptedException{
        //Clk forgot password link

        sleep(5000);

        assertForgotPassword.click();
        String [] resultArray = new  String[1];
        resultArray [0] = assertResetPassword.getText();
        sleep(5000);
        clkOkFromResetPw.click();


        return resultArray;

    }

}





