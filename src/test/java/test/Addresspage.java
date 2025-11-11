package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Addresspage {
    ChromeDriver driver;

    String url = "https://d9fxpcoihxvhh.cloudfront.net/";

    public void invokeBrowser() throws InterruptedException {
        driver = new ChromeDriver(); //
        //driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(url);
        // url2 = driver.getCurrentUrl().replaceAll("/$","");

        //WebElement Search = driver.findElement(By.id("searchInput"));
    }

    public void Login() throws InterruptedException {

        WebElement signup = driver.findElement(By.xpath("//button[@class='sc-b7e936f3-0 sc-5c16eb5d-0 dOqDEV fEYuDN' and text()='Login / Signup']"));
        signup.click();

        WebElement phone = driver.findElement(By.id("phone"));
        phone.sendKeys("9004921226");

        WebElement getOtp = driver.findElement(By.xpath("//button[@class='sc-b7e936f3-0 sc-c5c26131-0 dOqDEV bHIGnk sc-b1966d6e-9 inlkji']"));
        getOtp.click();
        Thread.sleep(20000);



    }

    public void AddressClick() throws InterruptedException{
        WebElement profilebutton = driver.findElement(By.xpath("//button[@class='sc-b7e936f3-0 sc-5c16eb5d-0 dOqDEV fEYuDN sc-b12414c9-0 kaPobC']"));
        profilebutton.click();
        Thread.sleep(2000);

        WebElement Addressbutton = driver.findElement(By.xpath("//span[@class='sc-fd14de67-4 fKAZKd' and text()='Manage Addresses']"));
        Addressbutton.click();
    }

    public void AddNewAddress() throws InterruptedException{
        WebElement Newaddress = driver.findElement(By.xpath("//button[@class='sc-b7e936f3-0 sc-7fd21e6d-0 dOqDEV hyKmTP sc-6bad1a2e-1 jFKKMk']"));
        Newaddress.click();
        Thread.sleep(2000);

        WebElement SearchField = driver.findElement(By.xpath("//input[@class='ant-input css-kghr11 ant-input-outlined sc-36d10bfa-0 kMjfNj custom-input']"));
        SearchField.click();
        SearchField.sendKeys("Thane");
    }



    public static void main(String[] args) throws InterruptedException {
        Addresspage ap = new Addresspage();
        ap.invokeBrowser();
        ap.Login();
        ap.AddressClick();
        ap.AddNewAddress();
    }


}
