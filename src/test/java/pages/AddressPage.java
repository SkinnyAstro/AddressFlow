package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AddressPage extends BasePage{

    @FindBy (xpath = "//button[@class='sc-b7e936f3-0 sc-5c16eb5d-0 dOqDEV fEYuDN sc-b12414c9-0 kaPobC']")
    WebElement ProfileButton;

    @FindBy(xpath = "//span[@class='sc-fd14de67-4 fKAZKd' and text()='Manage Addresses']")
    WebElement ManageAddressButton;

    @FindBy(xpath = "//button[@class='sc-b7e936f3-0 sc-7fd21e6d-0 dOqDEV hyKmTP sc-6bad1a2e-1 jFKKMk']")
    WebElement Addnewaddress;

    @FindBy(xpath = "//input[@class='ant-input css-kghr11 ant-input-outlined sc-36d10bfa-0 kMjfNj custom-input']")
    WebElement Searchfield;

    @FindBy(xpath = "//div[@class='address-card-action'][1]")
    WebElement AddressSelection;

    @FindBy(xpath = "//input[@name='addressline1']")
    WebElement Addressline1;

    @FindBy(xpath = "//button[@class='sc-b7e936f3-0 sc-7fd21e6d-0 dOqDEV hyKmTP sc-fb652a56-14 bMnPhC']")
    WebElement Addresstype;

    @FindBy(xpath = "//input[@class='ant-input css-kghr11 ant-input-outlined'and @name='otherAddressType']")
    WebElement Addressname;

    @FindBy(xpath = "//button[@class='sc-b7e936f3-0 sc-c5c26131-0 dOqDEV bHIGnk']")
    WebElement SaveandContinue;



    public AddressPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void gotoManageAddress() throws InterruptedException {
        ProfileButton.click();
        Thread.sleep(2000);
        ManageAddressButton.click();
        Thread.sleep(2000);
    }

    public void Addingnewaddress() throws InterruptedException {
        Addnewaddress.click();
        Searchfield.click();
        Searchfield.sendKeys("Axis Bank");
        wait.until(ExpectedConditions.elementToBeClickable(AddressSelection)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Addressline1)).click();
        Addressline1.sendKeys("Nakshatra Apartment");
        wait.until(ExpectedConditions.elementToBeClickable(Addresstype)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Addressname)).sendKeys("Test ADDRESS 3 ");
        SaveandContinue.click();

    }

}
