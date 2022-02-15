package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VizyonPract {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoblaze.com/");


      //  WebElement signIn = driver.findElement(By.id("login2"));
       // signIn.click();


        WebElement laptops = driver.findElement(By.id("itemc"));
        laptops.click();
        WebElement dell2017 = driver.findElement(By.id("hrefch"));
        dell2017.click();
        WebElement addCart = driver.findElement(By.className("btn btn-success btn-lg"));
        addCart.click();

        System.out.println("test basarili");
    }
}
