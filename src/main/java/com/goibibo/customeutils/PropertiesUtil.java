package com.goibibo.customeutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	static Properties pro = new Properties();

	public static String getLocators(String locatorName) {
		String value = "";
		FileInputStream fis;
		try {
			fis = new FileInputStream("./../src/main/resources/ObjectRepository.properties");
			pro.load(fis);
			value = (String) pro.get(locatorName);

		} catch (FileNotFoundException e) {
			System.err.println("Object Repository not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Unable to load Proprties File");
		}
		return value;

	}

}
