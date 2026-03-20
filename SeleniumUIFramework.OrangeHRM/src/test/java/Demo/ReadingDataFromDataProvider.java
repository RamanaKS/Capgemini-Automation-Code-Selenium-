package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromDataProvider {
	@DataProvider(name = "SampleData")
	Object[][] getdata() {
		return new Object[][] { { "Browser", "chrome" }, { "username", "Admin" }, { "password", "admin123" }

		};
	}

	@DataProvider(name = "SampleData-1")
	Object[][] getdata1() {
		return new Object[][] { { "Browser", "chrome", "1" }, { "username", "Admin", "2" },
				{ "password", "admin123", "3" }

		};
	}

	@Test(dataProvider = "SampleData-1")
	public void readingFromDataProvider1(String key, String value, String data) {
		System.out.println("My key is:" + key + "=======>>> My Value is:" + value + "==========>> My data is:" + data);
	}

	@Test(dataProvider = "SampleData")
	public void readingFromDataProvider(String key, String value) {
		System.out.println("My key is:" + key + "=======>>> My Value is:" + value);
	}
}
