package objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage {
	@FindBy(id = "userDataLightBox_firstNameField")
	private WebElement firstNameEdit;
	@FindBy(id = "userDataLightBox_lastNameField")
	private WebElement lastNameEdit;
	@FindBy(id = "userDataLightBox_emailField")
	private WebElement emailFieldEdit;
	@FindBy(id = "userDataLightBox_usernameField")
	private WebElement userNameEdit;
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement passwordEdit;
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement retypePassword;
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement createUserButton;
	
	public void firstNameEdit(String firstName){
		firstNameEdit.sendKeys(firstName);
	}
	public void lastNameEdit(String lastName){
		lastNameEdit.sendKeys(lastName);
	}
	public void emailFieldEdit(String emailId){
		emailFieldEdit.sendKeys(emailId);
	}
	public void userNameEdit(String userName){
		userNameEdit.sendKeys(userName);
	}
	public void passwordEdit(String password){
		passwordEdit.sendKeys(password);
	}
	public void retypePassword(String rePassword){
		retypePassword.sendKeys(rePassword);
	}
	public void createUserButton(){
		createUserButton.click();
	}
}
