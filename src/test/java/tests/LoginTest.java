package tests;

import base.BaseTest;
import pages.LoginPage;
import utils.DataProviderClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = DataProviderClass.class)
    public void loginTest(String username, String password) throws InterruptedException {

        LoginPage lp = new LoginPage(driver);

        System.out.println("Entering username: " + username);
        lp.enterUsername(username);
        Thread.sleep(1000);

        System.out.println("Entering password");
        lp.enterPassword(password);
        Thread.sleep(1000);

        System.out.println("Clicking login button");
        lp.clickLogin();
        Thread.sleep(2000);

        if(username.equals("standard_user") && password.equals("secret_sauce")) {

            Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
            System.out.println("✅ Login Successful");

        } else {

            Assert.assertTrue(lp.getErrorMessage().contains("Epic sadface"));
            System.out.println("❌ Login Failed as expected");
        }
    }
}