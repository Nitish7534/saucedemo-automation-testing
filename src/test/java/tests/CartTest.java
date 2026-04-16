package tests;

import base.BaseTest;
import pages.*;

import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void addToCartTest() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);

        lp.enterUsername("standard_user");
        Thread.sleep(1000);

        lp.enterPassword("secret_sauce");
        Thread.sleep(1000);

        lp.clickLogin();
        Thread.sleep(2000);

        HomePage hp = new HomePage(driver);

        System.out.println("Adding product to cart");
        hp.addProduct();
        Thread.sleep(2000);

        System.out.println("Opening cart");
        hp.openCart();
        Thread.sleep(3000);
    }
}