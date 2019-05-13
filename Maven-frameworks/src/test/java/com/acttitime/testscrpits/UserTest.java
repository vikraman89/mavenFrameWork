package com.acttitime.testscrpits;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitme.genriclib.BaseClass;

import objectrepositorylib.AddUserPage;
import objectrepositorylib.HomePage;
import objectrepositorylib.UsersList;

/**
 * @author Vikraman
 */
@Listeners(com.actitme.genriclib.ListenerImpClass.class)
public class UserTest extends BaseClass{
	@Test
	public void userTestData() throws Throwable{
		/* read the data from excel */
		String firstName=flib.getExcelData("Sheet1", 7, 2);
		String lastName=flib.getExcelData("Sheet1", 7, 3);
		String emailId=flib.getExcelData("Sheet1", 7, 6);
		String userName=flib.getExcelData("Sheet1", 7, 4);
		String password=flib.getExcelData("Sheet1", 7, 5);
		String rePassword=flib.getExcelData("Sheet1", 7, 5);
		/*navigate to user page*/
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.ClickOnUsersImg();
		/*click on addUser Button*/
		UsersList userL=PageFactory.initElements(driver, UsersList.class);
		userL.clickAddUserButton();
		/*enter the user details*/
		AddUserPage addusrpage=PageFactory.initElements(driver, AddUserPage.class);
		addusrpage.firstNameEdit(firstName);
		addusrpage.lastNameEdit(lastName);
		addusrpage.emailFieldEdit(emailId);
		addusrpage.userNameEdit(userName);
		addusrpage.passwordEdit(password);
		addusrpage.retypePassword(rePassword);
		addusrpage.createUserButton();
	}
}
