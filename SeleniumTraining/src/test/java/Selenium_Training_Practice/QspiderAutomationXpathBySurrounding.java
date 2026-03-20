package Selenium_Training_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderAutomationXpathBySurrounding {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//section[.='X Path']")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//section[contains(text(),'Duplicate Element')]")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//label[.=' RedMi ']/..//input[@type='checkbox']")).click();
	     driver.findElement(By.xpath("//label[.='Samsung']/..//input[@type='checkbox']")).click();
}
}
