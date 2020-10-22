package com.businessutils;

import com.configutil.Config;
import com.pagerepository.YesmLogin;

public class UtilYesmLogin extends YesmLogin{
	
	public static void login() {
		
		YesmLogin.gotosite(Config.get("mycare"));
		YesmLogin.enterUsername(Config.get("patient"));
		YesmLogin.enterPassword(Config.get("ppword"));
		YesmLogin.clickLogIn();
		YesmLogin.clickTreatmentHistory();
	}
	
	
	
	

}
