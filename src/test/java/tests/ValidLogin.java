package tests;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.ExcelData;
import pages.LoginPage;

public class ValidLogin extends BaseTest
{
    @Test
	public void ValidLogIn() 
     {
    	 String un = ExcelData.getData(file_path, "TC1", 1, 0);
    	 String pw = ExcelData.getData(file_path, "TC1", 1, 1);
    	 LoginPage lp = new LoginPage(driver);
    	 lp.EnterUserName(un);
    	 lp.EnterPassword(pw);
    	 lp.ClickOnConnectionButton();
     }
}
