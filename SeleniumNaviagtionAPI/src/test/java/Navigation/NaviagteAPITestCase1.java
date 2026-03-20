package Navigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagteAPITestCase1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("Automation", Keys.ENTER);
		driver.navigate().to("https://www.Amazon.com/");
		String expectedTitle = "Amazon.com. Spend less. Smile more.";
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title Verified - PASS");
		} else {
			System.out.println("Title Verified - FAIL");
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tools");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		String expectedTitle1 = "https://www.google.com/search?q=Automation&sca_esv=64c17adec9ee4761&source=hp&ei=TRClaYLIBqP3seMP5ZebsQ4&iflsig=AFdpzrgAAAAAaaUeXbURYaQnmCGolSK41FP8PUWWYbnW&ved=0ahUKEwjCovLfroCTAxWje2wGHeXLJuYQ4dUDCBY&uact=5&oq=Automation&gs_lp=Egdnd3Mtd2l6IgpBdXRvbWF0aW9uSHJQAFhncAB4AJABAJgBAKABAKoBALgBA8gBAPgBAZgCAKACAJgDAJIHAKAHALIHALgHAMIHAMgHAIAIAA&sclient=gws-wiz&sei=TxCladn0ILfuseMPibXYgAU";
		Thread.sleep(2000);
		String actualTitle1 = driver.getTitle();
		System.out.println(actualTitle1);
		if (actualTitle1.equals(expectedTitle1)) {
			System.out.println("Title Verified - PASS");
		} else {
			System.out.println("Title Verified - FAIL");
		}

	}
}
