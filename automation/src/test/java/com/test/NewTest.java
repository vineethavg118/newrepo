package com.test;

import org.testng.annotations.Test;

import com.businessutils.BaseUtil;
import com.businessutils.UtilLoginPage;
import com.excelutils.ExcelUtil;
import com.pagerepository.HomePage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  int rowcount=ExcelUtil.getRowCount();
		
		for (int i=1;i<rowcount;i++) {
			String userName=ExcelUtil.getStringData(i, 0);	
			HomePage.clickSignIn();
	        UtilLoginPage.login(userName);
		}
  }
  @BeforeTest
  public void beforeTest() {		
      BaseUtil.openBrowser();
  }

  @AfterTest
  public void afterTest() {
      BaseUtil.closeBrowser();
  }

}
