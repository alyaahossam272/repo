import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class Sort {
    public By SortBTN = By.id("sort");
    WebDriver driver;
    public Sort(WebDriver driver){this.driver=driver;}

    public void SortPriceL2H()throws Exception{
        WebElement sortMenu=driver.findElement(SortBTN);
        sortMenu.click();
        Select select=new Select(sortMenu);
        select.selectByValue("price-asc-rank");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
