package com.businessutils;

import com.configutil.Config;
import com.pagerepository.OpenemrLogin;

public class UtilOpenemrLogin extends OpenemrLogin {
	
	
	public static void Adminlogin() {
		
		OpenemrLogin.gotosite(Config.get("openemr"));
		OpenemrLogin.enterUsername(Config.get("username"));
		OpenemrLogin.enterPassword(Config.get("password"));
		OpenemrLogin.clickLogIn();
	}

}
