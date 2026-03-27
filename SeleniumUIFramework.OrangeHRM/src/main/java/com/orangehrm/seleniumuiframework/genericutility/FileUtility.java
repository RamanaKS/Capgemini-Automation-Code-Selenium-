package com.orangehrm.seleniumuiframework.genericutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	FileInputStream fis;
	Properties prop;
	FileOutputStream fos;

	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/orangehrm.CommonData/CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

	public void setProperty(String key, String value) throws IOException {
		fos = new FileOutputStream("./src/test/resources/orangehrm.CommonData/CommonData.properties");
		prop = new Properties();
		prop.setProperty(key, value);
		prop.store(fos, "Updated Common Data");
		fos.close();
	}
}
