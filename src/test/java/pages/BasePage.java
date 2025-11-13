package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    // Webdriver object -- This represent active browser instance so that all the child pages can use it
    protected WebDriver driver;

    // WebDriverWait object -- used for explicit wait and it can be used by all the child pages.
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver= driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public boolean isElementVisible(WebElement element){
        try {
            return element.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
}
