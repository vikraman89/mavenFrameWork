package objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Vikraman
 */
public class HomePage {
	@FindBy(xpath = "//div[text()='TASKS']")
	private WebElement taskImg;
	@FindBy(xpath = "//div[text()='REPORTS']")
	private WebElement reportImg;
	@FindBy(xpath = "//div[text()='USERS']")
	private WebElement usersImg;
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;

	public void clickOnTaskImage() {
		try{
		taskImg.click();
		}
		catch(Exception e){
			
		}
	}

	public void ClickOnReportsImg() {
		reportImg.click();
	}

	public void ClickOnUsersImg() {
		usersImg.click();
	}

	public void clickOnLogOut() {
		logoutLink.click();
	}
}
