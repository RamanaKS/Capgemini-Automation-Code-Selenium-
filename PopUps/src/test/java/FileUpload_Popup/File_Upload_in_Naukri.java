package FileUpload_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_in_Naukri {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[ @class='main-3' and .=\"I'm experienced\"]")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\RAMANA\\OneDrive\\Desktop\\document.docx");
		
	}
}
