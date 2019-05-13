package objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitme.genriclib.WebDriverCommonLib;

/**
 * @author Vikraman
 */
public class CreateNewTask {
	public WebDriverCommonLib wLib=new WebDriverCommonLib();
	@FindBy(xpath="//button[@class='x-btn-text' and text()='- Select Customer -']")
	private WebElement selectDropDown;
	@FindBy(id="createTasksPopup_newCustomer")
	private WebElement newCustomer;
	@FindBy(xpath="//button[@class='x-btn-text' and text()='- Select Project -']")
	private WebElement projectDropDown;
	@FindBy(id="createTasksPopup_newProject")
	private WebElement newProject;
	@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder'])[1]")
	private WebElement enterTaskNameEdit1;
	@FindBy(xpath="(//button[text()='set deadline'])[1]")
	private WebElement desLineCalender;
	@FindBy(xpath="(//button[text()='Non-Billable'])[1]")
	private WebElement nonBillableSelect;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement CheckBox;
	
   public void newCustomer(){
	   newCustomer.sendKeys();
   }
   public void newProject(){
	   newProject.sendKeys();
   }
   public void enterTaskNameEdit1(){
	   enterTaskNameEdit1.sendKeys();
   }
   public void desLineCalender(){
	   
   }
   public void CheckBox(){
	   CheckBox.click();
   }
}
