package com.pagerepository;

import org.openqa.selenium.By;

import com.businessutils.BaseUtil;

public class YesmLogin extends BaseUtil {
	
	public static void gotosite(String url) {
		driver.get(url);
	}
	
	public static void enterUsername(String username) {
		driver.findElement(By.id("loginEmail")).sendKeys(username);
	}
	
	public static void enterPassword(String password) {
		driver.findElement(By.id("loginPassword")).sendKeys(password);
	}
	
	public static void clickLogIn() {
		driver.findElement(By.id("loginUserName")).click();
		
	}
	
	public static void clickTreatmentHistory() {
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/nav/div/ul[3]/li/a")).click();
	}
	
	

}
