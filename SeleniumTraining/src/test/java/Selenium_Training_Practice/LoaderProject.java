package Selenium_Training_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoaderProject {
	public static void main(String[] args) {
//			ChromeDriver driver=new ChromeDriver();
//			WebDriver driver1=new FirefoxDriver();
		String browser = "firefox";
		WebDriver driver = null;
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();

		}

	}
}
