package com.pagerepository;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.businessutils.BaseUtil;

public class AddPatient extends BaseUtil { 
	

		//driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[1]/div")).click();	
	
	public static void newPatient() throws InterruptedException {
		//driver.findElement(By.id("create_patient_btn1")).click();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Patient/Client']"))).perform();
		driver.findElement(By.xpath("//div[text()='New/Search']")).click();
	
		driver.switchTo().frame("pat");
		Select title = new Select(driver.findElement(By.id("form_title")));
		title.selectByVisibleText("Ms.");
		
		driver.findElement(By.id("form_fname")).sendKeys("Anu");
		driver.findElement(By.id("form_lname")).sendKeys("Xavior");
		
		driver.findElement(By.id("form_DOB")).click();
		
        Thread.sleep(3000);
		
		
		driver.findElement(By.id("form_DOB")).sendKeys("2020-08-14");
		
		Select sex = new Select(driver.findElement(By.id("form_sex")));
		sex.selectByVisibleText("Female");
		Thread.sleep(3000);
		driver.findElement(By.id("create")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.id("modalframe")));
		driver.findElement(By.xpath("/html/body/center/input")).click();
		

		act.moveToElement(driver.findElement(By.id("username"))).perform();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		
		
		
	}
	
	

}
