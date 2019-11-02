import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SelectItem {
    public By Item =
            By.xpath("//img[@src='https://m.media-amazon.com/images/I/417xl0akUIL._AC_UL320_ML3_.jpg']");
    public By BuynowBtn=By.id("buy-now-button");
    WebDriver driver;
    public SelectItem(WebDriver driver){this.driver=driver;}

    public void OpenItemdetails()throws Exception {
driver.findElement(Item).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            driver.findElement(BuynowBtn).isDisplayed();
            System.out.println("Hello from item details page :)");
        } catch (Exception e) {
           System.out.println("sorry, couldn't open item details!! :( ");
        }

    }
    }
