package com.demo.SeleniumGrid;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingEdge {
	public static void main(String[] args) throws Exception {

		EdgeOptions options = new EdgeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
		driver.get("https://www.selenium.dev");
		Thread.sleep(4000);
		driver.quit();
	}
}