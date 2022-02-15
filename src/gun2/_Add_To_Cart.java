package gun2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _Add_To_Cart {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();


        List<WebElement> sepetEkle = driver.findElements(By.cssSelector("button[class='btn btn_primary btn_small btn_inventory']"));

        for (WebElement addSepet : sepetEkle) {
            System.out.println(addSepet.getText());
            addSepet.click();
        }

        Thread.sleep(4000);

        List<WebElement> removeSepet = driver.findElements(By.cssSelector("button[class='btn btn_secondary btn_small btn_inventory']"));

        for (WebElement remove : removeSepet) {
            remove.click();
        }

        String url = driver.getCurrentUrl();
        Assert.assertEquals("Yanlis adrestesiniz", "https://www.saucedemo.com/inventory.html", url);
        // Eger Assert sonucu dogru ise bu mesajı yaz.
        // "Testiniz Basari ile tamamlandi"



    }
}