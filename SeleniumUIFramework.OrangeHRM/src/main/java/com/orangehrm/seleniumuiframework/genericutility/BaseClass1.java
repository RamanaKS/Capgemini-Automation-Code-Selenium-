package com.orangehrm.seleniumuiframework.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class BaseClass1 {

	public WebDriver driver;
    public Properties prop;
    public String path = "./src/main/resources/orangehrm.CommonData/CommonData.properties";

    @BeforeMethod
    public void setup() throws IOException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 🔹 Load properties
        prop = new Properties();
        FileInputStream fis = new FileInputStream(path);
        prop.load(fis);
        fis.close();

        driver.get(prop.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
