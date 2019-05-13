package com.acttitime.testscrpits;

import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitme.genriclib.BaseClass;

import objectrepositorylib.CreateCustomer;
import objectrepositorylib.HomePage;
import objectrepositorylib.OpenTask;
import objectrepositorylib.ProjectAndCustomer;

/**
 * @author Vikraman
 */
@Listeners(com.actitme.genriclib.ListenerImpClass.class)
public class CustomerTest extends BaseClass {
	@Test
	public void CreateCustomerTest() throws Throwable {
		/* read data from Excel */
		String customerName = flib.getExcelData("Sheet1", 1, 2);
		/* navigate to task page */
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.clickOnTaskImage();
		/* navigate to project and Customer page */
		OpenTask oP = PageFactory.initElements(driver, OpenTask.class);
		oP.clickOnProjectAndCustomer();
		/* navigate to create customer page */
		ProjectAndCustomer pAC = PageFactory.initElements(driver, ProjectAndCustomer.class);
		pAC.createCustomerButton();
		/* create customer */
		CreateCustomer cc = PageFactory.initElements(driver, CreateCustomer.class);
		cc.createCustomer(customerName);
		/* verify customer */
		String actSuccessMsg = pAC.getSuccessMessage().getText();
		boolean status = actSuccessMsg.contains("successfully created");
		org.testng.Assert.assertTrue(status);
	}

	@Test
	public void CreateCustomerWithDescription() throws Throwable {
		/* read data from Excel */
		String customerName = flib.getExcelData("Sheet1", 4, 2);
		String customerDescription = flib.getExcelData("Sheet1", 4, 3);
		/* navigate to task page */
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.clickOnTaskImage();
		/* navigate to project and Customer page */
		OpenTask op = PageFactory.initElements(driver, OpenTask.class);
		op.clickOnProjectAndCustomer();
		/* navigate to create customer page */
		ProjectAndCustomer pac = PageFactory.initElements(driver, ProjectAndCustomer.class);
		pac.createCustomerButton();
		/* create customer */
		CreateCustomer cc = PageFactory.initElements(driver, CreateCustomer.class);
		cc.CreateCustomerWithDescription(customerName, customerDescription);
		/* verify customer */
		String actSucessMessage = pac.getSuccessMessage().getText();
		boolean status = actSucessMessage.contains(actSucessMessage);
		Assert.assertTrue(status);
	}

}
