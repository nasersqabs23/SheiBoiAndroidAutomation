package com.raven.sheiboi.tests.registereduser;

import com.raven.sheiboi.pages.RegistrationPage;
import com.raven.sheiboi.pages.StartUpPage;
import com.raven.sheiboi.utilities.AppInitializer;
import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RegistrationTest {

    AppiumDriver driver;
    StartUpPage startUpPage;
    RegistrationPage registrationPage;

    @Before

    public void setup ()throws MalformedURLException, InterruptedException{

        AppInitializer app =new AppInitializer();
        driver = app.getDriver();

        startUpPage = new StartUpPage(driver);

        registrationPage=new RegistrationPage(driver);

        startUpPage.navigateToLoginPage();

    }
     //TC/FreeRegistration/001	"Verify that error message is displayed for mandatory field after tapping ""Register New Account"" without entering any value"

     @Test
     public void mandatoryFieldTest(){

         String [] expectedArray = {"Please enter your name. Name should be at least 3 characters."};

         assertArrayEquals(expectedArray,  registrationPage.mandatoryFieldTest(driver));

     }

    //TC/FreeRegistration/002	Verify that error message is displayed when entering less than 3digits in the "Name" field

    @Test
    public void nameFieldLengthTest() throws MalformedURLException, InterruptedException {

        String [] expectedArray = {"Please enter your name. Name should be at least 3 characters."};

        assertArrayEquals(expectedArray,  registrationPage.nameFieldLength("Ma",driver));

    }

    //TC/FreeRegistration/004	"Verify that error message is displayed when entering wrong/invalid email format in the ""Email"" field"

    @Test
    public void emailValidationTest(){

        String [] expectedArray = {"Please enter valid email address."};

        assertArrayEquals(expectedArray,  registrationPage.emailValidationCheck("Mahid", "mahid.gmail.com", driver));

    }

    //TC/FreeRegistration/005	Verify that only number is allowed in the "Phoen" field

    @Test
    public void phoneNoValidationTest(){

        String[] expectedArray = {"Please enter at least 6 characters in password field."};

        assertArrayEquals(expectedArray,  registrationPage.phoneNoValidation("Mahad Uddin Mahid", "mahid.ayeer@gmail.com", "01777815236", driver));

    }

    //TC/FreeRegistration/006	Verify that error message is displayed when entering less than 6 digits in the "Password" field

    @Test
    public void passwordLengthTest(){

        //String[] expectedArray = {"Please enter password"};

        String[] expectedArray = {"Please enter at least 6 characters in password field."};

        assertArrayEquals(expectedArray,  registrationPage.passwordLessLength("Mahad Uddin Mahid", "mahid.ayeaty@gmail.com", "01777815236","$a&b%", driver));


    }

    //TC/FreeRegistration/007	Verify that password field can be taken all keyboard input

    @Test
    public void passwordCombinationTest(){

        String[] expectedArray = {"Please enter password"};

        assertArrayEquals(expectedArray,  registrationPage.passwordCombination("Mahad Uddin Mahid", "mahid.ayedfd@gmail.com", "01777815236","!a@b#1$c%2&", driver));


    }


    //TC/FreeRegistration/008	Verify that error message is displayed when "Password and Repeat Password" field is not matched

    @Test
    public void passwordRetypePasswordMismatchTest(){

        String[] expectedArray = {"Password does not match"};

        assertArrayEquals(expectedArray,  registrationPage.passwordRetypePasswordMismatch("Mahad Uddin Mahid", "mahid.aydaca@gmail.com", "01777815236","!a@b#1$c%2&","1a@b$b6&k(8", driver));

    }

    //TC/FreeRegistration/009	Verify that entered all required info and tapping "Register New Account" is displayed "sheiboi" My Library as a logged in

    @Test
    public void loginSheiboiThrougRegistrationTest()throws MalformedURLException, InterruptedException{

        String[] expectedArray = {"আমার লাইব্রেরী"};

        assertArrayEquals(expectedArray,  registrationPage.loginSheiboiThrougRegistration("Mahad Uddin Mahid", "mahid.olp@gmail.com", "01777815236","abc123","abc123", driver));

    }


    //TC/FreeRegistration/010	Verify that error message "Email already exist" is displayed after registering existing email in sheiboi.

    @Test
    public void duplicateEmailTest(){

        String [] expectedArray = {"Email/User already exists"};

        assertArrayEquals(expectedArray,  registrationPage.duplicateEmail("Mahad Uddin Mahid", "mahid.ar@gmail.com", "01777815236","!a@b#1$c%2&","!a@b#1$c%2&", driver));

    }


    //TC/FreeRegistration/011	Verify that tapping on "Already has an account...." is displayed Registration page

    @Test
    public void alreadyHasAccountCheck(){

        String[] expectedArray = {"Already has account! Login here"};

        assertArrayEquals(expectedArray,  registrationPage.alreadyHasAccountCheck(driver));


    }


    @Test
    public void currencyTakaDisplayedWhenLocationOnTest()throws MalformedURLException,InterruptedException{

        String[] expectedArray = {"আমার লাইব্রেরী","৳50.0"};

        assertArrayEquals(expectedArray,  registrationPage.currencyTakaDisplayedWhenLocationOn("Mahad Uddin Mahid", "mahid.plp@gmail.com", "01777815236","!a@b#1$c%2&","!a@b#1$c%2&",driver));

    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

  }
