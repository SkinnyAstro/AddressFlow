package tests;

import org.testng.annotations.Test;
import pages.AddressPage;
import pages.LoginPage;

public class AddressTest extends BaseTest{

    @Test
    public void testnewaddress() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("9004921226");

        AddressPage addressPage = new AddressPage(driver);
        addressPage.gotoManageAddress();
        addressPage.Addingnewaddress();

    }

}
