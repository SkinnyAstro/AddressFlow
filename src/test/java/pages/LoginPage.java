package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//button[@class='sc-b7e936f3-0 sc-5c16eb5d-0 dOqDEV fEYuDN' and text()='Login / Signup']")
    private WebElement signup;

    @FindBy(id = "phone")
    private WebElement phone;

    // Below is the production locator of the mobile login , it cannot be used on stage
    @FindBy(xpath = "//input[@class='sc-ce6ba07b-6 iWuLHA']")
    private WebElement mobilelogin;

    // Below is the Getotp locator of production.
    @FindBy(xpath="//button[@class='sc-ce6ba07b-7 jGFoUo']")
    private WebElement prodOtp;

    @FindBy(xpath = "//button[@class='sc-b7e936f3-0 sc-c5c26131-0 dOqDEV bHIGnk sc-b1966d6e-9 inlkji']")
    private WebElement getOtp;

    @FindBy(id="wzrk-cancel")
    private WebElement cancel;

    // construtor that accepts webdriver and calls Basepage's construtor
    public LoginPage(WebDriver driver){
        super(driver); // this passes the driver to BasePage.
        PageFactory.initElements(driver,this); // initalize the FindBy elements
    }

    public void login(String phonenumber) throws InterruptedException{
        signup.click();
        //phone.sendKeys(phonenumber);
        mobilelogin.sendKeys(phonenumber); // this is the production locator and not of stage
        prodOtp.click(); // Can only be used on prod website
        //getOtp.click();
        Thread.sleep(10000); // manual wait for entering the otp
        //wait.until(ExpectedConditions.visibilityOf(cancel)).click();
    }

}
