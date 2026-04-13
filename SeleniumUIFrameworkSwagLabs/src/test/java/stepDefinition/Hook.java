package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.edge.EdgeDriver;

import com.seleniumFrameWork.swagLabs.utility.AllUtilities;
import com.seleniumFrameWork.swagLabs.utility.BaseClass;
import com.seleniumFrameWork.swagLabs.utility.Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends AllUtilities {
	private BaseClass b;

	public Hook(BaseClass b) {
		this.b=b;
	}

	@Before
	public void setup() throws IOException, InterruptedException {
		String url = getPropertyKeyValue("url");
		String username = getPropertyKeyValue("username");
		String password = getPropertyKeyValue("password");
		b.driver = new EdgeDriver();
		driver=b.driver;
		configMaximizedBrowser();
		waitForElementsToLoad(20L);
		enterUrl(url);
		Pages.loadAllPages(b.driver);
		Pages.lp.login(username, password);

	}
	@After
	public void testLogoff() {
		Pages.ip.logout();
	}
}
