package tests;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;

public class CartTest extends BaseTest {

    @Test
    public void Addressfromcart() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("9004921226");

        CartPage cartPage = new CartPage(driver);
        cartPage.Addingmedicine();
        //cartPage.Addressfromcart();

    }



}
