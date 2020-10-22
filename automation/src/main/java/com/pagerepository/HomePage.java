package com.pagerepository;

import org.openqa.selenium.By;

import com.businessutils.BaseUtil;

public class HomePage extends BaseUtil {
	
	public static void clickSignIn() {
		driver.findElement(By.linkText("Log In")).click();
		// clickOnSignIn.click();

}

	
}