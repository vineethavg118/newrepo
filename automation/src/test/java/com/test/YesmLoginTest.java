package com.test;

import com.businessutils.BaseUtil;
import com.businessutils.UtilYesmLogin;

public class YesmLoginTest extends BaseUtil {
	
	public static void main (String[] args) {
		
		BaseUtil.openBrowser();
		UtilYesmLogin.login();
		BaseUtil.closeBrowser();
		
	}

}
