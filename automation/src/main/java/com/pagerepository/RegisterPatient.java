package com.pagerepository;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.businessutils.BaseUtil;

public class RegisterPatient extends BaseUtil {
	
	
	public static void enterName(String name) {
		driver.findElement(By.id("sName")).sendKeys(name);
	}
	
	public static void enterBirthdate(String dob) {
		driver.findElement(By.id("sBirthDate")).sendKeys(dob);
	}
	
	public static void enterEmail(String email) {
		driver.findElement(By.id("sEmail")).sendKeys(email);
	}
	
	public static void enterPasssword(String newPassword) {
		driver.findElement(By.id("sPassword")).sendKeys(newPassword);
	}
	
	public static void enterConfirmPassword(String confirmPassword) {
		driver.findElement(By.id("scPassword")).sendKeys(confirmPassword);
	}
	
	public static void enterPhone(String phone) {
		driver.findElement(By.id("Phone")).sendKeys(phone);
	}
	
	public static void enterSex(String gender) {
		Select sex=new Select(driver.findElement(By.xpath("//div[@class='form-group']")));
		sex.selectByVisibleText(gender);
	}
	public static void enterAddress(String address) {
		driver.findElement(By.id("Address")).sendKeys(address);
	}
	
	public static void clickSignUp() {
		driver.findElement(By.name("ctl15")).click();
	}
	
	
	
	
}
