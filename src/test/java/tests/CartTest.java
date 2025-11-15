package tests;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;

public class CartTest extends BaseTest {

    @Test
    public void Addressfromcart() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        //loginPage.login("8850843264");
        loginPage.login("8850843264");

        CartPage cartPage = new CartPage(driver);
        cartPage.Addingmedicine();
        //cartPage.Addressfromcart();

    }



}
