package objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersList {
@FindBy(xpath="//div[text()='Add User']")
private WebElement addUserButton;
public void clickAddUserButton(){
	addUserButton.click();
}
}
