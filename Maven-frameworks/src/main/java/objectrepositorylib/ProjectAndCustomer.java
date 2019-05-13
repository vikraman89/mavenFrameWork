package objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Vikraman
 */
public class ProjectAndCustomer {
	@FindBy(xpath = "//span[text()='Create Customer']")
	private WebElement createCustomerButton;
	@FindBy(xpath = "//span[@class='successmsg']")
	private WebElement successMessage;

	public void createCustomerButton() {
		createCustomerButton.click();
	}

	public WebElement getSuccessMessage() {
		return successMessage;
	}
}
