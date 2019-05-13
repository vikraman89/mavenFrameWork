package objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Vikraman
 */
public class OpenTask {
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement createTasksButton;
	@FindBy(xpath = "//a[text()='Projects & Customers']")
	private WebElement projectAndCustomerLink;
	
	public void clickCreateTasksButton(){
		createTasksButton.click();
	}

	public void clickOnProjectAndCustomer() {
		projectAndCustomerLink.click();
	}

}
