package gun4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class ProjeClass extends BaseStaticDriver {

    /*
    https://form.jotform.com/220466667555061   -  Ödev Form sıtesı

    Formdaki Tüm alanlari doldurarak
    submit butouna basiniz ve ekanda Cikan "Thank You!" yazisini Onaylayiniz
    Bulundugunuz sayfanin linkinin "https://submit.jotformeu.com/220466667555061"  oldgunu Assert ile test ediniz

    https://form.jotform.com/220466667555061

     */

    public static void main(String[] args) throws InterruptedException {

        driver.navigate().to("https://form.jotform.com/220466667555061");

        WebElement firstName = driver.findElement(By.name("q3_name[first]"));
        firstName.sendKeys("Mehmet");
        Thread.sleep(3000);
        WebElement lastName = driver.findElement(By.name("q3_name[last]"));
        lastName.sendKeys("Kaya");
        Thread.sleep(3000);
        WebElement e_Mail = driver.findElement(By.name("q4_email"));
        e_Mail.sendKeys("Kayam@gmail.com");
        Thread.sleep(3000);
        WebElement adress = driver.findElement(By.name("q5_address[addr_line1]"));
        adress.sendKeys("Alacakaranlıklar Ulkesi kızıl deniz");
        Thread.sleep(3000);
        WebElement city = driver.findElement(By.cssSelector("input[id='input_5_city']"));
        city.sendKeys("Kadim City");
        Thread.sleep(3000);
        WebElement zipCode = driver.findElement(By.name("q5_address[postal]"));
        zipCode.sendKeys("06006");
        Thread.sleep(3000);

       // WebElement scrol = driver.findElement(By.className("https://cdn.jotfor.ms//js/vendor/smoothscroll.min.js?v=3.3.31011"));
        // scrol.click();

        WebElement countrySelect = driver.findElement(By.cssSelector("select[id='input_5_country']"));
        //bazi atrribute"larla bulmada sıkıntı oldu.
        countrySelect.click();
        Thread.sleep(3000);
        WebElement country = driver.findElement(By.cssSelector("option[value='The Bahamas']"));
        country.click();
        Thread.sleep(3000);
        WebElement itField = driver.findElement(By.name("q6_itBransiniz"));
        itField.click();
        Thread.sleep(3000);
        WebElement itSelection = driver.findElement(By.cssSelector("option[value='SDET'] "));
        itSelection.click();
        Thread.sleep(3000);
        WebElement date = driver.findElement(By.cssSelector("input[id^='lite_'][id$='_10']"));
        date.sendKeys("02.22.2022");
        Thread.sleep(3000);
        WebElement message = driver.findElement(By.cssSelector("textarea[data-component='textarea']"));
        message.sendKeys("Ich habe schon fast erzielt.");
        Thread.sleep(3000);
        WebElement einreichen = driver.findElement(By.id("input_2"));
        einreichen.click();
        Thread.sleep(3000);
        driver.navigate().back();


        driver.quit();


    }

}
