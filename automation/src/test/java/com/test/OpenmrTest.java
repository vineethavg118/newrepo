package com.test;

import com.businessutils.BaseUtil;
import com.businessutils.UtilOpenemrLogin;
import com.pagerepository.AddPatient;

public class OpenmrTest extends BaseUtil {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BaseUtil.openBrowser();
		UtilOpenemrLogin.Adminlogin();
		Thread.sleep(3000);
		AddPatient.newPatient();
		Thread.sleep(2000);
		BaseUtil.closeBrowser();
		
		
		

	}

}
