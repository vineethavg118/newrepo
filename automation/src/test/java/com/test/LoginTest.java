package com.test;

import com.businessutils.BaseUtil;
import com.businessutils.UtilLoginPage;
import com.excelutils.ExcelUtil;
import com.pagerepository.HomePage;

public class LoginTest extends BaseUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int rowcount=ExcelUtil.getRowCount();
		
		for (int i=1;i<rowcount;i++) {
			String userName=ExcelUtil.getStringData(i, 0);	
		
		
        BaseUtil.openBrowser();
  	    HomePage.clickSignIn();
        UtilLoginPage.login(userName);
        BaseUtil.closeBrowser();
		}
	}

}
