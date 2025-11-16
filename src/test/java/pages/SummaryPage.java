package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tests.BaseTest;

public class SummaryPage extends BasePage {

  @FindBy(xpath = "//div[@class='sc-877d70c4-1 cYJets']")
  private WebElement summaryaddressline;

  @FindBy(xpath = "//button[@class='sc-b7e936f3-0 sc-5c16eb5d-0 dOqDEV fEYuDN' and text()='Address']")
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

  @FindBy(xpath = "//button[@class='sc-b7e936f3-0 sc-c5c26131-0 dOqDEV bHIGnk']")
  private WebElement checkout;



  public SummaryPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public void proceedtocheckout(){
      wait.until(ExpectedConditions.elementToBeClickable(checkout)).click();
      wait.until(ExpectedConditions.elementToBeClickable(summaryaddressline)).click();
      Searchfield.click();
      Searchfield.sendKeys("Axis Bank");
      wait.until(ExpectedConditions.elementToBeClickable(AddressSelection)).click();
      wait.until(ExpectedConditions.elementToBeClickable(Addressline1)).click();
      Addressline1.sendKeys("Nakshatra Apartment");
      wait.until(ExpectedConditions.elementToBeClickable(Addresstype)).click();
      wait.until(ExpectedConditions.elementToBeClickable(Addressname)).sendKeys("Test ADDRESS 4 ");
      SaveandContinue.click();


    }

}
