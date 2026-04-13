package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	private static final String FILE_PATH = "./src/test/resources/orangehrm.CommonData/CommonData.properties";

	public String getPropertyKeyValue(String key) throws IOException {
		try (FileInputStream fis = new FileInputStream(FILE_PATH)) {
			Properties prop = new Properties();
			prop.load(fis);
			return prop.getProperty(key);
		}
	}

	public void setProperty(String key, String value) throws IOException {
		Properties prop = new Properties();
		try (FileInputStream fis = new FileInputStream(FILE_PATH)) {
			prop.load(fis);
		}
		prop.setProperty(key, value);
		try (FileOutputStream fos = new FileOutputStream(FILE_PATH)) {
			prop.store(fos, "Updated Common Data");
		}

	}
}
