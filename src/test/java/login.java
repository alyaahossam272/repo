import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class login {
    WebDriver driver;
    public login(WebDriver driver){this.driver=driver;}
    public By loginBtn1=By.xpath("//span[text()='Hello']");
   public By loginBtn2=By.xpath("//*[@id=\"GLUXSignInButton\"]/span/input");
   public By password =By.id("ap_password");

    public By username= By.xpath("//input[@type='email']");
    public  By continueBtn=By.id("continue");
    public By submitSigninBtn= By.id("signInSubmit");
    public By cart=By.xpath("//span[text()='Cart']");


    public void LoginFun(String Username,String Password) throws Exception {
        driver.findElement(loginBtn1).click();
        driver.findElement(loginBtn2).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(username).sendKeys(Username);
        driver.findElement(continueBtn).click();
        driver.findElement(password).sendKeys(Password);
        driver.findElement(submitSigninBtn).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            driver.findElement(cart).isDisplayed();
            System.out.println("logged in successfully!");
        } catch (Exception e) {

            System.out.println("sorry, invalid crads, you can not log in ! ");
        }
    }
}
