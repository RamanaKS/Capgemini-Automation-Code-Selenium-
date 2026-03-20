package AuthenticationPopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationInQspider {
	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.id("AuthLink")).click();
		Thread.sleep(2000);
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		//Robot r = new Robot();
        // Type Username
//        r.keyPress(KeyEvent.VK_A);
//        r.keyRelease(KeyEvent.VK_A);
//
//        r.keyPress(KeyEvent.VK_D);
//        r.keyRelease(KeyEvent.VK_D);
//
//        r.keyPress(KeyEvent.VK_M);
//        r.keyRelease(KeyEvent.VK_M);
//
//        r.keyPress(KeyEvent.VK_I);
//        r.keyRelease(KeyEvent.VK_I);
//
//        r.keyPress(KeyEvent.VK_N);
//        r.keyRelease(KeyEvent.VK_N);
//
//        // Press TAB to move to password
//        r.keyPress(KeyEvent.VK_TAB);
//        r.keyRelease(KeyEvent.VK_TAB);
//
//        // Type Password
//        r.keyPress(KeyEvent.VK_A);
//        r.keyRelease(KeyEvent.VK_A);
//
//        r.keyPress(KeyEvent.VK_D);
//        r.keyRelease(KeyEvent.VK_D);
//
//        r.keyPress(KeyEvent.VK_M);
//        r.keyRelease(KeyEvent.VK_M);
//
//        r.keyPress(KeyEvent.VK_I);
//        r.keyRelease(KeyEvent.VK_I);
//
//        r.keyPress(KeyEvent.VK_N);
//        r.keyRelease(KeyEvent.VK_N);
//
//        // Press Enter
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();
}
}
