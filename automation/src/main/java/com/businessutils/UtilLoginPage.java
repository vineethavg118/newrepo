package com.businessutils;

import com.configutil.Config;
import com.pagerepository.LoginPage;

public class UtilLoginPage extends LoginPage {
	
	    
	
	public static void login(String userName) {
	
		LoginPage.enterUserName(userName);
		LoginPage.clickOnContinue();
		LoginPage.enterPassword(Config.get("pwd"));
		LoginPage.clickOnLogIn();
		LoginPage.printErrorMessage();
		
		
	}

}
