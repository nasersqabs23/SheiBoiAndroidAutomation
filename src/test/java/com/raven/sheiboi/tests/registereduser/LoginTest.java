package com.raven.sheiboi.tests.registereduser;

import com.raven.sheiboi.pages.LoginPage;
import com.raven.sheiboi.pages.StartUpPage;
import com.raven.sheiboi.utilities.AppInitializer;
import com.raven.sheiboi.utilities.ReadWriteExcelFile;
import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import static org.junit.Assert.assertArrayEquals;

public class LoginTest {

    AppiumDriver driver;
    StartUpPage startUpPage;
    LoginPage loginPage;


    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app =new AppInitializer();
        driver = app.getDriver();

        startUpPage = new StartUpPage(driver);
        loginPage=new LoginPage(driver);

        startUpPage.navigateToLoginPage();
    }

    @Test
    public void loginTestWithValidEmailandPassword()throws MalformedURLException, InterruptedException{


        loginPage.loginWithUserNameAndPassword("shajib2018@gmail.com","123456",driver);
        String[] expectedArray = {"আমার লাইব্রেরী"};

        assertArrayEquals(expectedArray,  loginPage.userbrowsMyLibraryBooks(driver));

        loginPage.loginWithUserNameAndPassword("mahid.mahad@gmail.com","123456",driver);

        //Compare with My Library text for successful login
        Assert.assertEquals("আমার লাইব্রেরী",loginPage.assertMyLibrary());


    }

    //TC/LogIn/001	"Verify that error message is displayed when tapping ""Login"" button without entering any value in the ""Email & Password"" field"
    //Written By : Kana
    @Test
    public  void verifyLoginWithBlankUsernamePassword()throws MalformedURLException, InterruptedException{

        //Log in with blank user name and password
        loginPage.loginWithUserNameAndPassword(" "," ", driver);

        //Compare error message for blank user name password
        Assert.assertEquals("Please enter valid email address or password.",loginPage.getErrorMessageForBlankUsernamePassword());

        //Close error message dialog
        loginPage.closeErrormessageDialog();

    }

    //TC/LogIn/002	Verify that error message is displayed for invalid/wrong email format
    //Written By : Kana
    @Test
    public void verifyErrormessageForInvalidEmailFormat()throws MalformedURLException, InterruptedException{
        //Navigate to log in page


        //Log in with blank user name and password
        loginPage.loginWithUserNameAndPassword("mahid.mahad.gmail.com","123456",driver);

        //Compare error message for blank user name password
        Assert.assertEquals("Please enter valid email address or password.",loginPage.getErrorMessageForInvalidEmail());

        //Close error message dialog
        loginPage.closeErrormessageDialog();

    }


    //TC/LogIn/003	"Verify that error message is displayed if enter worng password in the ""Password"" field"
    @Test
    public void verifyErrormessageForWrongPasseword()throws MalformedURLException, InterruptedException{

        //Log in with blank user name and password
        loginPage.loginWithUserNameAndPassword("mahid.mahad@gmail.com","123456789", driver);

        //Compare error message for blank user name password
        Assert.assertEquals("User name or password is incorrect.",loginPage.getErrorMessageForWrongPassword());

        //Close error message dialog
        loginPage.closeErrormessageDialog();

    }

    //TC/LogIn/004	Verify that enter valid "email and password" then tapping on "Login" will login successfully and will display the sheiboi "My Library".

    @Test
    public void successfullLoginWithValidEmailPassword() throws IOException, InterruptedException{
        //Navigate to log in page

        ReadWriteExcelFile readWriteExcelFile = new ReadWriteExcelFile();

        String username = readWriteExcelFile.readXLSXFile(1,8);
        String password = readWriteExcelFile.readXLSXFile(1,10);


        //Log in with blank user name and password
        loginPage.loginWithUserNameAndPassword(username,password, driver);

       //when assert MY Library into an array
        String [] expectedArray = {"আমার লাইব্রেরী"};


        readWriteExcelFile.writeXLSXFile(1,5,loginPage.assertMyLibrary());

    }


    //TC/LogIn/005	Verify that tapping on "Cancel" is closed "sheiboi" apps

   @Test
   public void clkCancelButtonToCloseApp()throws MalformedURLException, InterruptedException{

       LoginPage loginPage=new LoginPage(driver);

       //Click Cancel Button To Close App
       loginPage.cancelButtonCloseAppTest();

  }


 //TC/ForgotPassword/001	"Verify that tapping on ""Forgot your password..."" is displayed a ""Reset Password"" pop up form with email"

  @Test
   public void forgotPasswordLinkTest() throws MalformedURLException, InterruptedException {

     LoginPage loginPage = new LoginPage(driver);

      //when assert Reset Password and Email into an array
        String[] expectedArray = {"Reset password","email"};

      //Compare with "Reset Password and Email" from forgot password link
      assertArrayEquals(expectedArray, loginPage.forgotPasswordLink(driver));


   }

     //TC/ForgotPassword/002	Verify that error message is displayed for invalid/wrong "Email".

    @Test
   public void invalidEmailForResetPasswordTest() throws MalformedURLException, InterruptedException {

        //LoginPage loginPage = new LoginPage(driver);

        String[] expectedArray = {"Reset password", "email"};

        assertArrayEquals(expectedArray, loginPage.forgotPasswordLink(driver));

        loginPage.invalidEmailForResetPassword("mahid.mahad.gmail.com", driver);

        //  Click Ok Button method call from  login page
        //assertArrayEquals(expectedArray, loginPage.loginPageIsDisplayedAfterOkClk(driver));

        loginPage.closeErrormessageDialog();

        //Toast message  assert is not possible

   }

     //TC/ForgotPassword/003	Verify that tapping on "Ok" from pop up message is displayed "Login" page again
    //Could not assert with Login Button, but should be assert with LOGIN button

    @Test
    public void loginPageIsDisplayedAfterOkClkTest() throws MalformedURLException, InterruptedException {

        LoginPage loginPage = new LoginPage(driver);

        String[] expectedArray = {"Reset password"};

        assertArrayEquals(expectedArray, loginPage.loginPageIsDisplayedAfterOkClk(driver));

  }

   @After
   public void tearDown()
   {
       driver.quit();
   }

}
