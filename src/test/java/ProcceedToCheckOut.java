import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProcceedToCheckOut {
    WebDriver driver;
    public ProcceedToCheckOut(WebDriver driver){this.driver=driver;}

    public void viewThanksPage()throws Exception{
        driver.findElement(By.id("buy-now-button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='\n" +
                "              Deliver to this address']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //select payment method>>
        driver.findElement(By.xpath("//label[@for='pp-Ri-36']")).click();

        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("placeYourOrder1")).click();
        try {
            driver.findElement(By.xpath("//h2[@class='a-color-success']")).isDisplayed();
            System.out.println("YOUR ORDER HAS BEEN PLACED SUCCESSFULLY :)");
        } catch (Exception e) {
            System.out.println("sorry, couldn't place your order!! :( ");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

}
