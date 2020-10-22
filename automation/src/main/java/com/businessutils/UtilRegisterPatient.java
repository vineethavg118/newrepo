package com.businessutils;

import com.configutil.Config;
import com.pagerepository.HomePage;
import com.pagerepository.RegisterPatient;
import com.pagerepository.YesmLogin;

public class UtilRegisterPatient extends RegisterPatient {
	
	
	public static void register(String name, String dob, String newPassword, String email, String confirmPassword, String phone, String gender, String address) {
		
		
		
		YesmLogin.gotosite(Config.get("mycare"));
		RegisterPatient.enterName(name);
		RegisterPatient.enterBirthdate(dob);
		RegisterPatient.enterPasssword(newPassword);
		RegisterPatient.enterConfirmPassword(confirmPassword);
		RegisterPatient.enterEmail(email);
		RegisterPatient.enterPhone(phone);
		RegisterPatient.enterAddress(address);
		RegisterPatient.clickSignUp();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
