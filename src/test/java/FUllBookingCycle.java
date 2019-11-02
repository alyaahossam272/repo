
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FUllBookingCycle {
WebDriver driver;
@BeforeTest
public void openBrowser() throws Exception{
System.setProperty("webdriver.chrome.driver",
        "C:\\Users\\win 10\\IdeaProjects\\TestAutomationDiploma\\drivers\\chromedriver.exe");
driver = new RemoteWebDriver(new URL("http://localhost:9515"), DesiredCapabilities.chrome());
driver.manage().window().maximize();
driver.get("https://www.amazon.ae/ref=nav_logo");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@DataProvider
public Object[][] loginTestData(){
Object[][] LoginTestdata={
        {"01140654398","000000"} };
return LoginTestdata;
}
@Test(dataProvider = "loginTestData",priority = 1)
public void validLogin(String Username,String Password) throws Exception{
login x= new login(driver);
x.LoginFun(Username,Password);
}

@Test (priority =2)
public void categorySearch()throws Exception{
Search search=new Search(driver);
search.searchByCategory(); }

@Test (priority = 3)
public void priceSort()throws Exception{
Sort sort=new Sort(driver);
sort.SortPriceL2H(); }

@Test (priority = 4)
public void OpenItemDetails()throws Exception{
SelectItem item=new SelectItem(driver);
item.OpenItemdetails();
}
@Test (priority = 5)
public void proceedToCheckout()throws Exception{
    ProcceedToCheckOut x= new ProcceedToCheckOut(driver);
    x.viewThanksPage();
}
@AfterTest
public void closeBrowser()throws Exception{
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.close();
}

}
