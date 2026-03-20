package Navigation;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NaviagteToUrl {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		URL url=new URL("https://www.flipkart.com/");
		driver.navigate().to(url);
		Thread.sleep(2000);
		driver.navigate().to(new URL("https://www.uber.com/in/en/"));
		Thread.sleep(2000);
		driver.quit();
		
		
}
}
