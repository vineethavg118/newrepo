package com.pagerepository;

import org.openqa.selenium.By;

import com.businessutils.BaseUtil;

public class OpenemrLogin extends BaseUtil {
	
	public static void gotosite (String url) {
		driver.get(url);
	}
	
	public static void enterUsername(String username) {
		driver.findElement(By.id("authUser")).sendKeys(username);
	}
	
	public static void enterPassword(String password){
		driver.findElement(By.id("clearPass")).sendKeys(password);
	}
	
	public static void clickLogIn() {
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	}
	
	
	

}
