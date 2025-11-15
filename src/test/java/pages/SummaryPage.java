package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

public class SummaryPage extends BasePage {

  @FindBy(xpath = "//div[@class='sc-877d70c4-1 cYJets']")
  private WebElement summaryaddressline;




    public SummaryPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
