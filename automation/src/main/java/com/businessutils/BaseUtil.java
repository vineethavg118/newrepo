package com.businessutils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.configutil.Config;

public class BaseUtil {
	
	
	public static WebDriver driver=null;
	
        public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\API downloads\\chromedriver.exe");
		
		driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS );
		
		driver.get(Config.get("url"));
		
	}
        public static void closeBrowser() {
        	driver.close();
        	driver.quit();
        }
	

}
