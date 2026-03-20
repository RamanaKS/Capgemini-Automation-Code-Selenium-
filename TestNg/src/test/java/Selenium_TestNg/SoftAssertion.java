package Selenium_TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void testMethod()
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.google.com/");
			String expectedTitle="Google";
			String actualTitle=driver.getTitle();
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(actualTitle, expectedTitle);//if it fails expection so if will not executed
			if(actualTitle.equals(expectedTitle))
				System.out.println("passed");
			else
				System.out.println("failed");
		     sa.assertAll();
			
			
			
	}
}
