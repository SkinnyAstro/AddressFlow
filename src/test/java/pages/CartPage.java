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

    @FindBy(xpath = "//button[@class='sc-b7e936f3-0 sc-5c16eb5d-0 dOqDEV fEYuDN remove-underline']")
    WebElement addaddress;

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

    }

    public void Addressfromcart(){
        if(isElementVisible(addaddress)){
            addaddress.click();
        } else if (isElementVisible(Adddeliverybutton)) {
            Adddeliverybutton.click();
        }else {
            System.out.println("Proceed to checkout is visisble,address cannot be added from the cart");
        }
    }

}
