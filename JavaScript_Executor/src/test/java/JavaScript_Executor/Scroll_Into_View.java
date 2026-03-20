package JavaScript_Executor;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Into_View {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.youtube.com/results?search_query=akkam+pakkam+song");
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("(//div[@id=\"dismissible\" and @class=\"style-scope ytd-video-renderer\"])[9]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
//		 List<WebElement> ele=driver.findElements(By.xpath("//div[@id=\"dismissible\" and @class=\"style-scope ytd-video-renderer\"]"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(false)", ele.get(9));

}
}