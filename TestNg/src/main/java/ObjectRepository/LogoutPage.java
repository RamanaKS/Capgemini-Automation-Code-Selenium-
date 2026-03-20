package ObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By menuBtn = By.id("react-burger-menu-btn");
    By logoutBtn = By.id("logout_sidebar_link");

    // Business Logic

    public void clickMenu() {
        driver.findElement(menuBtn).click();
    }

    public void clickLogout() {
        driver.findElement(logoutBtn).click();
    }
}