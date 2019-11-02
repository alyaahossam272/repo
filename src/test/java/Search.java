import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Search {
    WebDriver driver;
    public Search(WebDriver driver){this.driver=driver;}
    public By SelectSearchList = By.id("searchDropdownBox");
public By SearchBtn=By.xpath("//input[@value='Go']");

    public void searchByCategory()throws Exception{
        WebElement selectX = driver.findElement(SelectSearchList);
        selectX.click();
        Select select=new Select(selectX);
        select.selectByValue("search-alias=beauty");
        driver.findElement(SearchBtn).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
