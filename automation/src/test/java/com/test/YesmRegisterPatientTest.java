package com.test;

import com.businessutils.BaseUtil;
import com.businessutils.UtilRegisterPatient;
import com.excelutils.ExcelUtil;

public class YesmRegisterPatientTest extends BaseUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rowCount=ExcelUtil.getRowCount();
		
		for(int i=1; i<rowCount; i++) {
			
			String name=ExcelUtil.getStringData(i,0);
			String dob=ExcelUtil.getDateData(i,1);
			String email=ExcelUtil.getStringData(i,2);
			String newPassword=ExcelUtil.getStringData(i,3);
			String confirmPassword=ExcelUtil.getStringData(i, 4);
			String phone=""+ExcelUtil.getNumData(i,5);
			String gender=ExcelUtil.getStringData(i,6);
			String address=ExcelUtil.getStringData(i,7);
		
		BaseUtil.openBrowser();
		UtilRegisterPatient.register(name, dob, newPassword, email, confirmPassword, phone, gender, address);
		BaseUtil.closeBrowser();
		}
	}

}
