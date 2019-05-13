package com.acttitime.testscrpits;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitme.genriclib.BaseClass;

import objectrepositorylib.OpenTask;

public class TaskTest extends BaseClass{
@Test
public void createTaskTest(){
	/*click on create customer button*/
	OpenTask opT=PageFactory.initElements(driver, OpenTask.class);
	opT.clickCreateTasksButton();
	/**/
	
}
}
