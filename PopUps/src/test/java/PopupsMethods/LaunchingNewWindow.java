package PopupsMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewWindow {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.quit();
	}
}
