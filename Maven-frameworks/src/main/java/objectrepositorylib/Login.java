package objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitme.genriclib.FileLib;

/**
 * @author Vikraman
 */
public class Login {
	public FileLib flib = new FileLib();
	@FindBy(id = "username")
	private WebElement userNameEdit;
	@FindBy(name = "pwd")
	private WebElement passwordEdit;
	@FindBy(id = "loginButton")
	private WebElement logInButton;

	public void logInApp() throws Throwable {
		userNameEdit.sendKeys(flib.getPropertyKeyValue("username"));

		passwordEdit.sendKeys(flib.getPropertyKeyValue("password"));

		logInButton.click();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
