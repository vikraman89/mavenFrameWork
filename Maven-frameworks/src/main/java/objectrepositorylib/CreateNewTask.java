package objectrepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitme.genriclib.BaseClass;
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
	@FindBy(xpath="//div[@class='buttonIcon']/span[text()='Create Tasks']")
	private WebElement createTaskButton;
   public void selectDropDown(String customerName){
	   selectDropDown.click();
	   String exsistingCustomer="//a[text()='"+customerName+"']";
	   BaseClass.driver.findElement(By.xpath(exsistingCustomer)).click();
   }
   public void newProject(String projectName){
	   newProject.sendKeys(projectName);
   }
   public void enterTaskNameEdit1(String taskName){
	   enterTaskNameEdit1.sendKeys(taskName);
   }
   public void desLineCalender(String deadMonth,String deadDate){
	   
   }
   public void nonBillableSelect(String typeOfTesting) {
	   nonBillableSelect.click();
	   wLib.Select(nonBillableSelect, typeOfTesting);
   }
   public void CheckBox(){
	   CheckBox.click();
   }
   public void createTaskButton() {
	   createTaskButton.click();
   }
}
