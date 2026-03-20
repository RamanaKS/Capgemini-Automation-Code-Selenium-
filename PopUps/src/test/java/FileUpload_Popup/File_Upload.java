package FileUpload_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
	Thread.sleep(3000);
	driver.findElement(By.id("resume")).sendKeys("C:\\Users\\RAMANA\\OneDrive\\Desktop\\SQL NOTES.pdf");
	
}
}
