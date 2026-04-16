package tests;

import base.BaseTest;
import pages.*;

import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckout() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);

        lp.enterUsername("standard_user");
        Thread.sleep(1000);

        lp.enterPassword("secret_sauce");
        Thread.sleep(1000);

        lp.clickLogin();
        Thread.sleep(2000);

        HomePage hp = new HomePage(driver);

        hp.addProduct();
        Thread.sleep(2000);

        hp.openCart();
        Thread.sleep(2000);

        CartPage cp = new CartPage(driver);
        cp.clickCheckout();
        Thread.sleep(2000);

        CheckoutPage ch = new CheckoutPage(driver);

        ch.enterDetails("Nitish", "Singh", "123456");
        Thread.sleep(2000);

        ch.continueCheckout();
        Thread.sleep(2000);

        ch.finishOrder();
        Thread.sleep(3000);

        System.out.println("✅ Checkout Completed");
    }
}