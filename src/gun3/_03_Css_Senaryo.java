package gun3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _03_Css_Senaryo extends BaseStaticDriver {

    /**
     * https://formsmarts.com/form/yu?mode=h5  bu siteye gidelim
     * Business secin
     * online Advertising secin
     * Every Day secin
     * Average
     * I'm using XYZ for about a week
     * massage kısmına bir yazi gönderelim.
     */

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business = driver.findElement(By.cssSelector("input[id^='u_'][id$='_4586_0']")); //"input[id='u_lvy_4586_0']"));
        business.click();
        Thread.sleep(2000);
        WebElement selection1 = driver.findElement(By.cssSelector("select[id^='u_'][id$='_4588']"));
        selection1.click();
        Thread.sleep(2000);
        WebElement onlineAdvertsing = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        onlineAdvertsing.click();
        Thread.sleep(2000);
        WebElement everyDay = driver.findElement(By.cssSelector("input[id^='u_'][id$='_89585_0']"));
        everyDay.click();
        Thread.sleep(2000);
        WebElement average = driver.findElement(By.cssSelector("input[id^='u_'][id$='_4589_1']"));
        average.click();
        Thread.sleep(2000);
        WebElement selection2 = driver.findElement(By.cssSelector("select[id^='u_'][id$='_4597']"));
        selection2.click();
        Thread.sleep(2000);
        WebElement week = driver.findElement(By.cssSelector("option[value=\"I'm using XYZ for about a week\"]"));
        week.click();  // Eger lokasyon icinde tek tırnak varsa...cift tırnak ile lokasyon buluruz.
        Thread.sleep(2000);
        WebElement message = driver.findElement(By.cssSelector("textarea[name=\"u_lvy_89597\"]"));
        message.sendKeys("Bu bir Selenium Testidir.");

        Thread.sleep(2000);
        WebElement name = driver.findElement(By.cssSelector("input[name='u_lvy_4598']"));
        name.sendKeys("Mehmet");
        Thread.sleep(2000);
        WebElement surname = driver.findElement(By.cssSelector("input[placeholder='Your last name']"));
        surname.sendKeys("Toprak");
        Thread.sleep(2000);
        WebElement e_mail = driver.findElement(By.cssSelector("input[type='email']"));
        e_mail.sendKeys("toprakm@gmail.com");
        Thread.sleep(2000);
        WebElement date = driver.findElement(By.cssSelector("input[name='u_lvy_14597']"));
        date.sendKeys("22.02.2022");
        Thread.sleep(2000);
        WebElement site = driver.findElement(By.cssSelector("input[name='u_lvy_4601']"));
        site.sendKeys("/www.vizyonstore.com/");
        Thread.sleep(2000);
        WebElement country = driver.findElement(By.cssSelector("select[id='u_lvy_14598']"));
        country.click();
        Thread.sleep(2000);
        WebElement turkey = driver.findElement(By.cssSelector("option[value='TR']"));
        turkey.click();
        Thread.sleep(2000);
        WebElement province = driver.findElement(By.cssSelector("option[value='TR-72']"));
        province.click();
        Thread.sleep(2000);
        WebElement connect = driver.findElement(By.cssSelector("input[name='u_lvy_4604']"));
        connect.click();
        Thread.sleep(2000);
        WebElement comment = driver.findElement(By.cssSelector("textarea[name='u_lvy_4602']"));
        comment.sendKeys("I will be happy to reach here");
        Thread.sleep(2000);
        WebElement fortsetzen = driver.findElement(By.cssSelector("input[type='submit']"));
        fortsetzen.click();

         System.out.println("Test fortsetzen");

        Thread.sleep(2000);
         driver.quit();

    }
}
