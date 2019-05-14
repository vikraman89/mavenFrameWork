package com.acttime.createNewTask;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitme.genriclib.BaseClass;

import objectrepositorylib.CreateCustomer;
import objectrepositorylib.CreateNewTask;
import objectrepositorylib.HomePage;
import objectrepositorylib.OpenTask;
import objectrepositorylib.ProjectAndCustomer;

public class TaskTest extends BaseClass{
@Test
public void createTaskTest() throws Throwable{
	/* read data from Excel */
	String customerName = flib.getExcelData("Sheet1", 4, 2);
	String customerDescription = flib.getExcelData("Sheet1", 4, 3);
	String projectName=flib.getExcelData("Sheet1", 10, 1);
	String taskName=flib.getExcelData("Sheet1", 10, 2);
	String deadMonth=flib.getExcelData("Sheet1", 10, 3);
	String deadDate=flib.getExcelData("Sheet1", 10, 4);
	String typeOfTesting=flib.getExcelData("Sheet1", 10, 5);
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
	/*click on create customer button*/
	OpenTask opT=PageFactory.initElements(driver, OpenTask.class);
	opT.clickCreateTasksButton();
	/*click on create task button*/
	opT.clickCreateTasksButton();
	/*select the type of customer*/
	CreateNewTask createNewTask=PageFactory.initElements(driver, CreateNewTask.class);
	createNewTask.selectDropDown(customerName);
	createNewTask.newProject(projectName);
	createNewTask.enterTaskNameEdit1(taskName);
	createNewTask.nonBillableSelect(typeOfTesting);
	createNewTask.CheckBox();
	createNewTask.createTaskButton();
	
	
	
}
}
