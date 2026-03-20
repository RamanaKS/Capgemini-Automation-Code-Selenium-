package selectclassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class GetOptions {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(3000);
		 WebElement dropdown=driver.findElement(By.id("select-multiple-native"));
		Select select=new Select(dropdown);
		List<WebElement>allOpt=select.getOptions();
		for(WebElement opt:allOpt)
			System.out.println(opt);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		for(WebElement opt:allOpt)
			System.out.println(opt.getText());
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println(allOpt);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		driver.quit();
		
}
}
