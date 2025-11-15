package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

    @FindBy(xpath = "//button[@class='sc-b7e936f3-0 sc-c5c26131-0 dOqDEV bHIGnk' and text()='Add Delivery Details']")
    WebElement Adddeliverybutton;

    @FindBy(xpath = "//button[@class='sc-b7e936f3-0 sc-5c16eb5d-0 dOqDEV fEYuDN' and text()='Address']")
    WebElement addaddress; // this is the xpath of addaddress button inside the delivery details page

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

    @FindBy(id= "searchInput")
    WebElement Searchbar;

    @FindBy(xpath ="//p[@class='sc-c6e4ede0-3 cksWKu' and text()='Telmavas H Tablet 10']")
    WebElement MedicineClick;


    public CartPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }


    // Need to add a flow where customer is already on cart and he is seeing Add address or add delivery details button


    public void Addingmedicine(){
    wait.until(ExpectedConditions.elementToBeClickable(Searchbar)).sendKeys("Telmavas H Tablet 10");
    wait.until(ExpectedConditions.elementToBeClickable(MedicineClick)).click();
    // need to add a code here to add the medicine by clicking on the add button, need to define the locator of add CTA
    }

    // Need to check if addaddress xPATH Is proper or not as there are technically two add address button one on cart page and one on delivery detail page
    public void Addressfromcart(){
        if(isElementVisible(addaddress)){
            addaddress.click(); // this needs to be changed as the addaddress locator is that of which is seen on delivery details page
            wait.until(ExpectedConditions.elementToBeClickable(addaddress)).click();
            Searchfield.click();
            Searchfield.sendKeys("Axis Bank");
            wait.until(ExpectedConditions.elementToBeClickable(AddressSelection)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Addressline1)).click();
            Addressline1.sendKeys("Nakshatra Apartment");
            wait.until(ExpectedConditions.elementToBeClickable(Addresstype)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Addressname)).sendKeys("Test ADDRESS 4 ");
            SaveandContinue.click();
        } else if (isElementVisible(Adddeliverybutton)) {
            Adddeliverybutton.click();
            wait.until(ExpectedConditions.elementToBeClickable(addaddress)).click();
            Searchfield.click();
            Searchfield.sendKeys("Axis Bank");
            wait.until(ExpectedConditions.elementToBeClickable(AddressSelection)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Addressline1)).click();
            Addressline1.sendKeys("Nakshatra Apartment");
            wait.until(ExpectedConditions.elementToBeClickable(Addresstype)).click();
            wait.until(ExpectedConditions.elementToBeClickable(Addressname)).sendKeys("Test ADDRESS 4 ");
            SaveandContinue.click();

        }else {
            System.out.println("Proceed to checkout is visible,address cannot be added from the cart");
        }
    }

}
