package Navigation;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NaviagteBackAndForward {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://www.wikipedia.org/");
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}
}
