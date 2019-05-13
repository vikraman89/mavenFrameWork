package objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Vikraman
 */
public class CreateCustomer {
	@FindBy(id = "customerLightBox_nameField")
	private WebElement customerNameEditBox;
	@FindBy(id = "customerLightBox_descriptionField")
	private WebElement discriptionEditBox;
	@FindBy(xpath = "//span[@class='buttonTitle' and text()='Create Customer']")
	private WebElement createCustomerButton;

	public void createCustomer(String customerName) {
		customerNameEditBox.sendKeys(customerName);
		createCustomerButton.click();
	}

	public void CreateCustomerWithDescription(String customerName, String customerDescription) {
		customerNameEditBox.sendKeys(customerName);
		discriptionEditBox.sendKeys(customerDescription);
		createCustomerButton.click();
	}

}
