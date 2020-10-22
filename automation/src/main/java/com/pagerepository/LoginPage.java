package com.pagerepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.businessutils.BaseUtil;

public class LoginPage extends BaseUtil {

	// WebElement clickOnSignIn= driver.findElement(By.linkText("Log In"));
	// WebElement txtUsername=
	// driver.findElement(By.xpath("//input[@id='usernameOrEmail']"));
	// WebElement
	// btnContinue=driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button"));
	// WebElement txtPassword=driver.findElement(By.id("password"));
	// WebElement
	// btnLogIn=driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button"));
	// WebElement
	// errorMessage=driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[1]/div/div[2]"));
	
    	 

	public static void enterUserName(String username) {
		driver.findElement(By.xpath("//input[@id='usernameOrEmail']")).sendKeys(username);
		// txtUsername.sendKeys(username);
	}

	public static void clickOnContinue() {
		driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button")).click();
		// btnContinue.click();
	}

	public static void enterPassword(String password) {
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(password);

	}

	public static void clickOnLogIn() {
		WebElement btnLogIn = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button"));

		btnLogIn.click();
	}

	public static void printErrorMessage() {
		WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[1]/div/div[2]"));
		String error = errorMessage.getText();
		System.out.println(error);
	}

}

