package com.configutil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
	    
	public static String get(String keyname) {
		
		 FileReader file= null;
		try {
			 file = new FileReader("D:\\API testing\\automation\\src\\main\\java\\com\\configutil\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties p= new Properties();
		try {
			p.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (String) p.get(keyname);
		
		
	}

}
