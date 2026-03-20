package ObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLogout {

    WebDriver driver;

    public LoginLogout(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    // Business Logic

    public void enterUserName(String un) {
        driver.findElement(username).sendKeys(un);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}