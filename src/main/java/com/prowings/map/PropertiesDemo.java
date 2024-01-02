package com.prowings.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String resourcePath = Thread.currentThread().getContextClassLoader().getResource("").getPath()+"app.properties";
		
		Properties properties = new Properties();
		
		properties.load(new FileInputStream(resourcePath));
		
//		String username = "abc123"; //hardcoded
		
		String username = properties.getProperty("username");
		System.out.println(username);

		String url = properties.getProperty("url");
		System.out.println(url);
		
		String pwd = properties.getProperty("password");
		System.out.println(pwd);
		
		properties.setProperty("url", "qqqq");
		
		System.out.println(properties);
		
		Enumeration<Object> keys = properties.keys();
		
		while(keys.hasMoreElements())
			System.out.println(keys.nextElement());

		System.out.println("?????? Iterating all values ?????????");
		Enumeration<Object> vals = properties.elements();
		
		while(vals.hasMoreElements())
			System.out.println(vals.nextElement());
		
		//Remember put(k,v) is strongly disagreed to use on properties.!! 
//		properties.put("hello", null); //this will result in NPE as null key and null values are not alowed
		
	}

}
