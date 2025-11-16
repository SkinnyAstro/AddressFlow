package tests;

import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.SummaryPage;

public class SummaryTest extends BaseTest {

    @Test
    public void AddressfromSummary() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("9004921226");

        CartPage cartPage = new CartPage(driver);
        cartPage.Addingmedicine();

        SummaryPage summaryPage = new SummaryPage(driver);
        summaryPage.proceedtocheckout();

    }

}
