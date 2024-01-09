package com.prowings.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String resourcePath = Thread.currentThread().getContextClassLoader().getResource("").getPath()+"app.properties";
		
		Properties properties = new Properties();
		
		properties.load(new FileInputStream(resourcePath));
		
//		properties.put(null, "aaa"); //null "null"
		properties.setProperty(null, "aaa");
		System.out.println(properties);
	}

}
